package com.cr.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Proverb implements Serializable {

    private Integer proverbId;
    private String content;
    private Integer star;
    private Timestamp createTime;
    private Timestamp updateTime;

}
