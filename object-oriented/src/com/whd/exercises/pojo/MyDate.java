package com.whd.exercises.pojo;

import com.sun.org.apache.xerces.internal.util.EntityResolverWrapper;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 生日类
 * 只是一个测试的类，并不严谨，仅供娱乐
 *
 * @author wanghaidi
 * @create 2022-02-13 15:41
 */
public class MyDate {
    /**
     * year 年
     * 成员变量
     * 类型 int类型
     */
    private int year;
    /**
     * moth 月
     * 成员变量
     * 类型 int类型
     */
    private int month;
    /**
     * day 天
     * 成员变量
     * 类型 int类型
     */
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            this.month = 1;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (month == 2 && day >= 1 && day <= 28) {
            this.day = day;
        } else if (month == 2 && day > 28) {
            this.day = 28;
        } else if (month != 2 && day >= 1 && day <= 31) {
            this.day = day;
        } else {
            this.day = 30;
        }

    }

    /**
     * 显示日期
     *
     * @return 返回字符串
     */
    public String getInfo() {
        return year + "年-" + month + "月-" + day + "日";
    }
}
