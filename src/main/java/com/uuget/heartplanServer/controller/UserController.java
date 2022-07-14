package com.uuget.heartplanServer.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uuget.heartplanServer.model.entity.User;
import com.uuget.heartplanServer.service.UserService;
import com.uuget.heartplanServer.util.Result;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "v1", tags = "UserController")
@RequestMapping("/api/v1")
public class UserController {
  @Resource
  private UserService userService;

  @GetMapping("/user/{id}")
  @ApiOperation(value = "获取用户信息", notes = "根据id查询")
  public Result<User> getUserById(@PathVariable("id") Integer id) {
    User user = userService.getUserById(id);
    return Result.success(user);
  }

  @GetMapping("/user/{wechat_openid}")
  @ApiOperation(value = "获取用户信息", notes = "根据微信openid查询")
  public Result<User> getUserByWechatOpenid(@PathVariable("wechat_openid") String wechatOpenid) {
    User user = userService.getUserByWechatOpenid(wechatOpenid);
    return Result.success(user);
  }

  @PostMapping("/user/login")
  @ApiOperation(value = "用户登录", notes = "根据用户名和密码查询")
  public Result<User> getByUsernameAndPwd(@Param("username") String username, @Param("password") String password) {
    User user = userService.getByUsernameAndPwd(username, password);
    return Result.success(user);
  }
}
