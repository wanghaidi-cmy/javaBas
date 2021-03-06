package com.whd.exercise.pojo;

/**
 * @author wanghaidi
 * @create 2022-02-15 16:34
 */
public class Girl {
    private String name;
    private int age;

    public Girl() {
    }

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void marry(Boy boy) {
        System.out.println("我想嫁给" + boy.getName() + "当媳妇");
        boy.marry(this);
    }

    /**
     * 比较两个对象的大小
     *
     * @param girl 对象参数
     * @return 返回正数：当前对象大，负数：当前对象小，0：一样大
     */
    public int compare(Girl girl) {
        if (this.age > girl.age) {
            return 1;
        } else if (this.age < girl.age) {
            return -1;
        } else {
            return 0;
        }
    }
}
