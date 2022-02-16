package com.whd.exercise.pojo;

/**
 * @author wanghaidi
 * @create 2022-02-15 16:34
 */
public class Boy {
    private String name;
    private int age;

    public Boy() {
    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void marry(Girl girl) {
        System.out.println("我想娶" + girl.getName() + "为妻");
    }

    public void shout() {
        if (age >= 22) {
            System.out.println("你已经到了法定年龄可以结婚了");
        } else {
            System.out.println("还是多谈谈恋爱吧。。。");
        }
    }
}
