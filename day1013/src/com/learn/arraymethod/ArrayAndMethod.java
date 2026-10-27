package com.learn.arraymethod;

public class ArrayAndMethod {

    public static void main(String[] args) {

        // 20261014 23:36 开始
        // 20261015 00:21 结束
        // 53 -> 73

        System.out.println("数组 ==== ");
        // 存储同种数据类型的数组 -> 会执行隐性转换 double可以存放int byte
        // 初始化 为存储元素开辟内存空间 ！创建后长度不会变化
        // 静态初始化
        int[] arr = new int[]{1,2,3};
        int[] arr2 = {1, 2, 3, 4};
        System.out.println("打印数组的地址：" + arr); //地址 [I@279f2327 [数组 I int类型元素 @ 间隔富豪  xxxx 真正的16进制地址

        System.out.println("打印数组与索引：" + arr[1]);

        // 数组赋值
        arr2[1] = 123; // 覆盖后原数据不存在
        System.out.println("打印数组赋值：" + arr2[1]);

        // 遍历数组 for 循环 略

        // 数组动态初始化
        //  只指定数组长度，系统分配初始值
        //  初始值 int 0 bool false 饮用 null 字符 '\u0000' 空格
        //  访问超过索引的数组元素 ArrayIndexOutOfBoundsException 异常
        int[] arr3 = new int[3];
        System.out.println("动态初始化初始值：" + arr3[0]);


        //  内存模型
        // 栈 方法运行时候的内存，例如main方法，在方法栈内执行
        //  开始执行进栈， 执行完毕出栈
        // 堆 存储对象或者数组，使用new创建的，都在堆内存中
        //  new出来的就是存放的地址开头空间 每次new 都会创建一块堆空间
        // 方法区 存放可以运行的class文件
        // 本地方法栈 jvm使用操作系统的时候使用
        // 寄存器 cpu使用


        //方法： 参数与返回值
        String res = showMsg("入参");
        System.out.println("res: " + res);

        showMsg();


        // 方法的内存原理
        //  方法开始执行 -> 进栈
        //  方法执行完毕 -> 出栈
        //  方法调用的基本内存原理
        //  方法调用的


        // 基本数据类型 -> 跟随方法存在 存放栈空间
        // 引用数字类型
        // -> new 出来的数据类型 在堆中创建空间 将地址赋值给堆空间的变量
        // -> 赋值 赋予的是 地址值。 使用同一地址


        //20261020 00:36
        // 73
        // 方法的值传递
        // 基本数据类型，不变化
        int num = 100;
        System.out.println("change前：" + num);
        change(num);
        System.out.println("change后：" + num);

        int[] yinyongArr = {1, 2, 3};
        //传递引用数据类型，传递的是地址值，会发生改变
        System.out.println("change前：" + yinyongArr[0]);
        change(yinyongArr);
        System.out.println("change后：" + yinyongArr[0]);
    }





    // 方法 程序最小的执行单元
    public static String showMsg(String param) {
        String returnStr = "方法 " + param;
        System.out.println(returnStr);
        return returnStr; //void 可以不返回
    }


    // 方法重载
    //  同一个类内
    //  方法名相同 每个方法具有不同的参数类型，个数 构成重载关系
    //  与返回值无关
    public  static void showMsg(){
        System.out.println("构成重载 void无需返回");
    }


    public static void change(int num) {
        num = 200;
    }

    public static void change(int[] arr) {
        arr[0] = 200;
    }
}
