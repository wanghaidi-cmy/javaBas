package com.whd.introduce;


/**
 * @author wanghaidi
 * @create 2022-02-14 17:42
 */
public class ValueTransferTest1 {
    public static void main(String[] args) {
        Data data = new Data();
        data.n = 20;
        data.m = 10;
        System.out.println("data.m = " + data.m + ",data.n = " + data.n);
        //交换m和n的值
        /*int temp = data.m;
        data.m = data.n;
        data.n = temp;*/
        swap(data);
        System.out.println("data.m = " + data.m + ",data.n = " + data.n);
    }

    public static void swap(Data data) {
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }
}

