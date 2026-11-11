package com.learn.a16mathandsystem261111;

public class MathAndSystem {

		public static void main(String[] args) {
				// 20261111 20:47 -> 21:05
				// 155 -> 157
				// 156 跳过
				// Math类 -> 和js差不多 大部分略
				System.out.println("=== 绝对值 ===" + Math.abs(-2.2)); // 2.2
				System.out.println("=== 向上取整 ===" + Math.ceil(2.3)); // 3
				System.out.println("=== 向下取整 ===" + Math.floor(2.3)); // 2


				// System类
				// 0 -> 正常停止  其他 -> 异常停止
				// System.exit(1); // 退出 Process finished with exit code 1

				// 时间戳 long类型
				System.out.println("=== 当前时间戳：" +  System.currentTimeMillis());

				// 拷贝数据
				int[] arr = new int[]{1,2,3,4};
				int[] arr2 = new int[4];
				// 第一个参数：数据源
				// 第二个参数dsrcPos: 数据源开始位置
				// 第三个参数：拷贝到的数组
				// 第四个参数destPos：目的地数组的开始索引
				// 第五个参数：拷贝的个数 -> 小于目的地的容量
				// 基本数据类型 -> 类型必须一致
				// 细节略 使用的时候再学
				System.arraycopy(arr, 0, arr2, 0, arr.length);

				for(int i =0; i < arr2.length; i++){
						System.out.println(arr2[i]);
				}

		}
}
