package com.uuget.heartplanServer.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uuget.heartplanServer.service.UserService;

@RestController
@RequestMapping("/api/v1")
public class UserController {
  @Resource
  private UserService userService;

}
