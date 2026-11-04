package com.learn.a10permissionmodifierandblock261104;

import com.learn.a08polymorphism261104.Father;

public class PermissionModifierAndBlock {

		public static void main(String[] args) {
				// 20261104 20:49 -> 21:38
				// 134 -> 134
				// 权限修饰符 -> 控制一个成员能被访问的范围 用来修饰类 方法 构造方法 内部类
				//                private       空      protected     public
				// 同一类中           ✅         ✅        ✅            ✅
				// 同一包中的其他类               ✅         ✅            ✅
				// 不同包下的子类                           ✅            ✅
				// 不同包下的无关类                                       ✅
				// private 本类
				// 默认 本包 -> 例如上个包 a09的Father类 本包就无法访问
				// protected 外部不同包的子类 -> 子类就能访问 无论在哪儿

				// 成员变量一般私有 成员方法一般公有

				Father a08Father = new Father();
				System.out.println(a08Father.publicValue); // 没问题 不同包的不同类能访问
				// System.out.println(a08Father.protectedValue); //报错

				ShowProtectedSon son = new ShowProtectedSon();
				son.showProtectedFatherValue(); //protectedValue



				// 局部代码块 -> 方法内部的代码块 -> 提前结束变量的生命周期 -> 一般不用
				showExample();

				// 构造代码块 -> 构造方法的共性内容 优先于构造方法执行 -> 一般也不用


				// ==== 静态代码块 只会执行一次 ====   -> 静态代码块执行
				// 这里是构造代码块
				// 这里是空参构造
				// ConstructBlockExample{num = 246, name = example contructor block}
				ConstructBlockExample example = new ConstructBlockExample();
				System.out.println(example.toString());


				// 这里是构造代码块
				// 这里是有参构造  ！注意这里打印的内容是有参
				// ConstructBlockExample{num = 246, name = example contructor block}
				ConstructBlockExample example1 =  new ConstructBlockExample(111, "name name");
				System.out.println(example1.toString());



				// 静态代码块 -> static修饰 随着类的加载而加载 自动触发 只执行一次 -> 用于数据初始化
				// 如上的例子


		}

		public static void showExample(){
				int a= 1;
				// 局部代码块
				System.out.println(a); // 1
				{
						a = 2;
						System.out.println(a); // 2
						int b = 3;
						System.out.println(b); // 3
				}
				System.out.println(a); // 2
				// System.out.println(b); // 报错，因为被回收了
		}
}

class ShowProtectedSon extends Father {
		public void showProtectedFatherValue(){
				System.out.println(this.protectedValue); // 可以访问，不同包的子类
		}
}

