package com.learn.a21packageclass261115;

public class PackageClass {

		public static void main(String[] args) {
				// 20261115 17:51 -> 18:16
				// 174 -> 174
				// 175 -> 181 联系 排序算法 略

				// 对基本数据类型的包装类 引用类型对象  表达的  基本数据类型
				// 注意：包装类，存在 null
				// Byte Short Caracter Integer Loe Double Boolean

				//jdk5以前 -> new Integer(123);
				Integer i = Integer.valueOf(123);
				Integer i2 = null; // 允许 因为是包装类
				Integer i3 = 123;
				Integer i4 = 11111;
				Integer i5 = 11111;
				System.out.println(i);
				System.out.println(i2); // null
				System.out.println("=== -128 ～ 127  创建了缓存 比较的是相同的地址 === " + (i == i3)); // true
				System.out.println("=== 不在缓存范围内 比较的是新建的地址值 === " + (i4 == i5)); // 比较地址值 false

				System.out.println("== 真正equals比较 == " + (i4.equals(i5)));


				// Integer.valueOf(i4.intValue() + i5.intValue()
				System.out.println("== 包装类的计算 先拆箱 再装箱(自动的）仍然是Integer == " +  (i4 + i5));

				// 方法 -> 进制转换 略
				// 转成int
				System.out.println("=== 转成int === " + Integer.parseInt("123"));
		}
}
