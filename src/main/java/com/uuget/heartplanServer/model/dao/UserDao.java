package com.uuget.heartplanServer.model.dao;

import org.apache.ibatis.annotations.Param;

import com.uuget.heartplanServer.model.entity.User;

public interface UserDao {
    /**
     *
     * @param id 主键
     * @return User
     */
    User getById(Integer id);

    /**
     *
     * @param openid wechat openid
     * @return User
     */
    User getByWechatOpenid(String openid);

    /**
     *
     * @param name 用户名
     * @return User
     */
    User getByName(String name);

    /**
     *
     * @param name 用户名
     * @param pwd  密码
     * @return User
     */
    User getByUsernameAndPwd(@Param("name") String name, String pwd);
}
