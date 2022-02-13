package com.whd.exercises.pojo;

import com.sun.org.apache.xerces.internal.util.EntityResolverWrapper;

/**
 * 定义一个丈夫Husband类，有姓名、年龄、妻子属性
 * 定义一个妻子Wife类，有姓名、年龄、丈夫属性
 * 丈夫类中有一个getInfo方法，其中，能显示自己的姓名，年龄，和他的妻子的姓名，年龄
 * 妻子类中有一个getInfo方法，其中，能显示自己的姓名，年龄，和她的丈夫的姓名，年龄
 * 定义一个测试类，创建妻子和丈夫对象，然后测试
 *
 * @author wanghaidi
 * @create 2022-02-13 16:45
 */
public class Husband {
    private String name;
    private int age;
    private Wife wife;

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

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    public String getInfo() {
        return "姓名:" + name + "\t年龄:" + age + "\n妻子姓名:" + wife.getName() + "\t妻子年龄:" + wife.getAge();
    }
}
