package com.whd.exercise.pojo;

/**
 * 三角形面积计算类
 *
 * @author wanghaidi
 * @create 2022-02-15 11:02
 */
public class TriAngle {
    /**
     * 底边长度
     * 类型:double类型
     */
    private double base;
    /**
     * 高长度
     * 类型:double类型
     */
    private double height;

    public TriAngle() {
    }

    public TriAngle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * 计算三角形面积
     *
     * @return 返回三角形面积
     */
    public double getArea() {
        double area = 0.5 * base * height;
        //double l =1/2;
        //System.out.println(l);
        return area;
    }
}
