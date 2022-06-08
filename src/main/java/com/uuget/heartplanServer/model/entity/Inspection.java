package com.uuget.heartplanServer.model.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Inspection {
    private Integer id;
    private String name;
    private Date openDate;
    private Integer maxNum;
    private String openTime;
    private String remark;
    private Integer availableNum;
}
