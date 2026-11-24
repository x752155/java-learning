package com.learn.a27reflect261123;

public class ReflectExampleClass {



		// 以下有四个成员变量
		private Integer id;
		private String name;
		public  String[] publicFieldArr;
		protected Boolean protectedFiledBool;
		public  Double publicFieldDouble;


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


		protected  void protectedFunc(String example){
				System.out.println(" === protectedFunc === " + example);
		};

		private void privateFunc(Integer intVal, Boolean boolVal){
				System.out.println(" === privateFunc === " + intVal + " " + boolVal);
		};
}
