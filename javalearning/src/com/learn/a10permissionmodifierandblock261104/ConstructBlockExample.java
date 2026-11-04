package com.learn.a10permissionmodifierandblock261104;

public class ConstructBlockExample {
		private int num = 123;
 		private String name = "example";


		 //静态代码块
		static {
				 System.out.println(" ==== 静态代码块 只会执行一次 ====");
		 }


		 // 构造代码块 抽离构造函数的共性 优先执行
		{
				this.name = this.name + " contructor block";
				this.num = this.num * 2;
				System.out.println("这里是构造代码块");
		}

		public ConstructBlockExample() {
				System.out.println("这里是空参构造");
		}

		public ConstructBlockExample(int num, String name) {
				System.out.println("这里是有参构造");
		}





		/**
		 * 获取
		 * @return num
		 */
		public int getNum() {
				return num;
		}

		/**
		 * 设置
		 * @param num
		 */
		public void setNum(int num) {
				this.num = num;
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

		public String toString() {
				return "ConstructBlockExample{num = " + num + ", name = " + name + "}";
		}
}
