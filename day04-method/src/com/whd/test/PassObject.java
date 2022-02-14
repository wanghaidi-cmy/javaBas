package com.whd.test;

import com.whd.pojo.Circle;

/**
 * 1.定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个findArea()方法返回圆的面积。
 * 2.定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义
 * 如下：public void printAreas(Circle c, int time)
 * 在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。
 * 例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。
 * 3.在main方法中调用printAreas()方法，调用完毕后输出当前半径值。
 *
 * @author wanghaidi
 * @create 2022-02-14 19:41
 */
public class PassObject {
    public static void main(String[] args) {
        Circle circle = new Circle();
        printAreas(circle, 5);
        System.out.println("now radius is " + circle.getRadius());
    }

    /**
     * 输出圆形面积
     *
     * @param c    Circle对象
     * @param time int参数
     */
    public static void printAreas(Circle c, int time) {
        System.out.println("Radius" + "\t\t" + "Area");
        for (int i = 1; i <= time; i++) {
            c.setRadius(i);
            System.out.println(c.getRadius() + "\t\t" + c.findArea());
        }
        c.setRadius(time + 1);
    }
}
