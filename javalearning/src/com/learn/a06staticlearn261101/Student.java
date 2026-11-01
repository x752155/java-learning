package com.learn.a06staticlearn261101;

public class Student {
		private String name;
		private int age;
		private String gender;


		// 新增老师姓名 通过static修饰
		// 跟类绑定，一次赋值，所有的实例都能够获取
		public static String teacherName = "teacher";

		public Student() {
		}

		public Student(String name, int age, String gender) {
				this.name = name;
				this.age = age;
				this.gender = gender;
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

		/**
		 * 获取
		 * @return gender
		 */
		public String getGender() {
				return gender;
		}

		/**
		 * 设置
		 * @param gender
		 */
		public void setGender(String gender) {
				this.gender = gender;
		}

		public String toString() {
				return "Student{name = " + name + ", age = " + age + ", gender = " + gender + ", teacherName = " + teacherName + " }";
		}



		public  void study(){
				//存在隐藏的this，当前方法调用者的地址值，虚拟机进行赋值
				System.out.println(this.name + " studying... ");
		}


		public static void  testStatic(){
				// 不存在this 静态方法跟随类创建
				// 无法访问非静态的 成员变量 和 成员方法
				// this.study(); // 报错
				System.out.println("静态方法.... " + teacherName); // 可以，只能访问静态修饰过的内容
				// System.out.println(this); 报错

		}
}
