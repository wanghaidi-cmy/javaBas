package com.whd.introduce;

/**
 * 递归方法的使用
 * 1.递归方法：一个方法体内调用它自身。
 * 2.方法递归包含了一种隐式的循环，它会重复执行某段代码，但这种重复执行无须循环控制。
 * 递归一定要向已知方向递归，否则这种递归就变成了无穷递归，类似于死循环。
 *
 * @author wanghaidi
 * @create 2022-02-14 20:01
 */
public class RecursionTest {
    public static void main(String[] args) {
        int sum = getSum(100);
        System.out.println(sum);
        long num = getFactorial(20);
        System.out.println(num);
        int f = f(10);
        System.out.println(f);
        getFibonacci(10);
        //System.out.println(fibonacci);
    }

    /**
     * 计算1~num之间所有自然数的和
     */
    public static int getSum(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + getSum(num - 1);
        }
    }

    /**
     * 计算n!的阶乘
     *
     * @param num int形参
     * @return 返回阶乘
     */
    public static long getFactorial(long num) {
        if (num == 1) {
            return 1;
        } else {
            return num * getFactorial(num - 1);
        }
    }

    /**
     * 已知有一个数列：f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1) + f(n),其中n是大于0
     * 的整数，求f(10)的值。
     *
     * @param num
     * @return
     */
    public static int f(int num) {
        if (num == 0) {
            return 1;
        } else if (num == 1) {
            return 4;
        } else {
            return 2 * f(num - 1) + f(num - 2);
        }
    }

    /**
     * 输入一个数据n，计算斐波那契数列(Fibonacci)的第n个值
     * 1 1 2 3 5 8 13 21 34 55
     * 规律：一个数等于前两个数之和
     * 要求：计算斐波那契数列(Fibonacci)的第n个值，并将整个数列打印出来
     *
     * @param num 计算的第n个值
     * @return 返回数列值
     */
    public static int fibonacci(int num) {
        if (num == 1) {
            return 1;
        } else if (num == 2) {
            return 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }

    /**
     * 输出斐波那契数列
     *
     * @param num 斐波那契数列第n个
     */
    public static void getFibonacci(int num) {
        for (int i = 1; i <= num; i++) {
            int fibonacci = fibonacci(i);
            if (i == num) {
                System.out.print(fibonacci);
            } else {
                System.out.print(fibonacci + " ");
            }
        }
    }
}
