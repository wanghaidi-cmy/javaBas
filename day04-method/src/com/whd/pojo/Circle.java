package com.whd.pojo;

/**
 * 1.定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个findArea()方法返回圆的面积。
 * 2.定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义
 * 如下：public void printAreas(Circle c, int time)
 * 在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。
 * 例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。
 * 3.在main方法中调用printAreas()方法，调用完毕后输出当前半径值。
 *
 * @author wanghaidi
 * @create 2022-02-14 19:37
 */
public class Circle {
    /**
     * 圆形半径
     */
    private double radius;
    /**
     * 定义圆周率
     */
    private final static double pi = Math.PI;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * 计算圆形面积
     *
     * @return 返回圆形面积
     */
    public double findArea() {
        double area = pi * Math.pow(radius, 2);
        return area;
    }
}
