package com.learn.a07extendslearn261101;

public class ExtendsLearn {

		public static void main(String[] args) {


				// 继承
				// 20261101 16:30 -> 18:30
				// 124 -> 128

				// 当类存在共性 子类是父类的一种 使用继承 优化代码
				// 概念：略

				// java 只支持单继承 不支持多继承  -> 一个子类 只能继承一个父类  子类不能同时继承多个父类
				// java 支持多层继承（a 继承 b 继承 c）最终继承至Object






				// 子类能够继承父类的内容：
				// 1. 构造方法 （子类不会继承父类构造方法 但是创建子类实例的时候 会执行父类的构造方法）
				//  非私有 -> 不能
				//  私有 -> 不能

				// 子类构造方法内部 一定含有 super() 或者 super(带参构造)
				// 即使自己不写 jvm 也会自动补充 super() 无参构造

				// 类似的一个类中 可以使用this(xxx) 调用本类的构造方法

				//执行结果
				// -- father 空参constructor 执行--
				// --- son 空参constructor 执行---
				Son s = new Son();
				// -- father 空参constructor 执行--  注意 默认添加的 是 super()
				// --- son 带参constructor 执行---
				Son s2 = new Son("son", "father");





				// 2. 成员变量
				//  非私有 -> 能
				//  私有 -> 能继承 但是无法调用
				// System.out.println(s.privateFatherName); // 报错，无法直接访问
				s.setPrivateFatherName("son change father private value"); //间接修改
				System.out.println(s.getPrivateFatherName()); // 间接访问 son change father private value
				System.out.println(s.fatherName); // son cover father name
				System.out.println(s.sonName); // sonName

				// 继承时 默认优先使用距离近的（局部子类）
				// 	-> this 使用子类（子类没有找父类）
				// 	-> super 指定使用父类（父类没有的话继续往上找）
				// 运行结果
				// this.fatherName: son cover father name
				// super.fatherName: fatherName
				s.obtainFatherName(); // 只能使用一次super



				// 3. 成员方法
				//  虚方法表（虚方法：非private 非static 非final 的方法） -> 能
				//  否则 -> 不能
				// jvm中的每个类 会 抽取虚方法表
				//  虚方法：非private 非static 非final 的方法
				//  继承时 子类会继承虚方法表 并添加自己的虚方法
				// 父类的虚方法 才会被 子类继承

				// 重写：子类重写函数名和参数 和父类一样的方法 -> 本质上是虚方法表内方法的覆盖
				// 和成员变量一样 同样满足就近原则 同样存在this和super

				// 1. 重写名称 形参 和父类一致
				// 2. 重写时，访问权限子类大于等于父类
				// 3. 重写时， 返回类型 子类小于等于父类 细节略
				// 4. 重写的方法尽量保持一致

				// @Override -> 注解 显式声明 这个方法 是重写的 会辅助校验
				// --- son show ---  被子类重写的方法
				// --- father show --- 执行super
				s.show();
				s.fatherMethod(); //  --- fatherMethod --- 继承自父类的方法


				// 程序运行中 -> terminal -> jps 获取进程的id -> jhsdb 内存分析 暂时跳过





		}
}
