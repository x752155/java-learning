package com.learn.a28InvocationHandlerAndProxy261124;

public class InvocationHandlerAndProxy {

		public static void main(String[] args) {

				// 20261124 21:51 -> 22:05
				// 下 198 -> 198


				// 20261125 20:53 -> 21:33
				// 下 199 -> 199

				// 代理 -> 避免侵入式修改 -> 无侵入式的增加额外功能
				// 调用者 --调用--> 代理 --调用--> 对象

				// 对象通过代理 -> 转移部分功能
				// 对象如果希望方法被代理 -> 代理内部必须有相同的方法

				// newProxyInstance -> 实现代理 mybatis

				// 需求：
				// 1. 获取代理的对象
				//   代理对象 = ProxyUtil.createProxy(被代理的对象)

				ExampleImpl exm = new ExampleImpl();

				ExampleInterface exmInter = ProxyUtil.createProxy(exm);


				//  === 代理捕获了 method1 ===
				// ==== 这里被代理的方法 1 ====  test
				exmInter.method1(" test ");

				//  === 代理捕获了 method2 ===
				//  ==== 这里被代理的方法 2 ====
				exmInter.method2();


				// 2. 调用代理的方法
				//   代理对象.代理方法() -> 底层调用invoke


		}
}
