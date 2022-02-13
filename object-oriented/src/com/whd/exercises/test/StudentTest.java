package com.whd.exercises.test;

import com.whd.exercises.pojo.Student;


/**
 * 测试Student类
 *
 * @author wanghaidi
 * @create 2022-02-13 10:52
 */
public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[20];
        Student[] students1 = getStudents(students);
        System.out.println("*************************");
        System.out.println("年级为3的学生:");
        getStateInfo(students1, 3);
        System.out.println("*************************");
        Student[] students2 = scoreSort(students1);
        System.out.println("排序后的顺序：");
        outInfo(students2);

    }

    /**
     * 遍历生成Student对象数组
     *
     * @param students Student对象数组类型的参数
     * @return 返回Student类型对象数组
     */
    public static Student[] getStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].setNumber(i + 1);
            students[i].setScore((int) Math.round(Math.random() * (100 - 0 + 1)));
            students[i].setState((int) Math.round(Math.random() * (6 - 1 + 1) + 1));
            System.out.println(students[i].getInfo());
        }
        return students;
    }

    /**
     * 查找指定年级学生信息
     * 打印出3年级(state值为3）的学生信息。
     *
     * @param students 指定的学生数组
     * @param state    指定的年级
     */
    public static void getStateInfo(Student[] students, int state) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getState() == state) {
                System.out.println(students[i].getInfo());
            }
        }
    }

    /**
     * 使用冒泡排序对学生分数进行排序
     *
     * @param students Student类型对象数组
     * @return 返回排序后的Student类型对象数组
     */
    public static Student[] scoreSort(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].getScore() > students[j + 1].getScore()) {
                    //如果需要换序，交换的是数组中元素，student对象
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        return students;
    }

    /**
     * 显示排序后的学生信息
     *
     * @param students Student类型对象数组
     */
    public static void outInfo(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getInfo());
        }
    }
}
