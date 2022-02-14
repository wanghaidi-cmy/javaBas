package com.whd.pojo;

/**
 * 手机类
 *
 * @author wanghaidi
 * @create 2022-02-14 9:22
 */
public class Phone {
    /**
     * price 价格
     * 成员变量
     * 类型：double类型
     */
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * sendEmail 无参方法
     * 发送邮件
     */
    public void sendEmail() {
        System.out.println("发送邮件");
    }

    /**
     * playGame() 无参方法
     * 玩游戏
     */
    public void playGame() {
        System.out.println("玩游戏");
    }

    /**
     * showPrice 无参方法
     * 显示价格
     */
    public void showPrice() {
        System.out.println("手机价格:" + price);
    }
}
