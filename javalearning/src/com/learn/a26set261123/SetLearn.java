package com.learn.a26set261123;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetLearn {
		public static void main(String[] args) {

				// 20261123 20:20 -> 21:03
				// 197 -> 199

				// set ->
				// 1. 无序 -> 存取顺序不一致
				// 2. 不重复 -> 去重
				// 3. 无索引
				// HashSet -> 无序 不重复 无索引
				// LinkedHashSet -> 有序 不重复 无索引
				// Tree -> 可排序 不重复 无索引

				// add clear remove contains isEmpty size
				HashSet<Integer> hs = new HashSet<Integer>();
				// add 存在bool类型返回值 代表是否添加成功
				System.out.println("=== 首次添加1 === " + hs.add(1)); // === 首次添加1 === true
				hs.add(2);
				System.out.println("=== 再次添加1 === " + hs.add(1) ); // === 再次添加1 === false
				hs.add(1);
				hs.add(3);


				// 无索引 所以使用 iterator for lambda表达式遍历
				Iterator<Integer> iterHs = hs.iterator();
				// 123
				while (iterHs.hasNext()){
						System.out.print(iterHs.next());
				}

				System.out.println();

				// 增强for遍历
				for(Integer val : hs){
						System.out.print(val); //123
				}

				System.out.println();
				//lambda表达式
				hs.forEach(item -> System.out.print(item)); //123
				System.out.println();


				// HashSet -> 哈希表（对象的hashCode方法计算后存储）-> jdk8后 由数组/链表/红黑树组成
				// 底层原理 -> 略
				// 与LinkedHashSet等使用场景 结合实际情况使用


				//TreeSet -> 自动升序排序
				// 底层 -> 红黑树 不需要重写hashcode和equals方法 略
				System.out.println("===");
				TreeSet<Integer> ts = new TreeSet<Integer>();
				ts.add(221);
				ts.add(123);
				ts.add(2);
				ts.add(1);
				ts.add(2222);
				ts.forEach(item -> System.out.print(item + " ")); // 1 2 123 221 2222
				System.out.println();

				//自定义对象 -> 第一种 -> 使用 Comparable 接口 实现排序
				TreeSet<TreeSetExample> ts2 = new TreeSet<TreeSetExample>();

				TreeSetExample tse = new TreeSetExample(1);
				ts2.add(tse);
				ts2.add( new TreeSetExample(123));
				ts2.add(new TreeSetExample(321));
				ts2.add(new TreeSetExample(1));

				ts2.forEach(tsItem ->  System.out.print(tsItem.getInnerVal() + " ")); // 321 123 1
				System.out.println();

				// 另一种 比较器 Comparator 比较 排序
				// 传入比较器时 比较器的优先级更高
				TreeSet<String> ts3 = new TreeSet<String>((str1, str2)->{
						return str2.length() - str1.length();
				});
				ts3.add("123");
				ts3.add("kkkkkkkkk");
				ts3.add("aaaa");
				ts3.add("1");
				ts3.forEach(item -> System.out.print(item + " ")); // kkkkkkkkk aaaa 123 1

		}
}
