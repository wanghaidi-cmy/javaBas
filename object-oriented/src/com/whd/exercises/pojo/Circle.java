package com.whd.exercises.pojo;

/**
 * 定义圆形的实体类
 *
 * @author wanghaidi
 * @create 2022-02-13 8:41
 */
public class Circle {
    /**
     * radius 私有成员变量
     * 属性：半径、
     * 类型：double类型
     */
    private double radius;
    /**
     * 定义圆周率
     */
    private static final double pi = Math.PI;

    /**
     * getRadius 获取半径的方法
     *
     * @return 返回double类型的数据即圆形半径
     */
    public double getRadius() {
        return radius;
    }

    /**
     * setRadius 设置圆形半径的方法
     *
     * @param radius 传入的参数类型为double类型，此参数为圆形的半径
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * getCircleArea()
     * 计算圆形的面积
     *
     * @return area 返回值为double类型数据，返回的是圆形面积
     */
    public double getCircleArea() {
        double area = pi * Math.pow(radius, 2);
        return area;
    }
}
