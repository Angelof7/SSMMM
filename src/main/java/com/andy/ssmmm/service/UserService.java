package com.andy.ssmmm.service;

import com.andy.ssmmm.domain.User;

/**
 * Created by andy on 16/6/27.
 */
public interface UserService {
    /**
     *
     * @param userId
     * @return User
     */
    User selectUserById(Integer userId);
}
