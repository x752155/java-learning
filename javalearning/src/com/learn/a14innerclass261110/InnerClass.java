package com.learn.a14innerclass261110;

public class InnerClass {


		// 20261110 20:37 -> 21:45
		// 140 -> 142
		public static void main(String[] args) {

				// 类的五大属性 属性 方法 构造方法 代码块 内部类
				// 类内部定义的类
				// 类的内部属性 -> 可能本身就构成了一个类
				// 1. 内部类代表的事物是外部类的一部分
				// 2. 内部类的单独出现 没有意义


				// 如下面的例子
				// 1. 内部类可以直接访问外部类的成员 包括私有
				// 2. 外部类访问内部类的成员 必须新建对象
				Car c = new Car();
				// 外部类属性carName
				// === 内部类 访问 外部类的成员 === 外部类属性carName
				c.showCar();


				// 1. 成员内部类 -> 成员位置 外部类的成员 如 Car类
				// 创建方法
				// 1.1 外部类创建并提供
				Car.Engine eng = c.generateEngine("name", 345);
				// 1.2 通过内部类的new创建（非private）
				Car.Engine eng2 = new Car().new Engine("eng2", 111);
				eng2.showEngine(); // 也是可以访问 car的属性的
				// jdk 16之前不能定义静态变量 之后可以
				// System.out.println(Car.Engine.staticVal);

				// 1.3 访问外部类的参数
				// 解码后，成为两个class文件 Car.class Car$Engine.class
				// 内部类内部会记录自己的外部对象的地址值 Car.this 通过这个 访问外部类的信息
				eng.obtainA();



				// 2. 静态内部类
				// 	2.1 静态static修饰的内部类 成员内部类的一种
				//  2.2 静态内部类只能访问外部类中的静态方法
				// === 访问 外部类 静态方法 ===
				// == 外部staticVal ==123
				Outer.Inner.innerStaticShow();

				//  2.3 如果希望访问非静态方法 需要先创建外部类对象
				Outer.Inner oi = new Outer.Inner();
				oi.innerShow(); // === 非静态方法 ===


				// 3. 局部内部类 -> 内部类定义在方法里 性质类似局部变量
				// 外界 无法直接使用 需要方法内部创建对象使用
				// 可以访问外部类的成员 可以访问局部变量
				// 用的不多，略
				Outer o = new Outer();
				o.showLocalClass(); //10


				// 4. 匿名内部类





		}



}
