package com.learn.a11abstract261104;


// 必须成为 抽象类
public abstract class AbstractFather {

		public AbstractFather(){
				// 抽象类可以有构造方法
				System.out.println("抽象类 AbstractFather 的构造方法");
		}
		public abstract void show(); // 抽象方法，不需要写方法体
}
