package com.uuget.heartplanServer.service;

import org.apache.ibatis.annotations.Param;

import com.uuget.heartplanServer.model.entity.User;

public interface UserService {
    /**
     * 根据id查询用户
     * 
     * @param id
     * @return
     */
    User getUserById(Integer id);

    /**
     * 根据微信openid查询用户
     * 
     * @param wechatOpenid
     * @return
     */
    User getUserByWechatOpenid(String wechatOpenid);

    /**
     * 根据用户名和密码查询用户
     * 
     * @param username
     * @param password
     * @return
     */
    User getByUsernameAndPwd(@Param("username") String username, @Param("password") String password);

}
