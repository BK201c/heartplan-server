package com.uuget.heartplanServer.model.entity;

import lombok.Data;

@Data
public class UserToken {
  private Long uid;
  private String accessToken;
  private String expiredTime;
  private String updatedTime;
}
