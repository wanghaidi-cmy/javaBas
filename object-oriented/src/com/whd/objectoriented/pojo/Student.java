package com.whd.objectoriented.pojo;

/**
 * 学生实体类
 *
 * @author wanghaidi
 * @create 2022-02-12 22:47
 */
public class Student {
    /**
     * name 成员变量
     * 属性：姓名
     * 类型：字符串类型
     */
    public String name;
    /**
     * age 成员变量
     * 属性：年龄
     * 类型：int
     */
    public int age;
    /**
     * major 成员变量
     * 属性：主修课程
     * 类型：字符串类型
     */
    public String major;
    /**
     * interests 成员变量
     * 属性：兴趣爱好
     * 类型：字符串类型
     */
    public String interests;

    /**
     * say() 用于显示学生信息方法
     *
     * @return 返回字符串类型的学生信息
     */
    public String say() {
        String studentInfo = "姓名：" + name + "，年龄：" + age + "，主修课程：" + major + "，兴趣爱好：" + interests;
        return studentInfo;
    }
}
