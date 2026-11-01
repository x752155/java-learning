package com.learn.arraylistlearn20261101;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListLearn {
		public static void main(String[] args) {

				// 20261101
				// 12:30 -> 12:51
				// 111 -> 121
				// 112 -> 120 跳过
				// 集合 长度变化的存储
				// 1. 自动扩容
				// 2. 不能直接存储基本数据类型，只能存储引用数据类型

				//指定存储数据类型的arraylist
				ArrayList<String> arrList = new ArrayList<String>();
				ArrayList<Objects> arrList2 = new ArrayList<>(); // jdk7后写法

				System.out.println("集合: " + arrList); //打印出集合内部的内容，并非地址

				arrList.add("321");
				arrList.add("321"); // 返回值一定是true
				arrList.add("123");
				System.out.println("集合add: " + arrList);

				boolean res = arrList.remove("321"); // 移除指定item，成功true 失败false
				System.out.println("集合remove: "+ res + " " + arrList); //删除第一个

				String deletedItem = arrList.remove(1); // 删除指定index的item，返回被删除的item
				System.out.println("集合remove 下标被删除的item:  " + deletedItem + " 集合: " + arrList);


				String setItem = arrList.set(0, "new Item");
				System.out.println("集合set 修改，被修改的原元素: " + setItem + " 集合: " + arrList);


				System.out.println("集合get获取指定item: " + arrList.get(0) + " 集合长度是: " + arrList.size());


				// 包装类 int -> Integer string -> String 等

		}
}
