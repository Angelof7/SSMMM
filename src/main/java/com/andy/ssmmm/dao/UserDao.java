package com.andy.ssmmm.dao;

import com.andy.ssmmm.domain.User;

/**
 * Created by andy on 16/6/27.
 */
public interface UserDao {
    /**
     * @param userId
     * @return User
     */
    User selectUserById(Integer userId);
}
