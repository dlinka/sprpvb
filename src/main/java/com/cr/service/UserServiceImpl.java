package com.cr.service;

import com.cr.dao.UserDAO;
import com.cr.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    public User getUserByUserId(Integer userId) {
        return userDAO.findUserById(userId);
    }

    @Override
    public User getUserByUsername(String username) {
        List<User> userList = userDAO.findUserByColumn("username", username);
        return CollectionUtils.isEmpty(userList) ? null : userList.get(0);
    }

}
