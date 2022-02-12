package com.whd.variate;

/**
 * 强制转换类型(只涉及7种基本数据类型）：自动类型提升运算的逆运算。
 * 1.需要使用强转符：()
 * 2.注意点：强制类型转换，可能导致精度损失。
 *
 * @author wanghaidi
 * @create 2022-02-12 9:53
 */
public class CastType {
    public static void main(String[] args) {
        double dNum = 12.3;
        //会有截断操作，可能造成精度损失
        int num = (int) dNum;
        //结果:12
        System.out.println("结果:" + num);

        int numBy = 128;
        byte byNum = (byte) numBy;
        //结果:-128
        System.out.println("结果:" + byNum);
    }
}
