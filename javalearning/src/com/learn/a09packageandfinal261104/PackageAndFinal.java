package com.learn.a09packageandfinal261104;

import com.learn.a08polymorphism261104.Son; // 引入包


public class PackageAndFinal {
		public static void main(String[] args) {

				// 20261104 20:24 -> 20:48
				// 133 -> 133
				// 包 -> 管理资源的文件夹
				//包名+类名 -> 全类名
				Son son = new com.learn.a08polymorphism261104.Son(); // 全类名

				// 先引入后使用， 如上
				Son son2 = new Son();

				// 默认使用本地包中的类 不需要导包
				// java.lang中的类不需要导入包
				// 注意：如果使用名称相同的两个类，就必须使用全类名
				com.learn.a07extendslearn261101.Son son3 = new com.learn.a07extendslearn261101.Son(); // 另一个Son 就必须使用 全类名


				// final 关键字 -> 类似const
				// 修饰方法后 无法更改 无法被子类重写 -> 如下例子 不想被改变的方法
				// 修饰变量后 -> 常量 -> 如下例子 无法被赋值 初始化必须被赋值 -> 一般被作为配置信息 需要大写 或者 大写_大写
				// 修饰类后 -> 最终类 无法被继承 -> 如下例子

				final int CONST_VALUE = 123;

				// CONST_VALUE = 321;// 报错


				// 如果是引用数据类型常量 地址值不可被修改 但是内部属性可以被修改
				final Son FINAL_SON = new Son();
				FINAL_SON.setAge(123123); // 允许
				// FINAL_SON = new String("123");  // 报错

				// String类型 本质上 就是 final byte 数组
				String str = new String("123");
				// @Stable
				// private final byte[] value;
		}

}


class Father{
		// 使用final 修饰方法
		public final void show(){
				System.out.println(" father show ");
		}
}




//使用final 修饰一个类
final class TmpSon extends Father{

		// 下方会报错 无法重写show方法
		// @Override
		// public void show(){
		// 		System.out.println(" son show ");
		// }
}


// 报错 无法被继承
// class  GrandSon extends TmpSon{
//
// }