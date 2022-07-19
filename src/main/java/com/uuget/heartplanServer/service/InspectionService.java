package com.uuget.heartplanServer.service;

import com.uuget.heartplanServer.model.entity.Inspection;

public interface InspectionService {
  /**
   * 根据id查询检查信息
   * 
   * @param inspection
   * @return
   */
  Inspection getInspectionById(Long id);

  /**
   * 根据检测名称查询检查信息
   * 
   * @param userId
   * @return
   */
  Inspection getInspectionByName(String name);
}
