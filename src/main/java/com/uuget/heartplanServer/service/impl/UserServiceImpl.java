package com.uuget.heartplanServer.service.impl;

import com.uuget.heartplanServer.model.entity.User;
import com.uuget.heartplanServer.service.UserService;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.uuget.heartplanServer.model.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {
  @Resource
  private UserDao UserDao;

  @Override
  public User getById(Integer id) {
    return UserDao.getById(id);
  }

}
