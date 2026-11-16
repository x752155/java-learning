package com.learn.a24collectionlist261115;

import java.util.*;

public class CollectionList {
		public static void main(String[] args) {
				// 20261115 22:45 -> 23:16
				// 185 -> 186

				// 20261116 20:44 -> 21:04
				// 187 -> 188
				// 189 数据结构 190 ArrayList源码 191 LinkedList 源码 跳过


				// 单列集合 -> Collection（接口）
				// 存在add clear remove contains isEmpty size等方法
				// 1. List（接口）下面都是实现类 -> 有序 可重复 有索引
				// 1.1 ArrayList
				// 1.2 LinkedList
				// 1.3 Vector 移除

				Collection<Integer> arrList = new ArrayList<Integer>();
				arrList.add(1); // 存在返回值 true -> 添加成功 false -> 添加失败（collection大多成功 因为可重复）
				arrList.add(2);
				arrList.add(1);
				arrList.add(3);
				System.out.println(arrList); // [1, 2, 3]
				arrList.remove(1); // 删除成功返回true 如果元素不存在 删除返回false
				System.out.println(arrList); // [2, 1, 3] 删第一个

				//contains 底层依赖equals方法，自定义javabean需要实现equals方法。
				// 不然的话，会使用Object的equals，判断地址值进行contains计算。
				System.out.println(arrList.contains(3)); // true
				System.out.println(arrList.isEmpty()); // false
				System.out.println(arrList.size()); // 3




				// 迭代器 -> Collection可以获取迭代器对象
				// 启动后，next()指向第一个元素
				// iter.hasNext()  是否有下一个元素
				// iter.next() 获取下一个元素的value 然后移动指针到这个元素上
				Collection<String> arrStrList = new ArrayList<String>();
				arrStrList.add("a");
				arrStrList.add("b");
				arrStrList.add("c");
				arrStrList.add("e");
				arrStrList.add("f");
				arrStrList.add("g");
				Iterator<String> iterStrList = arrStrList.iterator();
				while (iterStrList.hasNext()){
						System.out.print(iterStrList.next()); // abcdefg
				}
				System.out.println();
				// iterStrList.next(); // 报错 NoSuchElementException
				//1. 遍历完成后，指针不会复位 -> 重新获取新的迭代器对象
				//2. 循环中，只能使用一次next -> 使用前，检查hasnext()，如果有就能调用
				//3. 遍历时，不能用集合的方式增改


				// 增强for循环 -> 只有单列集合 和 数组 才能使用增强for遍历
				for(String item:arrStrList){
						System.out.print(item);
				}
				System.out.println();
				// 快捷键 arrStrList.for
				// 修改增强for中的变量 item 不会修改arrStrList

				// jdk 8 -> lambda表达式 -> 与js相同
				arrStrList.forEach( item ->{
						System.out.print(item);
				});
				System.out.println();



				// List的特殊方法 -> 增删改查等 略
				// 循环 -> 上述三种 + 普通for循环（因为存在索引） + 列表迭代器
				List<Integer> list = new ArrayList<Integer>();
				list.add(0, 111);
				list.add(0, 222);
				list.add(0, 333);
				System.out.println(list); // [333, 222, 111]

				//列表迭代器
				ListIterator<Integer> listIter = list.listIterator(); // 迭代器的子接口
				// 存在previous() 和 hasPrevious()方法
				// 支持add和remove
				while (listIter.hasNext()){
						Integer i = listIter.next();
						if(i == 111){
								listIter.add(1);
						}
				}
				System.out.println(list); // [333, 222, 111, 1]


				// ArrayList的源码和使用 略

				// LinkedList -> 双向链表 查询慢 增删快
				// 存在对First和Last的增删改查 特有方法  其他和list和collection的方法相同


				// 2. Set（接口）下面都是实现类 -> 无序 不重复 无索引
				// 2.1 HashSet
				// 2.1.1 LinkedHashSet
				// 2.2 TreeSet

				// 双列集合 -> Map



		}
}
