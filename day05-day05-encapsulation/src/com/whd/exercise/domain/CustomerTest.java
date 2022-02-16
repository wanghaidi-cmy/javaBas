package com.whd.exercise.domain;

import com.whd.exercise.pojo.Account;
import com.whd.exercise.pojo.Customer;

/**
 * 创建一个 Customer ，名字叫 Jane Smith, 他有一个账号为 1000，余额为 2000 元，
 * 年利率为 1.23％ 的账户。
 * 对 Jane Smith 操作。
 * 存入 100 元，再取出 960 元。再取出 2000 元。
 * 打印出 Jane Smith 的基本信息
 * 成功存入 ：100.0
 * 成功取出：960.0
 * 余额不足，取款失败
 * Customer [Smith, Jane] has a account: id is 1000, annualInterestRate is 1.23％, balance is
 * 1140.0
 * @author wanghaidi
 * @create 2022-02-16 10:21
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane","Simth");
        Account account = new Account(1000,2000,0.0123);
        customer.setAccount(account);
        //Account customerAccount = customer.getAccount();
        //System.out.println(customerAccount.getId());
       /* customerAccount.deposit(100.0);
        customerAccount.withdraw(960.0);
        customerAccount.withdraw(2000.0);
        String s = customer.showInfo();
        System.out.println(s);*/
        customer.getAccount().deposit(100.0);
        customer.getAccount().withdraw(960.0);
        customer.getAccount().withdraw(2000.0);
        String s = customer.showInfo();
        System.out.println(s);


    }
}
