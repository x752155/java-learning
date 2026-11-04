package com.learn.a08polymorphism261104;

public class Polymorphism {

		public static void main(String[] args) {
				// 20261104 00:08 -> 01:00
				// 129 -> 132

				// 多态 -> 同类型的对象，表现出的不同形态
				// 允许 Father father = new Son();
				// 前提：
				// 	1. 有继承关系
				//	2. 父类引用指向子类对象
				//  3. 需要有方法重写


				// 多态调用
				Father fa1 = new Son();
				Father fa2 = new AnotherSon();
				Father fa3 = new Father();


				//调用的对应的类的show方法
				fa1.show(); //子类show方法：Son 0
				fa2.show(); //另一个子类show方法：AnotherSon 0
				fa3.show(); //父类的show方法：Father 0


				// 多态的规律
				//  变量调用：编译看左边，运行看左边
				//  javac编译代码中，会看左侧父类是否存在这个变量，如果有，则编译成功，否则，编译失败
				//  最终取的，也是左侧父类的value
				System.out.println(fa1.publicValue); // Father public value
				System.out.println(fa2.publicValue); // Father public value
				System.out.println(fa3.publicValue); // Father public value


				//  方法调用：编译看左边，运行看右边
				//  同样，编译会看父类有没有这个方法，通过
				//	但是最终执行的，是子类的方法
				System.out.println(fa1.getName()); // Son
				System.out.println(fa2.getName()); // AnotherSon
				System.out.println(fa3.getName()); // Father

				// 分析：
				// 成员变量：使用父类调用变量（成员变量，不会被重写覆盖）
				// 成员方法：虚方法表中，被子类重写了
				// 这里细节需要补充，并没有深入理解


				// 多态的优点和缺点
				// 优点：
				// 1. 右边对象，实现解除耦合，便于扩展和维护
				Father fa = new Son();
				fa.show(); //目前是使用的Son类的show方法。
				// 如果后续业务逻辑变更（例如，存在一个新的子类 NewSon 需要调用他的show方法），代码无需大幅修改 只需要修改 Father fa = new NewSon();
				// 如果希望改回去，就直接改回 Father fa = new Son(); 后续的.show 无需修改


				// 2. 使用父类定义对象，可以接纳所有子类作为对象。 例如上面的Father fa = new 任何子类()


				// 多态的弊端：
				// 不能调用子类的特有方法
				// 编译时候会看左边，作为Father编译，不会找到这个子类的方法（看起来是表象，需要深入理解）
				// fa1.sonSpecialMethod(); // 报错
				//解决方法，强制类型转换
				((Son) fa1).sonSpecialMethod(); // 子类特有方法

				//稳固判断
				if(fa1 instanceof Son){
						((Son) fa1).sonSpecialMethod();
				}

				// jdk 16语法糖
				// if(fa1 instanceof  Son son){
				// 		son.sonSpecialMethod();
				// }




		}


		//希望有个方法，同时支持Son AnotherSon Father
		public static void register(Father fa){
				fa.show();
		}
}
