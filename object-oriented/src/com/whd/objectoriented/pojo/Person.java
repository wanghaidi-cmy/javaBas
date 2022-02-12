package com.whd.objectoriented.pojo;

/**
 * Person类
 * 属性：name，age，isMail
 * 方法：eat()，sleep()，talk(String language)
 * 一、设计类，其实就是设计类的成员
 * 属性 = 成员变量 = field = 域、字段
 * 方法 = 成员方法 = method = 函数
 * 创建类的对象 = 类的实例化 = 实例化类
 *
 * @author wanghaidi
 * @create 2022-02-12 15:56
 */
public class Person {
    /**
     * 属性
     * name 姓名
     */
    public String name;
    /**
     * age 年龄
     */
    public int age;
    /**
     * isMail 是否为男性
     */
    public boolean isMail;

    /**
     * 方法
     * eat() 吃饭
     */
    public void eat() {
        System.out.println("吃美食。。。");
    }

    /**
     * sleep() 睡觉
     */
    public void sleep() {
        System.out.println("睡觉。。。");
    }

    /**
     * talk(String language) 交流
     *
     * @param language language 语言
     */
    public void talk(String language) {
        System.out.println("使用" + language + "交谈。。。");
    }


}
