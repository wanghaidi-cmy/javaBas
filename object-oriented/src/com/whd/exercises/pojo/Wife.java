package com.whd.exercises.pojo;

/**
 * 定义一个丈夫Husband类，有姓名、年龄、妻子属性
 * 定义一个妻子Wife类，有姓名、年龄、丈夫属性
 * 丈夫类中有一个getInfo方法，其中，能显示自己的姓名，年龄，和他的妻子的姓名，年龄
 * 妻子类中有一个getInfo方法，其中，能显示自己的姓名，年龄，和她的丈夫的姓名，年龄
 * 定义一个测试类，创建妻子和丈夫对象，然后测试
 *
 * @author wanghaidi
 * @create 2022-02-13 16:46
 */
public class Wife {
    private String name;
    private int age;
    private Husband husband;

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

    public Husband getHusband() {
        return husband;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }

    public String getInfo() {
        return "姓名:" + name + "\t年龄:" + age + "\n丈夫姓名:" + husband.getName() + "\t丈夫年龄:" + husband.getAge();
    }
}
