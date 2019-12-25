package com.cr.dao;

import com.cr.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDAO {

    User findUserById(Integer userId);

    List<User> findUserByColumn(@Param("column") String column, @Param("value") String value);

}
