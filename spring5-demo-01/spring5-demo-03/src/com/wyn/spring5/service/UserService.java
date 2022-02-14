package com.wyn.spring5.service;

import com.wyn.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author wei-ya-nan
 * @version 1.0
 */
//在注解里面 value 属性值可以省略不写，
//默认值是类名称，首字母小写
    //默认userService
//    @Service(value = "userService")
@Component(value = "userService")//<bean id="userService" class="包路径"/>
public class UserService {
    //定义dao属性,不需要添加set方法，添加注入属性注解
    @Autowired//根据类型注入 创建对象
    @Qualifier(value = "userDaoImpl")
    private UserDao userDao;
    public void add(){
        System.out.println("Service add.....");
        userDao.add();
    }
}
