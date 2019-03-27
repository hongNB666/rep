package com.itheima.dao;

import java.util.List;
import java.util.Map;

/**
 * @Description: java类作用描述
 * @Author: Hzb
 * @CreateDate: 2019/3/13 18:50
 * @Version: 1.0
 */
public class Userdaoimpl implements Userdao{
    private List<String> list;
    private Map<String,Object> map;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public void show() {
        System.out.println("出来秀秀");
        System.out.println(list);
        System.out.println(map);
    }
}
