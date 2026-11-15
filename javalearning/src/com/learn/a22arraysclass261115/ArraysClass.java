package com.learn.a22arraysclass261115;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysClass {

		public static void main(String[] args) {

				// 20261115 18:23 -> 18:34
				// 182 -> 182



				Integer[] intArr = {1,2,3,4,5,65,7};
				System.out.println("== 数组转换字符串 == " + Arrays.toString(intArr));

				// 二分查找 等其他方法 略 自己看文档 ai写


				// 排序

				Arrays.sort(intArr, new Comparator<Integer>() {
						@Override
						public int compare(Integer o1, Integer o2) {
								return o1 - o2;
						}
				});


				// [1, 2, 3, 4, 5, 7, 65]
				System.out.println(Arrays.toString(intArr));
		}
}
