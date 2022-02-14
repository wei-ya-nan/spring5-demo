package com.wyn.spring5;

import javax.annotation.processing.SupportedSourceVersion;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author wei-ya-nan
 * @version 1.0
 */
public class JdkProxy {
    public static void main(String[] args) {
        //创建接口实现类代理对象
        Class[] instance = {UserDao.class};
//        Proxy.newProxyInstance(JdkProxy.class.getClassLoader(), instance, new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                return null;
//            }
//        });
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JdkProxy.class.getClassLoader(), instance,
                new UserDaoProxy(userDao));
        int add = dao.add(3, 3);
        System.out.println(add);
    }

}

//创建代理对象的代码
class UserDaoProxy implements InvocationHandler {
    //传入要代理的对象 1、有参构造
    private Object obj;

    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }


    //增强的逻辑 搞代理对象
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //增强UserDaoImpl的两个方法
        //方法之前
        System.out.println("方法之前执行..." + method.getName() + ":传递的参数..." + Arrays.toString(args));
        //增强的方法执行
        Object res = method.invoke(obj, args);
        //方法之后
        System.out.println("方法之后执行" + obj);
        return res;
    }
}
