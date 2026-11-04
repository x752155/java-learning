package com.learn.a11abstract261104;

public class AbstractExample {
		public static void main(String[] args) {
				// 20261104 21:40 -> 21:57
				// 135 -> 135

				// 共性的方法 抽离到父类后 由于 每一个子类执行的内容不一样 -> 父类不能确定具体的方法内容 -> 使用抽象方法 子类必须重写此方法
				// 如果一个类中 存在 抽象方法 -> 此类必须声明为抽象类

				// 抽象类
				// 1. 不能被实例化
				// AbstractFather abstractFather = new AbstractFather(); 报错

				// 2. 抽象类 不一定 有抽象方法， 有抽象方法的 一定是 抽象类

				// 3. 可以有构造方法

				// 4. 继承抽象类的子类 -> 要么是抽象类 -> 要么必须实现 所有 抽象方法

				//抽象类 AbstractFather 的构造方法 如上 3 构造方法
				Son son = new Son();
				son.show(); //  子类继承抽象类 AbstractFather 必须重写抽象方法 show

				// 抽象类和方法的意义
				//  强制子类按照规范 进行重写

		}
}


