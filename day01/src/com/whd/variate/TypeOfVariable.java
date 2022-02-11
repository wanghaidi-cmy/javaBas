package com.whd.variate;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * java 定义的数据类型
 * 1.按照数据类型
 * 基本数据类型：
 * 数值型：
 * 整数类型(byte,short,int,long)
 * 浮点类型(float,double)
 * 字符型(char)
 * 布尔型(boolean)
 * 引用数据类型
 * 类(class) 包括字符串
 * 接口(interface)
 * 数组(array[ ])
 * 2.按声明的位置的不同
 * 局部变量：在方法体内部声明的变量称为局部变量。
 * 形参（方法、构造器中定义的变量）
 * 方法局部变量（在方法内定义）
 * 代码块局部变量（在代码块内定义）
 * 成员变量：在方法体外，类体内声明的变量称为成员变量。
 * 实例变量（不以static修饰）
 * 类变量（以static修饰）
 *
 * @author wanghaidi
 * @create 2022-02-11 18:53
 */
public class TypeOfVariable {
    public static void main(String[] args) {

        //1.整数类型(byte[1个字节=8bit],short[2个字节],int[4个字节],long[8个字节])
        //byte范围：-128 ~ 127
        byte positiveByte = 127;
        byte negativeByte = -128;
        System.out.println("byte数值范围：" + negativeByte + "~" + positiveByte);
        short num = 128;
        //声明long型变量，必须以"l"或"L"结尾
        long studentId = 130102L;
        //整型的常量，默认类型是：int型
        int age = 28;
        System.out.println("我的座位号为：" + num);
        System.out.println("我的年龄是：" + age);
        System.out.println("我的学号是：" + studentId);

        /**
         * 2. 浮点型：float(4字节)  double(8字节)
         * ① 浮点型，表示带小数点的数值
         * ② float表示数值的范围比long还大
         * ③ 定义float类型变量时，变量要以"f"或"F"结尾
         * ④ 通常，定义浮点型变量时，使用double型。
         * ⑤ 浮点型的常量，默认类型为：double
         */
        //通常，定义浮点型变量时，使用double型。
        double doubleNum = 3.14;
        System.out.println("圆周率小数点后两位:" + (doubleNum + 1));

        //定义float类型变量时，变量要以"f"或"F"结尾
        float fNum = 12.3f;
        System.out.println("浮点类型的数据:" + (fNum + 1));

        //3. 字符型：char (1字符=2字节)
        //① 定义char型变量，通常使用一对'',内部只能写一个字符
        //② 表示方式：1.声明一个字符 2.转义字符 3.直接使用 Unicode 值来表示字符型常量
        char ch = 'a';
        System.out.println("输出字符：" + ch);
        //转义字符
        //换行符
        char esc = '\n';
        char tab = '\t';
        char unicode = '\u0123';
        System.out.print("我的未来不是梦" + tab);
        System.out.print(esc);
        System.out.println("故人西去");
        System.out.println("unicode表示字符：" + unicode);

        //4.布尔型：boolean
        //① 只能取两个值之一：true 、 false
        //② 常常在条件判断、循环结构中使用
        boolean isTrue = true;
        if (isTrue == true) {
            System.out.println("是否为真：" + isTrue);
        }


    }
}
