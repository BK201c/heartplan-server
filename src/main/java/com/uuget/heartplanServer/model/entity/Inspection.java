package com.uuget.heartplanServer.model.entity;

import lombok.Data;

@Data
public class Inspection {
    private Integer id;
    private String name;
    private String remark;
    private String location;
    private String manager;
    private String contact;
}
