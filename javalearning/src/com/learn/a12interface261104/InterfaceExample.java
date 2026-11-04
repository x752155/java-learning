package com.learn.a12interface261104;

public class InterfaceExample {

		public static void main(String[] args) {
				// 20261104 22:17 -> 22:44
				// 135 -> 138

				// 接口 interface
				// 众多子类的共性被抽离到父类 但是存在 仅有部分子类所共有的功能 -> 使用接口 定义这些功能
				// 同时 如果其他类 也需要这个功能，也可以 使用接口 实现这些功能 -> 对行为和规则的共性的抽象


				// 接口 无法实例化


				SonOne son1 = new SonOne();
				son1.fatherAbstractShow(); // === SonOne 实现 父类抽象方法 fatherAbstractShow ===


				SonTwo son2 = new SonTwo();
				son2.fatherAbstractShow(); // === SonTwo 实现 父类抽象方法 fatherAbstractShow ===
				son2.interfaceShow(); // === SonTwo 实现 接口的方法 interfaceShow ===


				// 接口的细节
				// 1. 成员变量 -> 默认常量 -> public static final
				System.out.println(son2.interfaceIntValue); // 123
				// 2. 构造方法 -> 无
				// 3. 成员方法
				//  3.1 jdk7之前 -> 只能定义抽象方法 -> public abstract
				//  3.2 jdk8 -> 能定义有方法体的方法
				//  3.3 jdk9 -> 可以定义私有方法


				// 类与类 -> 只能单继承 没有多继承 只支持多层继承
				// 类与接口 -> 类实现接口 支持单/多实现 -> 出现接口的方法名冲突的话 重写一次即可
				// 接口与接口 -> 继承关系 支持单/多继承 -> 如果实现类 继承了接口，就需要实现往上所有的接口方法
				son2.InterfaceFuncFatherShow(); //=== SonTwo 实现 接口的父接口的方法 InterfaceFuncFatherShow ===

		}
}
