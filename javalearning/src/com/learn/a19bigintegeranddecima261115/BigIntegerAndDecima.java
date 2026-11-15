package com.learn.a19bigintegeranddecima261115;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

public class BigIntegerAndDecima {




		public static void main(String[] args) {

				// 20261115 15:37 -> 16:05
				// 161 -> 162
				// 163 -> 168 爬虫 正则 跳过


				// big integer -> 一旦创建 不能更改
				Random r = new Random();
				BigInteger bi1 = new BigInteger(10, r);
				System.out.println("=== 随机初始化0-(2 ^ 10) -1  -> " + bi1);



				// 通过字符串获取指定整数  ->  注意 字符串是整数
				BigInteger bi2 = new BigInteger("123123123123");
				System.out.println("=== 获取指定的bigInteger -> " + bi2);

				// 获取指定进制的整数
				// 1. 字符串的数字必须是整数
				// 2. 字符串的数字必须和进制吻合（2进制就写二进制字符串）
				BigInteger bi3 = new BigInteger("1001", 2);
				System.out.println("=== 获取指定进制的整数 -> " + bi3); // 9


				// 静态方法获取BigInteger对象
				// 1. 只能获取long范围内的数字
				// 2. 内部对常用数据 -16 ~ 16 执行了优化，已经创建好，不会新建对象
				BigInteger bi4 = BigInteger.valueOf(123);
				BigInteger bi5 = BigInteger.valueOf(14);
				BigInteger bi6 = BigInteger.valueOf(14);

				System.out.println("=== valueof 静态方法 -> " + bi4);
				System.out.println("=== -16 ~ + 16 地址一样 -> " +  (bi5 == bi6)); // true 地址一样


				// 计算通过方法 -> 其他方法略
				BigInteger sum = bi5.add(bi4);
				System.out.println("=== 因为无法修改 所以通过方法 + 通过新建对象接受对象 -> " + sum);
				System.out.println("=== 获取较大的数据 -> " + (bi5.max(bi4)));



				// BigDecima
				// 问题 -> 和js一样
				System.out.println(0.1 + 0.2); // 0.30000000000000004

				// 字符串创建 -> 精确
				// double构建 -> 不精确构建
				// 所以一般使用字符串构建
				BigDecimal bd1 = new BigDecimal("0.1");
				BigDecimal bd2 = new BigDecimal("0.2");
				System.out.println("=== BigDecimal 执行 精确小数计算 -> " + bd2.add(bd1));

				// 静态方法获取对象
				// double 取值范围内 -> 建议使用valueof
				// 0 ~ 10内的会返回已经创建好的对象 不会重新new
				BigDecimal bd3 = BigDecimal.valueOf(1.234);


				// 方法：加减乘除 略 如上
				// 源码与原理 略






		}}
