package com.whd.objectoriented.pojo;

/**
 * 定义User实例类
 *
 * @author wanghaidi
 * @create 2022-02-12 17:43
 */
public class User {
    /**
     * 属性 成员变量
     * name 名字
     */
    public String name;
    /**
     * 属性 成员变量
     * age 年龄
     */
    public int age;
    /**
     * 属性 成员变量
     * isMail 是否为男性
     */
    public boolean isMail;

    /**
     * eat() 吃饭方法
     */
    public void eat() {
        //food 局部变量
        String food = "米饭";
        System.out.println("南方人喜欢吃：" + food);
    }

    /**
     * talk(language)交谈方法
     *
     * @param language 形式参数，也是局部变量
     */
    public void talk(String language) {
        System.out.println("我们使用" + language + "进行交流");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isMail=" + isMail +
                '}';
    }
}
