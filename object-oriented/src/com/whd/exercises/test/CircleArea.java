package com.whd.exercises.test;

import com.whd.exercises.pojo.Circle;

/**
 * 打印 10*8
 *
 * @author wanghaidi
 * @create 2022-02-13 8:39
 */
public class CircleArea {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(4.32);
        double area = circle.getCircleArea();
        System.out.println("圆形的面积为:" + area);
    }
}
