package com.whd.pojo;

/**
 * 手机商场类
 * 用来测试匿名对象的使用
 *
 * @author wanghaidi
 * @create 2022-02-14 9:35
 */
public class PhoneMall {
    /**
     * 显示手机功能
     *
     * @param phone Phone对象
     */
    public void show(Phone phone) {
        phone.sendEmail();
        phone.playGame();
    }
}
