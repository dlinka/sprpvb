package com.cr.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private Integer userId;
    private String username;
    private String password;
    private Timestamp createTime;
    private Timestamp updateTime;

    public User(String username) {
        this.username = username;
    }
}
