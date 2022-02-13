package com.whd.exercises.test;

import com.whd.exercises.Student.Student;

/**
 * 测试类
 *
 * @author wanghaidi
 * @create 2022-02-13 16:39
 */
public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("阿Q");
        student.setAge(45);
        student.setGender("男");
        student.setId(1002);
        student.setScore(36);
        String info = student.say();
        System.out.println("========学生信息========");
        System.out.println(info);

    }
}
