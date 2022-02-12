package com.whd.objectoriented.domain;

import com.whd.objectoriented.pojo.Customer;

/**
 * 方法：描述类应该具的功能。
 * 比如：Math类：sqrt()\random() \...
 * Scanner类：nextXxx() ...
 * Arrays类：sort() \ binarySearch() \ toString() \ equals() \ ...
 * <p>
 * 1.举例：
 * public void eat(){}
 * public void sleep(int hour){}
 * public String getName(){}
 * public String getNation(String nation){}
 * <p>
 * 2. 方法的声明：权限修饰符  返回值类型  方法名(形参列表){
 * 方法体
 * }
 * 注意：static、final、abstract 来修饰的方法，后面再讲。
 * <p>
 * 3. 说明：
 * 3.1 关于权限修饰符：默认方法的权限修饰符先都使用public
 * Java规定的4种权限修饰符：private、public、缺省、protected  -->封装性再细说
 * <p>
 * 3.2 返回值类型： 返回值  vs 没返回值
 * 3.2.1  如果方法返回值，则必须在方法声明时，指定返回值的类型。同时，方法中，需要使用
 * return关键字来返回指定类型的变量或常量：“return 数据”。
 * 如果方法没返回值，则方法声明时，使用void来表示。通常，没返回值的方法中，就不需要
 * 使用return.但是，如果使用的话，只能“return;”表示结束此方法的意思。
 * <p>
 * 3.2.2 我们定义方法该不该返回值？
 * ① 题目要求
 * ② 凭经验：具体问题具体分析
 * <p>
 * 3.3 方法名：属于标识符，遵循标识符的规则和规范，“见名知意”
 * <p>
 * 3.4 形参列表： 方法可以声明0个，1个，或多个形参。
 * 3.4.1 格式：数据类型1 形参1,数据类型2 形参2,...
 * <p>
 * 3.4.2 我们定义方法时，该不该定义形参？
 * ① 题目要求
 * ② 凭经验：具体问题具体分析
 * <p>
 * 3.5 方法体：方法功能的体现。
 * <p>
 * 4. 方法的使用中，可以调用当前类的属性或方法
 * 特殊的：方法A中又调用了方法A:递归方法。
 * 方法中，不可以定义方法。
 *
 * @author wanghaidi
 * @create 2022-02-12 19:10
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.name = "吕布";
        customer.age = 30;
        customer.isMail = true;

        String name = customer.getName();
        System.out.println("姓名：" + name + "，年龄：" + customer.age + "，是否为男性：" + customer.isMail);

        String nationInfo = customer.getNation("中国");
        System.out.println(nationInfo);

        customer.eat();
        customer.sleep(8);

    }
}
