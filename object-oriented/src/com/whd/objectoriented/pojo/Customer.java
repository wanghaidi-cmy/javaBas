package com.whd.objectoriented.pojo;

/**
 * 客户实体类Customer
 *
 * @author wanghaidi
 * @create 2022-02-12 19:08
 */
public class Customer {
    /**
     * 成员变量 name
     * 属性:姓名
     */
    public String name;
    /**
     * 成员变量 age
     * 属性:年龄
     */
    public int age;
    /**
     * 成员变量 isMail
     * 属性:是否为男性
     */
    public boolean isMail;

    /**
     * eat() 吃饭方法
     */
    public void eat() {
        System.out.println("客户和我一起吃饭");
    }

    /**
     * sleep(int hours) 休息方法
     *
     * @param hours 形式参数，成员变量，传入int类型参数hours数值
     */
    public void sleep(int hours) {
        System.out.println("休息了" + hours + "个小时！");
    }

    /**
     * getName() 获取客户名字方法
     *
     * @return name 返回值为String类型的客户名字
     */
    public String getName() {
        return name;
    }

    /**
     * getNation(String nation) 获取国籍方法
     *
     * @param nation 形式参数，成员变量，传入客户国籍String类型参数
     * @return nationInfo 返回String类型的拼接好的字符串，客户国籍信息
     */
    public String getNation(String nation) {
        String nationInfo = "我的国籍是:" + nation;
        return nationInfo;
    }

}
