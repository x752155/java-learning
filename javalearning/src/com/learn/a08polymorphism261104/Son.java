package com.learn.a08polymorphism261104;

public class Son extends Father {
		private String name = "Son";
		private int age;
		public String publicValue = "Son public value";


		public void sonSpecialMethod(){
				System.out.println("子类的特有方法");
		}


		public Son() {
		}

		public Son(String name, int age) {
				this.name = name;
				this.age = age;
		}

		@Override
		public void show(){
				System.out.println("子类show方法：" + this.name + " " + this.age);
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
				return "Son{name = " + name + ", age = " + age + "}";
		}
}
