package com.whd.pojo;

/**
 * @author wanghaidi
 * @create 2022-02-15 9:24
 */
public class Order {
    private int orderPrivate;
    int orderDefault;
    public int orderPublic;

    private void methodPrivate() {
        orderDefault = 1;
        orderPrivate = 1;
        orderPublic = 1;
    }

    void methodDefault() {
        orderDefault = 1;
        orderPrivate = 1;
        orderPublic = 1;
    }

    public void methodPublic() {
        orderDefault = 1;
        orderPrivate = 1;
        orderPublic = 1;
    }

}
