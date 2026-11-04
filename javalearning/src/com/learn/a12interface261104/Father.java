package com.learn.a12interface261104;

public abstract class Father {
		private String name = "123";
		private int num = 123;


		public abstract void  fatherAbstractShow();


		public Father() {
		}

		public Father(String name, int num) {
				this.name = name;
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

		public String toString() {
				return "Father{name = " + name + ", num = " + num + "}";
		}
}
