package com.learn.staticlearn20261101;

public class StaticLearn {
		public static void main(String[] args) {

				// 20261101
				// 12:53 -> 14:13
				// 121 -> 123

				// static关键字

				Student s1 = new Student();
				s1.setName("测试1");
				s1.setAge(123);
				s1.setGender("male");

				Student.teacherName = "教师名称"; // 跟类绑定，一次赋值，全域可访问

				System.out.println(s1.toString());

				Student s2 = new Student();
				s2.setName("测试222");
				s2.setAge(222);
				s2.setGender("female");
				System.out.println(s2.toString());

				// static ->
				//	1. 静态变量 -> 所有的对象共享，使用类名 或者对象，都能调用
				//		当类的字节码文件加载进方法区，会在堆中创建static存储的位置，静态区
				//		jdk8之前，在方法区，jdk8之后，创建在堆中静态区 （ 随着类加载，优先于对象出现 ）
				//    需要成员共享的，使用static进行修饰

				//	2. 静态方法 -> 被static修饰的，被共享的，静态方法 大部分用于测试和工具类
				//		工具类 ->	实现功能的类，私有化构造方法（因为创建实例没意义），方法通过类名调用（静态方法）
				//		测试类 ->  测试其他类是否正确，带有main方法的类，程序的入口
				//		javabean类 -> 描述事物的类
				//		类名调用静态方法
				//		与静态变量一起，在堆内存中静态区中

				//通过类名.static静态方法 调用工具类
				int[] arr = {1,2,3,4,5,6};
				System.out.println(MyArrUtil.printArr(arr));
				System.out.println("工具类调用静态方法 计算均值: " + MyArrUtil.getAverage(arr));


				// 静态方法 -> 只能访问静态变量和静态方法，没有this关键字
				// 非静态方法 -> 能够访问静态变量 和 静态方法

				//public static void main(String[] args)
				//  static -> 被jvm调用，不需要创建对象 即可访问 —> main方法是静态的，所以测试类其他方法，也需要是静态的
				// args历史获取键盘输入，已废弃


		}
}
