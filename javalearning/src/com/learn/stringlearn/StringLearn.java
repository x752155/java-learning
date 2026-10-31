package com.learn.stringlearn;

import java.util.StringJoiner;

public class StringLearn {

		public static void main(String[] args) {
				//20261029 00:34 -> 01:19
				// 96 -> 105

				// API与API文档 略
				// String
				// 所有字符串都是String类的对象
				// String的 内容不会发生改变 其对象在创建后不会被更改
				// String 拼接后产生新的字符串

				String str = new String(); // 空构造
				String str2 = new String("123");

				//根据字符数组初始化 123
				// 字符串 -> 字符数组 -> 字符串 实现修改字符串内容
				String str3 = new String(new char[]{'1', '2', '3'});

				String str4 = new String(new byte[]{97, 98, 99}); //ascii转换字符串abc

				// String的内存模型
				//   字符串常量池 StringTable 串池 直接赋值的字符串对象，在里面
				//   jdk7之前在方法区 之后在堆内存中

				// 直接赋值的情况 简单 节约内存
				String s1 = "abc";  //串池中 有无abc，如果没有 新建"abc" 分配并且把内存赋予s1
				String s2 = "abc"; // 检查abc， 发现存在abc，再次把相同的内存，分配给s2


				String s3 = new String("abc"); // 在堆中新建字符串，并且赋予内存给s3
				String s4 = new String("abc"); // 再次新建内存空间，并且赋予s4


				// 小问题 == 的优先级和 + 一样 必须加括号
				// == 比较的本质
				//	1. 基本数据类型 -> 真实数据值
				//	2. 引用数据类型 -> 比较的是地址值
				System.out.println("s1 == s2: " + (s1 == s2)); // true 因为内存地址相同
				System.out.println("s3 == s4: " + (s3 == s4)); // false 不同内存地址 堆中的两个地址
				System.out.println("s1 == s3: " + (s1 == s3)); // false 不同内存地址 一个是堆 一个是串池

				// 正确做法： .equals
				System.out.println("s1.equals(s3): " + (s1.equals(s3))); // true 比较的是值 完全一致
				System.out.println("equalsIgnoreCase: " + "AA".equalsIgnoreCase("aa")); //忽略大小写比较


				for(int i =0; i< s1.length(); i ++){
						System.out.println(s1.charAt(i));
				}

				String s5 = "012345678";
				String ep = s5.substring(0,3) + "****" + s5.substring(7); // 包头不包尾巴  不写尾从此开始到结束
				System.out.println("加密pin：" + ep);



				// 20261031 12:24 -> 13:43
				// 105 —> 110

				// StringBuilder -> String容器 内容可变 但是并不是String类型
				// 打印是属性值，不是地址值 重写了toString方法
				StringBuilder strBuilder = new StringBuilder("123");
				// apend支持多种类型，自动转换String
				strBuilder.append(1.3);
				System.out.println("拼接后的StringBuilder: " + strBuilder);
				System.out.println("StringBuilder的reverse方法: "+ strBuilder.reverse());
				System.out.println("StringBuilder的长度: " + strBuilder.length());
				System.out.println("StringBuilder通过toString 转换为String: " + strBuilder.toString());


				//链式编 -> 不使用变量接收 继续调用其他方法
				System.out.println("StringBuilder 链式调用: " + strBuilder.append("321").reverse().toString());


				// StringJoiner -> 拼接的方法 jdk8出现
				int[] intArr = new int[]{1,2,3,4,5};
				StringJoiner strJoin = new StringJoiner(","); // 仅指定间隔符号
				StringJoiner strJoin2 = new StringJoiner(",", "start", "end"); // 指定间隔，开始和结束
				strJoin2.add("123");
				System.out.println("一个元素的StringJoiner: " + strJoin2);
				strJoin2.add("321").add("456");
				System.out.println("多个元素的StringJoiner: " + strJoin2);
				// 前端js写法 [1,2,3].joint(',')
				System.out.println("StringJoiner的长度包含前缀后缀间隔: " + strJoin2.length());
				System.out.println("StringJoiner转换为String: " + strJoin2.toString());


				// 字符串的底层原理
				// 1. 内存原理
				//		赋值是放置在串池中，新的字符串会创建，相同的字符串会复用地址
				//		new出来的，每次都会在堆中创建一个新空间
				// 2. == 的本质
				//		基本数据类型比较数据值
				//		引用数据类型 比较地址值
				// 3. 字符串拼接的底层原理
				// 	3.1 第一种情况，等号右侧拼接只有字符串，编译的时候（javac）就是最终结果 -> 变成 String strDemo = "123"
				String strDemo = "1" + "2" + "3";
				//	3.2 第二种情况，等号右侧存在变量
				String strDemo2 = "1";
				String strDemo3 = strDemo2 + "2";
				// jdk8之前，使用变量进行字符串拼接的话，会使用StringBuilder进行拼接 -> 本质如下：
				String sb = new StringBuilder().append(strDemo2).append("2").toString();
				// 相当于同时存在两个对象，一个StringBuilder对象，一个sb执行toString后的String对象

				//jdk8之后，预估长度，构建数组，变回字符串，细节略。
				//总结：不要使用+， 尽量使用StringBuilder


				// 4. StringBuilder的原理
				//	创建内存空间，然后把东西放进去
				//  默认容量（capacity）16的数组 -> 添加后依次放入 -> 超过容量，️*2+2 -> 36的容量
				// 如果添加的容量后 < 原capacity * 2 + 2 -> 以 *2+2为新容量
				// 如果 > 原capacity * 2 + 2 -> 以添加后的length为新容量作为基准
				StringBuilder sb2 = new StringBuilder();
				System.out.println("StringBuilder的初始化capacity: " + sb2.capacity() + " length: " + sb2.length()); // 16 0

				sb2.append("01234567890123456789");
				System.out.println("StringBuilder的初次扩容capacity: " + sb2.capacity() + " length: " + sb2.length()); //34 20
				sb2.append(sb2.toString() + sb2.toString() + sb2.toString() + sb2.toString());
				System.out.println("StringBuilder的第二次次扩容capacity: " + sb2.capacity() + " length: " + sb2.length()); //100 100（超过*2=2，以length为准)

				sb2.append(sb2.toString());
				System.out.println("StringBuilder的第二次次扩容capacity: " + sb2.capacity() + " length: " + sb2.length()); // 202 200 没超过 继续*2+2




		}

}
