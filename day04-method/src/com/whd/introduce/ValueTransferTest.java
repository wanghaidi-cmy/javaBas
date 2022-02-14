package com.whd.introduce;

import com.sun.org.apache.xalan.internal.xsltc.dom.SortingIterator;

/**
 * 方法的形参的传递机制：值传递
 * 1、形参：方法定义时，声明的小括号内的参数
 * 实参：方法调用时，实际传递给形参的值
 * 2、值传递机制：
 * 如果参数是基本数据类型，此时实参赋给形参的是实参存储的数据值
 * 如果参数是引用类型类型，此时实参赋给形参的是实参存储数据的地址值
 *
 * @author wanghaidi
 * @create 2022-02-14 16:53
 */
public class ValueTransferTest {
    public static void main(String[] args) {
        int m = 10;
        int n = 20;
        System.out.println("m = " + m + "，" + "n = " + n);
        //交换两个变量值得操作
        /*int temp = m;
        m = n;
        n = temp;*/
        swap(m, n);
        System.out.println("m = " + m + "，" + "n = " + n);
        int[] arr = new int[10];
        System.out.println(arr);
        char[] ch = new char[10];
        System.out.println(ch);
    }

    public static void swap(int m, int n) {
        int temp = m;
        m = n;
        n = temp;
    }
}
