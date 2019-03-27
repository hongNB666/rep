package com.itheima.iu;

import com.itheima.service.Userservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * @Description: java类作用描述
 * @Author: Hzb
 * @CreateDate: 2019/3/13 18:54
 * @Version: 1.0
 */
public class ServletTest {
    public static void main(String[] args) throws SQLException {
        /*ApplicationContext ac=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Userservice userservice = (Userservice) ac.getBean("userservice");
        userservice.eat();*/
        ApplicationContext ac=new ClassPathXmlApplicationContext("ApplicationContext.xml");
       Userservice userService = (Userservice) ac.getBean("userService");
        userService.eat();



    }
}
