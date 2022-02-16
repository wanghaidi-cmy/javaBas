package com.whd.exercise.pojo;

/**
 * @author wanghaidi
 * @create 2022-02-15 19:48
 */
public class Customer {
    /**
     * 姓氏
     */
    private String firstName;
    /**
     * 名字
     */
    private String lastName;
    /**
     * 账户
     */
    private Account account;

    public Customer() {
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    /**
     * 输出客户信息
     * @return 返回值为String 类型客户信息
     */
    public String showInfo(){
        return "Customer ["+lastName+"," +firstName+
                "] has a account: id is "+ account.getId()+", annualInterestRate is "+
                account.getAnnualInterestRate()*100+"％, balance is "+ account.getBalance();
    }
}
