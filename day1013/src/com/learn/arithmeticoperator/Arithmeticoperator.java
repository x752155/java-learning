package com.learn.arithmeticoperator;

public class Arithmeticoperator {
    public static void main(String[] args) {

        // 00: 12
        // 隐式转换（自动类型提升）（必须转换成相同的数据类型，进行计算）
        // 1. 取值范围小的 和 取值范围大的 运算， 小的会先提升为大的，在进行计算
        // 2. byte short char 三种会提升int， 然后进行计算

        // 把取值大的 数值 赋值给范围小的变量。不允许直接复制，必须通过强制转换进行赋值。
        int a = 300;
        byte b = (byte) a;

        byte c = 1;
        byte d = 1;
        //byte e = c + d; // 错误 因为c+d会变成int
        byte e = (byte)(c+d);  // 强制类型转换



        // 字符串的 + 就是字符串的拼接，并且产生一个新的字符串，字符串在+中（按顺序计算，遇到字符串）就会变成字符串
        String str = "123" + 123; // "123123"
        String str1 = '1' + "123" + true; // "1123true"
        String str3 = 1 + 2 + "abc"; // "3abc"



        // 字符 + 字符 或者 字符 + 数字。 会把字符通过ascii码表 转换成数字 进行计算
        System.out.println("字符加法--------");

        char tmp = 'a';
        System.out.println(tmp + 1);
        System.out.println(tmp + tmp);

        System.out.println("自增自减--------");
        // ++ --自增自减
        int tmpA = 10;
        int tmpB = 10;
        System.out.println(tmpA++ + 1); //11 先用再加
        System.out.println(++tmpB + 1); //12 先加再用

        System.out.println("逻辑运算法--------");
        // & 且 都为true 均为ture
        // | 或 存在false 就是false
        // ^ 异或 相同false 不同 true
        // ! 取反


        System.out.println("短路逻辑运算符--------");
        // && 第一个如果false，第二个不运行，返回false
        // || 第一个如果是true，第二个不执行，返回ture


        System.out.println("三元运算符 略--------");

        System.out.println("if 略 --------");


        System.out.println("switch --------");
        //普通switch 略
        // case穿透 没有break 会穿透 满足条件的switch 都会往下穿透


        //jdk12特性
        int switchA = 1;
        switch (switchA){
            case 1 -> System.out.println("1");
            case 2 -> {
                System.out.println('2');
                System.out.println('3');
            }
            default -> System.out.println("default");
        }

        System.out.println("for 循环 略 --------");

    }
}
