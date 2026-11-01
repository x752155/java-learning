package com.learn.a06staticlearn261101;

public class MyArrUtil {

		//工具类
		//私有化构造方法

		private  MyArrUtil(){};



		public  static String printArr(int[] arr){
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i< arr.length; i++){
					sb.append(arr[i]);
			}
			return sb.toString();
		}

		public  static double getAverage(int[] arr){
				int total = 0;
				for(int i = 0; i < arr.length; i++){
						total += arr[i];
				}
				return (double) total /arr.length;

		}
}
