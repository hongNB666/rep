package com.itheima.dao;

import com.itheima.domain.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: Hzb
 * @CreateDate: 2019/3/13 20:13
 * @Version: 1.0
 */

public class StuImpl implements Stu {
    private JdbcTemplate template;

   public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public List<User> findAll() {
        String sql="select * from user";
        return  template.query(sql,new BeanPropertyRowMapper<User>(User.class));

    }
}
