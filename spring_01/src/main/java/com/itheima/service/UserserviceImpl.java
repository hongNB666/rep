package com.itheima.service;

import com.itheima.dao.Stu;
import com.itheima.dao.Userdao;
import com.itheima.domain.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: Hzb
 * @CreateDate: 2019/3/13 18:53
 * @Version: 1.0
 */
public class UserserviceImpl implements Userservice {

private Userdao userdao;

private Stu stu;

   public void setStu(Stu stu) {
        this.stu = stu;
    }

    public void setUserdao(Userdao userdao) {
        this.userdao = userdao;
    }

    public void eat() {
        userdao.show();
        System.out.println("hehe");
    }


    public List<User> findAll() {
        return stu.findAll();
    }
}
