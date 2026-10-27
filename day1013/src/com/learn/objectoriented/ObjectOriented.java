package com.learn.objectoriented;


public class ObjectOriented {
    public static void main(String[] args) {
        // 20261020 00:47 -> 01:22
        // 81 -> 84
        // 类
        //  成员变量
        //  成员方法
        //  构造器
        //  代码块
        //  内部类
        Phone p = new Phone();

        // p.brand = "测试";
        // p.price = 123.321;
				p.setBrand("测试");
				p.setPrice(123.321);

        System.out.println(p.getBrand());
        System.out.println(p.getPrice());

        //用来描述一类事物的类 -> javabean类
        //编写main方法的类 -> 测试类
        //1. 类名首字母大写，驼峰
        //2. 一个java文件能够定义多个类，但是只能有一个类是public修饰，且public修饰的类就是代码文件名
        //3. 成员变量： 修饰符 数据类型 变量名称 = 初始化值（可以不赋予，此时赋予初始化值）
        p.call();


        // 封装 继承 多态 面向对象的三个属性
        // 封装
        // 对象代表什么，就得封装对应的数据，并且提供数据对应的行为
        // 注意：在公司业务中，是否涉及封装，如何设计封装
        // 待办：找一个例子

        // private关键字
        // private关键字 修饰的成员 只能本类中才能使用
        // System.out.println(p.key); // error private
				// private如果需要被其他类使用，需要提供get set方法。

				//command + n 快速处理类的constructor getter setter等
        System.out.println("phone key：" + p.getKey());

        p.setKey("new");
        p.setKey("key123");
				System.out.println("phone key：" + p.getKey());


				//20261021 00:33 -> 00:56
				//	84 -> 87
				// 就近原则：变量距离的越近（作用域），就使用谁
				// this 指向当前调用方法的对象
				Phone p2 = new Phone();
				p2.setKey("key222");
				p2.showThisValue();
				p.showThisValue();

				//构造方法：创建对象的时候，给成员变量进行初始化
				// 修饰符 类名(参数){  方法体  }
				// 没有return
				// 没定义的话，系统给出默认的空参构造
				// 可以给出带参数的构造方法（重载）
				// 类都需要全参构造和无参构造
				Phone p3 = new Phone("品牌", "123"); // 带参构造：brand 品牌


				// 标准javaBean
				// 	类名 大驼峰
				//	成员变量使用private修饰
				//	提供至少两个构造方法 1. 无参构造 2. 全部参数的构造方法
				//	成员方法 1. 每个成员变量 都必须有set和get 2. 补充其他行为


				// 内存模型
				// 	堆 new出来的空间 存在地址
				// 	栈 方法执行进栈 先进后出
				// 	方法区 运行类的字节码文件 xxx.clase jdk中拆出来成为元空间，部分功能被拆分给元空间，部分拆到堆
		}
}
