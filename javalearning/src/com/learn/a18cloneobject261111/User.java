package com.learn.a18cloneobject261111;


// 需要实现Clonable接口 标记性 没有特殊含义
public class User implements  Cloneable{

		private String name;
		private int id;
		private int[] arr = {1,2,3,4};

		public User(String name, int id) {
				this.name = name;
				this.id = id;
		}

		public User(String name, int id, int[] arr) {
				this.name = name;
				this.id = id;
				this.arr = arr;
		}

		@Override
		public String toString() {
				return "User{" +
								"name='" + name + '\'' +
								", id=" + id +
								'}';
		}

		public String getName() {
				return name;
		}

		public int getId() {
				return id;
		}

		public void setName(String name) {
				this.name = name;
		}

		public void setId(int id) {
				this.id = id;
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
				// 重写父类的clone方法

				return super.clone();
		}
}
