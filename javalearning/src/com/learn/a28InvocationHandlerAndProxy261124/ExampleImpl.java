package com.learn.a28InvocationHandlerAndProxy261124;

public class ExampleImpl implements  ExampleInterface{

		private Integer id;
		private  String name;

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

		@Override
		public String  method1(String str){
				System.out.println("==== 这里被代理的方法 1 ==== " + str);
				return "123";
		}


		@Override
		public void method2(){
				System.out.println(" ==== 这里被代理的方法 2 ==== ");
		}
}
