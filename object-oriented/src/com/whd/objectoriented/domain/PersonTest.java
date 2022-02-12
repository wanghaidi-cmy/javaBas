package com.whd.objectoriented.domain;

import com.whd.objectoriented.pojo.Person;

import static java.lang.System.*;

/**
 * 测试类（测试Person类）
 * 一、设计类，其实就是设计类的成员
 * 属性 = 成员变量 = field = 域、字段
 * 方法 = 成员方法 = method = 函数
 * 创建类的对象 = 类的实例化 = 实例化类
 *
 * @author wanghaidi
 * @create 2022-02-12 15:57
 */
public class PersonTest {
    public static void main(String[] args) {
        //创建Person的对象
        Person person = new Person();
        //调用方法：对象名.方法
        person.eat();
        person.sleep();
        person.talk("英语");

        //调用对象的结构：属性，方法
        //调用属性：对象名.属性
        person.name = "赵露思";
        person.age = 24;
        person.isMail = false;
        out.println("姓名：" + person.name + ",年龄：" + person.age + ",性别是否为男性：" + person.isMail);
    }
}
