package com.uuget.heartplanServer.model.entity;

import lombok.Data;

@Data
public class UserToken {
  private Integer uid;
  private String accessToken;
  private String expiredTime;
  private String updatedTime;
}
