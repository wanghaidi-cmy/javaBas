package com.whd.exercises.pojo;

/**
 * 学生类
 *
 * @author wanghaidi
 * @create 2022-02-13 10:33
 */
public class Student {
    /**
     * number 成员变量
     * 属性：学号
     * 类型：int类型
     */
    private int number;
    /**
     * state 成员变量
     * 属性：年级
     * 类型：int类型
     */
    private int state;
    /**
     * score 成员变量
     * 属性：分数
     * 类型：int类型
     */
    private int score;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    /**
     * getInfo 展示学生信息
     *
     * @return 返回拼接后的字符串类型的学生信息
     */
    public String getInfo() {
        //System.out.println("学号：" + number + ",年级：" + state + "，分数：" + score);
        return "学号：" + number + ",年级：" + state + "，分数：" + score;
    }

}
