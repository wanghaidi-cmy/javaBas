package com.whd.variate;

/**
 * String类型变量的使用
 * 1.String类型属于引用类型
 * 2.声明String类型变量时，使用一对
 * 3.String可以和8种基本数据类型变量做运算，且运算只能是连接运算：+
 * 4.运算的结果仍然是String类型
 *
 * @author wanghaidi
 * @create 2022-02-12 10:06
 */
public class StringTest {
    public static void main(String[] args) {
        String hello = "您好，赵灵儿";
        System.out.println("message:" + hello);

        int studentId = 10001;
        String name = "学号:";
        //+ 连接运算
        String info = name + studentId;
        System.out.println("StudentInfo:(" + info + ")");
    }

}
