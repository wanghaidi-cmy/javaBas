package com.whd.exercises.test;

/**
 * 输出矩形
 *
 * @author wanghaidi
 * @create 2022-02-13 8:57
 */
public class Rectangular {
    public static void main(String[] args) {
        int ofRectangular = outputOfRectangular(4, 8);
        System.out.println("矩形面积为：" + ofRectangular);
    }

    /**
     * 计算矩形面积，打印矩形形状
     *
     * @param m int类型参数，设置矩形宽度
     * @param n int类型参数，设置矩形长度
     * @return 返回int类型矩形面积
     */
    public static int outputOfRectangular(int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        return m * n;
    }

}
