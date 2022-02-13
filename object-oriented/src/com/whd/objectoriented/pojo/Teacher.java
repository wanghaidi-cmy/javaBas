package com.whd.objectoriented.pojo;

/**
 * 老师实体类
 *
 * @author wanghaidi
 * @create 2022-02-12 22:54
 */
public class Teacher {
    /**
     * name 成员变量
     * 属性：姓名
     * 类型：字符串
     */
    public String name;
    /**
     * age 成员变量
     * 属性：年龄
     * 类型：int类型
     */
    public int age;
    /**
     * teachAge 成员变量
     * 属性：教龄
     * 类型：int类型
     */
    public int teachAge;
    /**
     * course 成员变量
     * 属性：课程
     * 类型：字符串
     */
    public String course;

    /**
     * say() 用于显示教师信息
     *
     * @return 返回字符串类型的教师信息
     */

    public String say() {
        String teacherInfo = "姓名：" + name + "，年龄：" + age + "，教龄：" + teachAge + "，课程：" + course;
        return teacherInfo;
    }
}
