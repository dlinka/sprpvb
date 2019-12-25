package com.cr.service;

import com.cr.entity.User;

public interface UserService {

    User getUserByUserId(Integer userId);

    User getUserByUsername(String username);

}
