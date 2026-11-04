package com.learn.a13interfaceextra261104;

public class InterImpl implements Inter {
		@Override
		public void abstractShow() {
				System.out.println("== 实现接口的 public abstract 方法 ===");
		}

		// 注意 此时没有强制实现default 方法


		// 也可以实现default方法 但是不能写default 修饰词

		@Override
		public void anotherDefaultShow() {
				Inter.super.anotherDefaultShow(); // 执行接口内的方法体（没看懂这个写法）
				System.out.println("=== 类中写的  anotherDefaultShow ===");
		}



		public void showInterfaceStaticFunc(){
				Inter.staticShow(); // 调用接口的静态方法
		}
}
