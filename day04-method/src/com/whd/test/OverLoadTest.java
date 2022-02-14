package com.whd.test;

/**
 * 2.编写程序，定义三个重载方法并调用。方法名为mOL。
 * 三个方法分别接收一个int参数、两个int参数、一个字符串参数。分别
 * 执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
 * 在主类的main ()方法中分别用参数区别调用三个方法。
 * 3.定义三个重载方法max()，第一个方法求两个int值中的最大值，第二个方
 * 法求两个double值中的最大值，第三个方法求三个double值中的最大值，
 * 并分别调用三个方法。
 *
 * @author wanghaidi
 * @create 2022-02-14 14:15
 */
public class OverLoadTest {
    public static void main(String[] args) {
        mOL(2);
        mOL(4, 5);
        mOL("我命由我，不由天");
        int max = max(4, 3);
        System.out.println("int类型中最大值为:" + max);
        double doubleMax = max(7.3, 8.2);
        System.out.println("两个double类型的最大值为:" + doubleMax);
        double v = max(7.3, 3.42, 7.8);
        System.out.println("三个double类型的最大值为:" + v);
    }

    /**
     * 计算一个数的平方
     *
     * @param num 需要传入int型参数
     */
    public static void mOL(int num) {
        int sum = (int) Math.pow(num, 2);
        System.out.println(num + "的平方是:" + sum);
    }

    /**
     * 计算两个数相乘
     *
     * @param x int类型参数1
     * @param y int类型参数2
     */
    public static void mOL(int x, int y) {
        int result = x * y;
        System.out.println("x * y = " + result);
    }

    /**
     * 输出字符串信息
     *
     * @param str 传入String类型的参数
     */
    public static void mOL(String str) {
        System.out.println("字符串信息:" + str);
    }

    /**
     * 计算两个int类型数值的最大值
     *
     * @param x int类型参数1
     * @param y int类型参数2
     * @return 返回最大值 类型为int类型
     */
    public static int max(int x, int y) {
        return (x > y) ? x : y;
    }

    /**
     * 计算两个double类型数的最大值
     *
     * @param x double类型参数1
     * @param y double类型参数2
     * @return 返回最大值 类型为double类型
     */
    public static double max(double x, double y) {
        return (x > y) ? x : y;
    }

    /**
     * 计算三个个double类型数的最大值
     *
     * @param x double类型参数1
     * @param y double类型参数2
     * @param z double类型参数3
     * @return 返回最大值 类型为double类型
     */
    public static double max(double x, double y, double z) {
        double max = (x > y) ? x : y;
        return (max > z) ? max : z;
    }
}
