package com.learn.a15anonymousclass261110;

public class AnonymousClass {
		public static void main(String[] args) {

				// 20261110 21:54 -> 22:16
				// 143 -> 143
				// 144 -> 154 写demo 跳过


				// 匿名内部类
				// new 类名/接口名(){
				// 		重写方法
				// }


				// 另一种重写接口的方式
				// class 类名 implements 接口 {  实现接口 ... }

				// 匿名内部类（下方括号内部区域） ->  移除了 class 类名 implements 接口 -> 同样需要重写接口中所有抽象方法
				// 1. 下方的写法 本质上 是新建了一个实现了这个接口的匿名内部类对象
				// 2. 括号代表空参构造
				// 3. implements
				// 4. 下方的写法 本质上就是接口多态 -> 接口 inter = new 接口实现类()
				Inter iter = new Inter(){
						@Override
						public void interFunc() {
								System.out.println("== 匿名内部类重写接口方法 ===");
						}
				};
				iter.interFunc(); // == 匿名内部类重写接口方法 ===



				//匿名内部类（实现抽象类）
				// 1. 新建了 继承并实现了Example这个类的 匿名内部类对象
				// 2. 括号代表空参构造
				// 3. extends
				// 4. 下面的写法，右侧 本质是Example的子类，左侧是Example，本质上，构成了一个多态
				Example exp = new Example(){
						@Override
						public void abstractClassFunc(){
								System.out.println("== 匿名内部类 重写 抽象类 的 方法 ==");
						}
				};

				exp.abstractClassFunc(); // == 匿名内部类 重写 抽象类 的 方法 ==



				// 一个例子，结合多态 少写一个class 但是实际的用处，需要思考下
				//=== 临时新建匿名内部类 继承Example类 实现抽象方法 ===
				AnonymousClass.method(
								new Example() {
										@Override
										public void abstractClassFunc() {
												System.out.println("=== 临时新建匿名内部类 继承Example类 实现抽象方法 === ");
										}
								}
				);

		}


		public static void method(Example exm){
				exm.abstractClassFunc();
		}
}
