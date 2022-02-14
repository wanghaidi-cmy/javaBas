package com.whd.domain;

import com.whd.pojo.Order;

/**
 * @author wanghaidi
 * @create 2022-02-15 9:28
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.orderPublic = 2;
        //order.orderDefault = 2;
        //order.orderPrivate = 2;
        //order.methodPrivate();
        order.methodPublic();
        //order.methodDefault();

    }
}
