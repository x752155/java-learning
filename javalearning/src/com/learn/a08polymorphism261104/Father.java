package com.learn.a08polymorphism261104;

public class Father {
		private String name = "Father";
		private int age;

		public String publicValue = "Father public value";

		protected String protectedValue = "protectedVale";

		public Father() {
		}

		public Father(String name, int age) {
				this.name = name;
				this.age = age;
		}


		//父类的show方法
		public void show(){
				System.out.println("父类的show方法：" + this.name + " " + this.age);
		}


		/**
		 * 获取
		 * @return name
		 */
		public String getName() {
				return name;
		}

		/**
		 * 设置
		 * @param name
		 */
		public void setName(String name) {
				this.name = name;
		}

		/**
		 * 获取
		 * @return age
		 */
		public int getAge() {
				return age;
		}

		/**
		 * 设置
		 * @param age
		 */
		public void setAge(int age) {
				this.age = age;
		}

		public String toString() {
				return "Father{name = " + name + ", age = " + age + "}";
		}
}
