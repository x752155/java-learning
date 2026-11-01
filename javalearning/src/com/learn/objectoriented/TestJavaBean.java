package com.learn.objectoriented;

public class TestJavaBean {


		// 写好私有属性后
		// shift + command + , 快速生成javabean
		private  String name;
		private Integer id;

		public TestJavaBean() {
		}

		public TestJavaBean(String name, Integer id) {
				this.name = name;
				this.id = id;
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
		 * @return id
		 */
		public Integer getId() {
				return id;
		}

		/**
		 * 设置
		 * @param id
		 */
		public void setId(Integer id) {
				this.id = id;
		}

		public String toString() {
				return "TestJavaBean{name = " + name + ", id = " + id + "}";
		}





}
