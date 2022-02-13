package com.whd.exercises.test;

import com.whd.exercises.pojo.Husband;
import com.whd.exercises.pojo.Wife;

import java.util.HashMap;

/**
 * @author wanghaidi
 * @create 2022-02-13 16:52
 */
public class HusWifeTest {
    public static void main(String[] args) {
        Husband husband = new Husband();
        husband.setName("老王");
        husband.setAge(28);
        Wife wife = new Wife();
        wife.setName("赵露思");
        wife.setAge(24);
        husband.setWife(wife);
        wife.setHusband(husband);
        String husbandInfo = husband.getInfo();
        String wifeInfo = wife.getInfo();
        System.out.println(husbandInfo);
        System.out.println(wifeInfo);


    }
}
