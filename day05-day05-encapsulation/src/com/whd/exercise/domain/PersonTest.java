package com.whd.exercise.domain;

import com.whd.exercise.pojo.Person;

/**
 * @author wanghaidi
 * @create 2022-02-15 9:43
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(140);
        System.out.println("年龄：" + person.getAge());
    }
}
