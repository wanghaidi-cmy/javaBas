package com.whd.exercise.pojo;

/**
 * 1.创建程序,在其中定义两个类：Person和PersonTest类。定义如下：
 * 用setAge()设置人的合法年龄(0~130)，用getAge()返回人的年龄。
 * 在 PersonTest 类 中实例化 Person 类的对象b ，调用 setAge()和getAge()方法，体会Java的封装性。
 *
 * @author wanghaidi
 * @create 2022-02-15 9:42
 */
public class Person {
    private int age;

    public Person() {
        System.out.println("person...");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        /*if (age >= 0 && age <= 130) {
            this.age = age;
        } else {
            this.age = 0;
        }*/
        if (age < 0 || age > 130) {
            throw new RuntimeException("年龄范围出错");
        } else {
            this.age = age;
        }

    }
}
