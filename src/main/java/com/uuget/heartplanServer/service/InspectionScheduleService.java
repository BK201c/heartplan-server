package com.uuget.heartplanServer.service;

import java.util.Date;

import com.uuget.heartplanServer.model.entity.InspectionSchedule;

public interface InspectionScheduleService {
  /**
   * 根据日期查询剩余库存
   * 
   * @param inspection
   * @return
   */
  InspectionSchedule getStockNumByDate(Date openDate);

  /**
   * 根据日期查询剩余库存
   * 
   * @param inspection
   * @return
   */
  InspectionSchedule changeStockNumByDateTime(Date openDate, Date startTime);

}
