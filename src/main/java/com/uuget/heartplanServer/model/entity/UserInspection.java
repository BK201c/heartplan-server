package com.uuget.heartplanServer.model.entity;

import lombok.Data;

import java.util.Date;

@Data
public class UserInspection {
    private Integer id;
    private Integer uid;
    private Integer inpectionId;
    private Date inspectionTime;
    private Date createdAt;
    private Date updatedAt;
}
