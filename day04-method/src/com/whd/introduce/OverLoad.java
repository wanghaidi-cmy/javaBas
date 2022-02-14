package com.whd.introduce;

/**
 * 1.方法的重载的概念
 * 定义：在同一个类中，允许存在一个以上的同名方法，只要它们的参数个数或者参数类型不同即可。
 * <p>
 * 总结："两同一不同":同一个类、相同方法名
 * 参数列表不同：参数个数不同，参数类型不同
 * <p>
 * 2.
 * 构成重载的举例：
 * 举例一：Arrays类中重载的sort() / binarySearch()；PrintStream中的println()
 * 举例二：
 * //如下的4个方法构成了重载
 * public void getSum(int i,int j){
 * System.out.println("1");
 * }
 * <p>
 * public void getSum(double d1,double d2){
 * System.out.println("2");
 * }
 * <p>
 * public void getSum(String s ,int i){
 * System.out.println("3");
 * }
 * <p>
 * public void getSum(int i,String s){
 * System.out.println("4");
 * }
 * <p>
 * 不构成重载的举例：
 * //如下的3个方法不能与上述4个方法构成重载
 * //   public int getSum(int i,int j){
 * //       return 0;
 * //   }
 * <p>
 * //   public void getSum(int m,int n){
 * //
 * //   }
 * <p>
 * //   private void getSum(int i,int j){
 * //
 * //   }
 * 3. 如何判断是否构成方法的重载？
 * 严格按照定义判断：两同一不同。
 * 跟方法的权限修饰符、返回值类型、形参变量名、方法体都没关系！
 * 4.如何确定类中某一个方法的调用：
 * 方法名 ---> 参数列表
 * <p>
 * <p>
 * 面试题：方法的重载与重写的区别？
 * <p>
 * throws\throw
 * String\StringBuffer\StringBuilder
 * Collection\Collections
 * final\finally\finalize
 * ...
 * <p>
 * 抽象类、接口
 * sleep() / wait()
 *
 * @author wanghaidi
 * @create 2022-02-14 10:19
 */
public class OverLoad {
    /**
     * 如下四个方法构成重载
     *
     * @param i 形式参数
     * @param j 形式参数
     */
    public void getSum(int i, int j) {
        System.out.println("1");
    }

    /**
     * 如下四个方法构成重载
     *
     * @param d1 形式参数
     * @param d2 形式参数
     */
    public void getSum(double d1, double d2) {
        System.out.println("2");
    }

    /**
     * 如下四个方法构成重载
     *
     * @param s 形式参数
     * @param i 形式参数
     */
    public void getSum(String s, int i) {
        System.out.println("3");
    }

    /**
     * 如下四个方法构成重载
     *
     * @param i 形式参数
     * @param s 形式参数
     */
    public void getSum(int i, String s) {
        System.out.println("4");
    }
}
