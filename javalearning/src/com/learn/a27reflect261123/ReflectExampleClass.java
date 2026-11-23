package com.learn.a27reflect261123;

public class ReflectExampleClass {

		private Integer id;
		private String name;



		// public 构造方法1
		public ReflectExampleClass() {
		}


		// private 构造方法2
		private ReflectExampleClass(Integer id, String name) {
				this.id = id;
				this.name = name;
		}

		@Override
		public String toString() {
				return "ReflectExampleClass{" +
								"id=" + id +
								", name='" + name + '\'' +
								'}';
		}

		// protected 构造方法3
		protected ReflectExampleClass(Integer id) {
				this.id = id;
		}

		// public 构造方法4
		public ReflectExampleClass(String name) {
				this.name = name;
		}



		public Integer getId() {
				return id;
		}



		public void setId(Integer id) {
				this.id = id;
		}

		public String getName() {
				return name;
		}

		public void setName(String name) {
				this.name = name;
		}
}
