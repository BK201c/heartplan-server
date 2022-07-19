package com.uuget.heartplanServer.model.entity;

import lombok.Data;

@Data
public class Inspection {
    private Long id;
    private String name;
    private String remark;
    private String location;
    private String manager;
    private Integer contact;
}
