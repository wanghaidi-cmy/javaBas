package com.whd.exercise.pojo;

/**
 * @author wanghaidi
 * @create 2022-02-15 19:48
 */
public class Account {
    /**
     * 账号户
     */
    private int id;
    /**
     * 余额
     */
    private double balance;
    /**
     * 年利率
     */
    private double annualInterestRate;

    public Account() {
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * 账户取钱操作
     *
     * @param amount 取出的金额
     */
    public void withdraw(double amount) {//取钱
        if (balance >= amount) {
            balance -= amount;
            System.out.println("成功取出:" + amount + "元");
        } else {
            System.out.println("余额不足，取款失败");
        }
    }

    /**
     * 账户存钱操作
     *
     * @param amount 存入的金额
     */
    public void deposit(double amount) {//存钱
        if (amount > 0) {
            balance += amount;
            System.out.println("成功存入:" + amount);
        }
    }
}
