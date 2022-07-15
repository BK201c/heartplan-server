package com.uuget.heartplanServer.model.entity;

import java.util.Date;

import lombok.Data;

@Data
public class InspectionSchedule {
  private Long id;
  private Integer inspectionId;
  private Date openDate;
  private String startTime;
  private String endTime;
}
