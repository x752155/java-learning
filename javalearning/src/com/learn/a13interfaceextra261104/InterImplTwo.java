package com.learn.a13interfaceextra261104;

public class InterImplTwo extends InterTwoAdapter{
		// 通过继承Adapter 实现只写接口所需要的方法

		@Override
		public void method1(){
				System.out.println("== 通过重写Adapter的method1 实现只重写接口的method1 ===");
		}
}
