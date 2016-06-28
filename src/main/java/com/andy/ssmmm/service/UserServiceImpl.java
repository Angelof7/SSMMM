package com.andy.ssmmm.service;

import com.andy.ssmmm.dao.UserDao;
import com.andy.ssmmm.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by andy on 16/6/27.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public User selectUserById(Integer userId) {
        return userDao.selectUserById(userId);
    }
}
