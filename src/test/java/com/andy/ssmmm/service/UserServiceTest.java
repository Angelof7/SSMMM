package com.andy.ssmmm.service;

import com.andy.ssmmm.baseTest.SpringTestCase;
import com.andy.ssmmm.domain.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by andy on 16/6/27.
 */
public class UserServiceTest extends SpringTestCase {
    @Autowired
    private UserService userService;

    @Test
    public void selectUserByIdTest() {
        User user = userService.selectUserById(1);
        System.out.println(user);
    }
}
