package com.uuget.heartplanServer.util;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

/**
 * 全局统一返回结果类
 */
@Getter
@ApiModel(value = "全局统一返回结果")
public class Result<T> {

    @ApiModelProperty(value = "响应码")
    private Integer code;

    @ApiModelProperty(value = "响应消息")
    private String message;

    @ApiModelProperty(value = "响应数据")
    private T data;

    public Result() {
    }

    protected static <T> Result<T> build(T data) {
        Result<T> result = new Result<T>();
        if (data != null)
            result.setData(data);
        return result;
    }

    public static <T> Result<T> build(T body, ResultCodeEnum resultCodeEnum) {
        Result<T> result = build(body);
        result.setCode(resultCodeEnum.getCode());
        result.setMessage(resultCodeEnum.getMessage());
        return result;
    }

    public static <T> Result<T> build(Integer code, String message) {
        Result<T> result = build(null);
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    public static <T> Result<T> success() {
        return Result.success(null);
    }

    /**
     * 操作成功
     * 
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(T data) {
        // Result<T> result = build(data);
        return build(data, ResultCodeEnum.SUCCESS);
    }

    public static <T> Result<T> fail() {
        return Result.fail(null);
    }

    /**
     * 操作失败
     * 
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> fail(T data) {
        // Result<T> result = build(data);
        return build(data, ResultCodeEnum.FAIL);
    }

    public Result<T> message(String message) {
        this.setMessage(message);
        return this;
    }

    public Result<T> code(Integer code) {
        this.setCode(code);
        return this;
    }

    public boolean isSuccess() {
        if (this.getCode().intValue() == ResultCodeEnum.SUCCESS.getCode().intValue()) {
            return true;
        }
        return false;
    }

    public Result<T> setCode(Integer code) {
        this.code = code;
        return this;
    }

    public Result<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public Result<T> setData(T data) {
        this.data = data;
        return this;
    }
}