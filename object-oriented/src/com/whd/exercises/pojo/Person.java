package com.whd.exercises.pojo;

/**
 * 人的实体类
 *
 * @author wanghaidi
 * @create 2022-02-12 23:36
 */
public class Person {
    /**
     * name 成员变量
     * 属性：姓名
     * 类型：字符型类型
     */
    public String name;
    /**
     * age 成员变量
     * 属性：年龄
     * 类型：int类型
     */
    public int age;
    /**
     * sex 成员变量
     * 属性：性别 取值为：0为女，1为男
     * 类型：int类型
     */
    public int sex;

    /**
     * study() 学习方法
     */
    public void study() {
        System.out.println("studying...");
    }

    /**
     * showAge() 显示年龄方法
     */
    public void showAge() {
        System.out.println("年龄：" + age);
    }

    /**
     * addAge() 改变年龄的方法 增加
     *
     * @param i int类型形参，成员变量，传入参数用于改变age大小
     * @return 返回改变的年龄
     */
    public int addAge(int i) {
        age = age + i;
        return age;
    }

}
