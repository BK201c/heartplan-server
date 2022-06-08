package com.uuget.heartplanServer.model.entity;

import lombok.Data;

import java.util.Date;

@Data
public class UserInspection {
    private Integer id;
    private Integer uid;
    private Integer inpection_id;
    private Date inspection_time;
    private Date createdAt;
}
