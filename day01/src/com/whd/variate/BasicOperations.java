package com.whd.variate;

/**
 * java 基本类型的运算
 * 1.自动提升类型转换
 * 结论：当容量小的数据类型的变量与容量大的数据类型的变量做运算时，结果自动提升为容量大的数据类型。
 * 特别的：当byte、char、short三种类型的变量做运算时，结果为int型
 * 说明：此时的容量大小指的是，表示数的范围的大和小。比如：float容量要大于long的容量
 * 自动类型转换的逆过程，将容量大的数据类型转换为容量小的数据类型。使用时要加上强制转换符：()，但可能造成精度降低或溢出,格外要注意。
 * byte 、char 、short --> int --> long --> float --> double
 * 2.强制类型转换(只涉及7种基本数据类型）：自动类型提升运算的逆运算。
 * 1.需要使用强转符：()
 * 2.注意点：强制类型转换，可能导致精度损失。
 *
 * @author wanghaidi
 * @create 2022-02-12 8:48
 */
public class BasicOperations {
    public static void main(String[] args) {
        int num = 29;
        byte bNum = 2;
        int sum = bNum + num;
        System.out.println("结果:" + sum);


        long longNum = bNum + num;
        System.out.println("结果:" + longNum);

        float floatNum = bNum + num;
        System.out.println("结果:" + floatNum);

        short shortNum = 10;
        double doubleNum = shortNum;
        System.out.println("结果:" + doubleNum);

        char charNum = 'a';
        int chInt = 18;
        int charSum = charNum + chInt;
        System.out.println("结果:" + charSum);

    }
}
