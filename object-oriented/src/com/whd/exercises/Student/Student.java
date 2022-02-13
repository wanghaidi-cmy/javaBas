package com.whd.exercises.Student;

/**
 * 编写一个Student类，包含name、gender、age、id、score属性，分别为String、String、int、int、double类型。
 * 类中声明一个say方法，返回String类型，方法返回信息中包含所有属性值。
 * 在另一个StudentTest类中的main方法中，创建Student对象，并访问say方法和所有属性，并将调用结果打印输出。
 *
 * @author wanghaidi
 * @create 2022-02-13 16:13
 */
public class Student {
    /**
     * name 姓名
     * 成员变量
     * 类型：字符串类型
     */
    private String name;
    /**
     * gender 性别
     * 成员变量
     * 类型：字符串类型
     */
    private String gender;
    /**
     * age 年龄
     * 成员变量
     * 类型：int 类型
     */
    private int age;
    /**
     * id 学号
     * 成员变量
     * 类型：int 类型
     */
    private int id;
    /**
     * score 分数
     * 成员变量
     * 类型：double类型
     */
    private double score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    /**
     * 显示学生信息
     *
     * @return 返回拼接好的字符串类型学生信息
     */
    public String say() {
        return "姓名：" + name + "\t年龄：" + age + "\t性别：" + gender + "\t学号：" + id + "\t分数" + score;
    }
}
