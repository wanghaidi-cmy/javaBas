package com.whd.introduce;

import com.whd.exercise.pojo.Person;

import static java.lang.System.*;

/**
 * 类的结构之三：构造器的使用
 * 1.构造器（或构造方法）：Constructor
 * 构造器的作用：
 * 1.创建对象
 * 2.初始化对象的信息
 * 2.使用说明：
 * 1.如果没显式的定义类的构造器的话，则系统默认提供一个空参的构造器
 * 2.定义构造器的格式：权限修饰符  类名(形参列表){}
 * 3.一个类中定义的多个构造器，彼此构成重载
 * 4.一旦我们显式的定义了类的构造器之后，系统就不再提供默认的空参构造器
 * 5.一个类中，至少会有一个构造器。
 * 总结：属性赋值的先后顺序
 * <p>
 * <p>
 * 1. 默认初始化
 * 2. 显式初始化
 * 3. 构造器中初始化
 * **********************
 * 4. 通过"对象.方法" 或 "对象.属性"的方式，赋值
 * <p>
 * 以上操作的先后顺序：1 - 2 - 3 - 4
 *
 * @author wanghaidi
 * @create 2022-02-15 10:31
 */
public class Constructor {
    public static void main(String[] args) {
        //创建类的对象 new + 构造器
        Person person = new Person();
        person.setAge(25);
        out.println("年龄:" + person.getAge());
    }
}
