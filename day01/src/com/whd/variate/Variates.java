package com.whd.variate;

import static java.lang.System.*;

/**
 * 变量的使用
 * 1.Java定义变量的格式：数据类型  变量名 = 变量值;
 * 2.说明：
 * 变量必须先声明初始化，后使用
 * 变量都定义在其作用域内，在作用域内是有效的
 * 同一个作用域内，不可以声明两个同名变量
 *
 * @author wanghaidi
 * @create 2022-02-11 17:30
 */

public class Variates {
    public static void main(String[] args) {

        //变量的定义
        int myAge = 28;
        //变量的使用
        out.println("我的年龄：" + myAge);

        //变量的声明
        int myNumber;
        //变量的赋值
        myNumber = 1008;
        //变量的使用
        out.println("我的学号:" + myNumber);
    }
}
