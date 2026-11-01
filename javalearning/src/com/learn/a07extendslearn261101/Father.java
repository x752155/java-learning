package com.learn.a07extendslearn261101;

public class Father {
		// 父类构造方法 不会被继承
		// 但是创建子类的时候，会执行
		public Father(){
				System.out.println(" -- father 空参constructor 执行--");
		}
		public Father(String privateFatherName, String fatherName) {
				System.out.println(" -- father 带参constructor 执行--");
				this.privateFatherName = privateFatherName;
				this.fatherName = fatherName;
		}

		//父类私有属性 能继承
		// 子类实例 通过下面的getter setter 方法进行调用
		private String privateFatherName = "private fatherName";






		//父类共有属性 能继承
		public String fatherName = "fatherName";



		public void show(){
				System.out.println("--- father show ---");
		}

		public void fatherMethod(){
				System.out.println(" --- fatherMethod ---");
		}


		/**
		 * 获取
		 * @return privateFatherName
		 */
		public String getPrivateFatherName() {
				return privateFatherName;
		}

		/**
		 * 设置
		 * @param privateFatherName
		 */
		public void setPrivateFatherName(String privateFatherName) {
				this.privateFatherName = privateFatherName;
		}



		public String toString() {
				return "Father{privateFatherName = " + privateFatherName + ", fatherName = " + fatherName + "}";
		}
}
