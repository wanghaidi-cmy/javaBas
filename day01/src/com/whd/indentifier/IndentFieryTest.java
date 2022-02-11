package com.whd.indentifier;

import static java.lang.System.*;

/**
 * @author wanghaidi
 * @create 2022-02-11 16:23
 * 标识符的使用
 *  1.标识符：凡是可以自己命名的地方都是标识符
 *      例如：类名,变量名,方法名,接口名,包名等等
 *  2.标识符的命名规则
 *      *由26个英文字母大小写，0-9 ，_或 $ 组成 数字不可以开头。
 *      *不可以使用关键字和保留字，但能包含关键字和保留字。
 *      *Java中严格区分大小写，长度无限制。
 *      *标识符不能包含空格.
 * Java中的名称命名规范：
 * 包名：多单词组成时所有字母都小写：xxxyyyzzz
 * 类名、接口名：多单词组成时，所有单词的首字母大写：XxxYyyZzz
 * 变量名、方法名：多单词组成时，第一个单词首字母小写，第二个单词开始每个 单词首字母大写：xxxYyyZzz
 * 常量名：所有字母都大写。多单词时每个单词用下划线连接：XXX_YYY_ZZZ
 * 注意1：在起名字时，为了提高阅读性，要尽量有意义，“见名知意”。
 * 注意2：java采用unicode字符集，因此标识符也可以使用汉字声明，但是不建议使用
 */
public class IndentFieryTest {
    /**
     * @param args 程序入口的参数
     */
    public static void main(String[] args) {
        int myNumber = 1001;
        out.println("myNumber:" + myNumber);
        out.println("您好");
    }
}
