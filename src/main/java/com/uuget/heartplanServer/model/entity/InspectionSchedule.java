package com.uuget.heartplanServer.model.entity;

import java.util.Date;

import lombok.Data;

@Data
public class InspectionSchedule {
  private Long id;
  private Long inspectionId;
  private Date openDate;
  private Integer stock_num;
  private String startTime;
  private String endTime;
}
