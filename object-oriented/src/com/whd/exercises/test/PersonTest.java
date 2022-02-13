package com.whd.exercises.test;

import com.whd.exercises.pojo.Person;

/**
 * 测试Person类
 *
 * @author wanghaidi
 * @create 2022-02-12 23:45
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "刘亦菲";
        person.age = 30;
        person.sex = 0;

        person.study();
        person.showAge();
        int age = person.addAge(2);
        System.out.println("调用addAge方法后的age:" + age);
    }
}
