package com.learn.a14innerclass261110;


public class Car{
		private Engine eng;
		private String carName = "外部类属性carName";
		private int a = 10;

		public void  showCar(){
				// System.out.println("=== 访问内部类 == ", this.eng.engineName); //直接访问报错

				System.out.println(this.carName);
				Engine eng = new Engine("内部类", 123);
				eng.showEngine(); // eng能直接访问外部类的属性


		}



		public Engine generateEngine(String name, int id){
				return new Engine(name, id);
		}

		public class Engine{
				private String engineName;
				private int engineId;
				// static int staticVal = 123; // jdk16特性
				private  int a = 20;

				public Engine(String engineName, int engineId){
						this.engineName = engineName;
						this.engineId = engineId;

				}
				public void showEngine(){
						System.out.println("=== 内部类 访问 外部类的成员 === " + carName);
				}



				public void obtainA(){
						int a = 30;

						System.out.println(a); // e0 局部变量
						System.out.println(this.a); // 20 内部类属性
						// 访问外部类的a
						System.out.println(Car.this.a); // 10 外部类的属性
				}

		}
}