package com.learn.a18cloneobject261111;

public class CloneObject {
		public static void main(String[] args) throws CloneNotSupportedException {


				// 20261111 21:38 -> 22:02
				// 160 -> 160
				// Objects的内容在a17笔记内


				// 对象的拷贝 -> Object默认浅拷贝
				User user1 = new User("123", 13);

				User user2 = (User) user1.clone();

				System.out.println(user2.clone()); // User{name='123', id=13}

				user2.setName("new user2");

				System.out.println(user1);
				System.out.println(user2);

				System.out.println(user2 == user1); // false  浅克隆（内部的属性 没有执行深克隆，只简单克隆了一层参数）如果user中有数组属性，那user1和user2都是用的一个地址

				// 浅拷贝 -> 地址值相同，或者内部属性没有执行深拷贝

				// 略 和js相同

				// 真正的深拷贝 -> 第三方 -> 和js类似Json.parse(Json.stringify(obj))
				// 自己实现深拷贝：略


		}
}
