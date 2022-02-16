package com.whd.exercise.domain;


import com.whd.exercise.pojo.Boy;
import com.whd.exercise.pojo.Girl;

import static java.lang.System.*;

/**
 * @author wanghaidi
 * @create 2022-02-15 16:53
 */
public class BoyGirlTest {
    public static void main(String[] args) {
        Boy boy = new Boy();
        Girl girl = new Girl();
        Girl girl1 = new Girl("陈芊芊", 18);
        girl.setName("赵露思");
        girl.setAge(22);
        boy.setAge(22);
        boy.setName("老王");
        boy.marry(girl);
        boy.shout();
        girl.marry(boy);
        int compare = girl.compare(girl1);
        if (compare > 0) {
            out.println(girl.getName() + "年龄大");
        } else if (compare < 0) {
            out.println(girl1.getName() + "年龄大");
        } else {
            out.println(girl.getName() + "和" + girl1.getName() + "一样大");
        }
    }
}
