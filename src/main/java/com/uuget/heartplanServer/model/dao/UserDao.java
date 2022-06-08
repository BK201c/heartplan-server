package com.uuget.heartplanServer.model.dao;

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
     * @param name 用户名
     * @return User
     */
    User getByName(String name);

    /**
     *
     * @param openid wechat openid
     * @return User
     */
    User getByWechatOpenid(String openid);

}
