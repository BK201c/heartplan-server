package com.uuget.heartplanServer.utils;

public enum ResultCodeEnum {
  /**
   * 调用成功
   */
  SUCCESS(0, "成功"),

  /**
   * 调用失败
   */
  FAIL(-1, "失败");

  /**
   * 返回编码
   */
  private Integer code;

  /**
   * 编码对应的消息
   */
  private String message;

  ResultCodeEnum(Integer code, String message) {
    this.code = code;
    this.message = message;
  }

  /**
   * 获取枚举类型的编码值
   */
  public Integer code() {
    return this.code;
  }

  /**
   * 获取枚举类型的编码含义
   */
  public String message() {
    return this.message;
  }

  /**
   * 根据枚举名称--获取枚举编码
   */
  public static Integer getCode(String name) {
    for (ResultCodeEnum resultCode : ResultCodeEnum.values()) {
      if (resultCode.name().equals(name)) {
        return resultCode.code;
      }
    }
    return null;
  }

  /*
   * public static void main(String[] args) {
   * System.out.println(ResultCodeEnum.FAIL.code());
   * System.out.println(ResultCodeEnum.SUCCESS.message());
   * System.out.println(ResultCodeEnum.getCode("SUCCESS"));
   * }
   */
}
