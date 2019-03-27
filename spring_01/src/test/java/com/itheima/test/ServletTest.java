package com.itheima.test;

import com.itheima.domain.User;
import com.itheima.service.Userservice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: Hzb
 * @CreateDate: 2019/3/14 17:01
 * @Version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml"})
public class ServletTest {
    @Qualifier("Userservice")
    @Autowired
    private  Userservice us=null;
    @Test
    public void findAll(){
        List<User> list =us.findAll();
        for (User user : list) {
            System.out.println(user);
        }
    }
}
