package com.whd.objectoriented.domain;

import com.whd.objectoriented.pojo.Student;
import com.whd.objectoriented.pojo.Teacher;

/**
 * 测试学生和教师类
 *
 * @author wanghaidi
 * @create 2022-02-12 23:02
 */
public class StTcTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "赵露思";
        student.age = 25;
        student.major = "java";
        student.interests = "唱歌、跳舞";
        String studentInfo = student.say();
        System.out.println("学生信息：\n" + studentInfo);

        Teacher teacher = new Teacher();
        teacher.name = "罗翔";
        teacher.age = 40;
        teacher.teachAge = 18;
        teacher.course = "政法";
        String teacherInfo = teacher.say();
        System.out.println("教师信息：\n" + teacherInfo);
    }
}
