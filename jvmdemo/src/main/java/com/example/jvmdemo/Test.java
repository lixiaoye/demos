package com.example.jvmdemo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by lixiaoye on 2019/4/11.
 */
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("lixiaoye");
        s1.setRoll_No(1);
        //Getting hold of Class object created by JVM
        Class c1 = s1.getClass();
        //Printing type of object using c1.
        System.out.println("getClass().getName():" + c1.getName());
        //getting all methods in an array
        Method m[] = c1.getDeclaredMethods();
        for (Method method : m) {
            System.out.println("method.getName():" + method.getName());
        }
        //getting all fields in an array
        Field f[] = c1.getDeclaredFields();
        for (Field field : f) {
            System.out.println("field.getName():" + field.getName());
        }

        /**
         * 注意：对于每个加载的.class文件，只创建一个Class对象
         */
        Student s2 = new Student();
        s2.setName("russell");
        s2.setRoll_No(2);
        Class c2 = s2.getClass();
        //c2 will point to same object where c1 is pointing
        //c2将指向c1指向的同一个对象
        System.out.println("c1==c2:" + (c1 == c2));//c1==c2:true
    }
/**
 * 打印结果：
 getClass().getName():com.example.jvmdemo.Student
 method.getName():getName
 method.getName():setName
 method.getName():getRoll_No
 method.getName():setRoll_No
 field.getName():name
 field.getName():roll_No
 c1==c2:true
 */
}
