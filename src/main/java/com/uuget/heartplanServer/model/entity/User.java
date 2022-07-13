package com.uuget.heartplanServer.model.entity;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String wechat_openid;
    private String name;
    private String phone;
    private String age;
    private String sex;
    private String password;
    private String createdAt; // 创建时间
    private String updatedAt; // 更新时间
}
