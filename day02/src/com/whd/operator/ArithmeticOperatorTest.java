package com.whd.operator;

/**
 * 运算符之一：
 * 算数运算符
 * + - + - * / % (前)++ (后)++ (前)-- (后)-- +
 * 如果对负数取模，可以把模数负号忽略不记，如：5%-2=1。但被模数是 负数则不可忽略。此外，取模运算的结果不一定总是整数。
 * 对于除号“/”，它的整数除和小数除是有区别的：整数之间做除法时，只保留整数部分而舍弃小数部分。例如：int x=3510;x=x/1000*1000; x的 结果是？
 * “+”除字符串相加功能外，还能把非字符串转换成字符串.例如：
 * System.out.println(“5+5=”+5+5); //打印结果是？ 5+5=55 ?
 *
 * @author wanghaidi
 * @create 2022-02-12 10:41
 */
public class ArithmeticOperatorTest {

    public static void main(String[] args) {

        //除号：/
        int num1 = 12;
        int num2 = 5;
        int resultNum = num1 / num2;
        //除的结果:2
        System.out.println("除的结果:" + resultNum);

        int resultSum = num1 / num2 * num2;
        //此运算结果为:10
        System.out.println("此运算结果为:" + resultSum);

        double result = num1 / num2;
        //结果:2.0
        System.out.println("结果:" + result);

        result = (double) num1 / num2;
        //结果:2.4
        System.out.println("结果:" + result);
        //结果:2.0
        result = (double) (num1 / num2);
        System.out.println("结果:" + result);

        // %:取余运算
        //结果的符号与被模数的符号相同
        //开发中，经常使用%来判断能否被除尽的情况。
        int num3 = 14;
        int num4 = 5;
        System.out.println("num3 % num4 = " + num3 % num4);

        int m1 = 12;
        int n1 = 5;
        System.out.println("m1 % n1 = " + m1 % n1);

        int m2 = -12;
        int n2 = 5;
        System.out.println("m2 % n2 = " + m2 % n2);

        int m3 = 12;
        int n3 = -5;
        System.out.println("m3 % n3 = " + m3 % n3);

        int m4 = -12;
        int n4 = -5;
        System.out.println("m4 % n4 = " + m4 % n4);

        //(前)++ :先自增1，后运算
        //(后)++ :先运算，后自增1

        int a1 = 10;
        int b1 = ++a1;
        System.out.println("a1 = " + a1 + ",b1 = " + b1);

        int a2 = 10;
        int b2 = a2++;
        System.out.println("a2 = " + a2 + ",b2 = " + b2);

        int a3 = 10;
        ++a3;//a3++;
        int b3 = a3;
        //(前)-- :先自减1，后运算
        //(后)-- :先运算，后自减1

        int a4 = 10;
        int b4 = a4--;//int b4 = --a4;
        System.out.println("a4 = " + a4 + ",b4 = " + b4);

    }

}
