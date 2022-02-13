package com.whd.exercises.test;

import com.whd.exercises.pojo.MyDate;

import java.util.Date;

/**
 * 测试生日类（MyDate）
 *
 * @author wanghaidi
 * @create 2022-02-13 15:47
 */
public class MyDateTest {
    public static void main(String[] args) {
        MyDate myDate = new MyDate();
        myDate.setYear(1994);
        myDate.setMonth(10);
        myDate.setDay(32);
        String info = myDate.getInfo();
        System.out.println(info);
    }
}
