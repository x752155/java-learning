package com.learn.a07extendslearn261101;

public class Son extends Father {


		// 父类构造方法 不会被继承
		// 但是创建子类的时候，会执行
		public Son(){
				super(); // 父类的无参构造 不写也有
				System.out.println("--- son 空参constructor 执行---");
		}

		public Son(String sonName, String fatherName) {
				// 不写super(sonName, fatherName) 会自动补充super()
				System.out.println("--- son 带参constructor 执行---");
				this.sonName = sonName;
				this.fatherName = fatherName;
		}

		//=================


		public String sonName = "sonName";

		public String fatherName = "son cover father name";



		// 方法的重写 子类重写了父类的方法，并且通过super调用了父类的方法
		@Override //重写的注解
		// public void show(String msg){ //这样子就会报错，@override
		public void show(){
				System.out.println(" --- son show ---");
				super.show(); // 执行父类成员方法
		}

		public void obtainFatherName(){
				System.out.println("this.fatherName: " + this.fatherName);
				System.out.println("super.fatherName: " + super.fatherName); //调用父类成员变量

		}

		@Override
		public String toString() {
				return "Son{sonName = " + sonName + ", fatherName = " + fatherName + "}";
		}
}
