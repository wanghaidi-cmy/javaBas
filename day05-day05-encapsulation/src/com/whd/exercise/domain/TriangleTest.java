package com.whd.exercise.domain;

import com.whd.exercise.pojo.TriAngle;

/**
 * 编写两个类，TriAngle和TriAngleTest，其中TriAngle类中声明私有的底
 * 边长base和高height，同时声明公共方法访问私有变量。此外，提供类
 * 必要的构造器。另一个类中使用这些公共方法，计算三角形的面积。
 *
 * @author wanghaidi
 * @create 2022-02-15 11:01
 */
public class TriangleTest {
    public static void main(String[] args) {
        TriAngle triAngle = new TriAngle();
        triAngle.setBase(5.4);
        triAngle.setHeight(3.2);
        double area = triAngle.getArea();
        System.out.println(area);
    }
}
