package com.learn.a23lambda261115;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaExpression {
		public static void main(String[] args) {
				// 20261115 22:22 -> 22:44
				// 183 -> 183
				// 184 练习跳过

				Integer[] arr = {1,2,423,213,32,11,67};

				Integer[] arr2 = {1,2,423,213,32,11,67};


				// 原匿名内部类写法
				Arrays.sort(arr, new Comparator<Integer>() {
						@Override
						public int compare(Integer o1, Integer o2) {
								return o1 - o2;
						}
				});


				// 使用lambda 表达式 简写
				Arrays.sort(arr2, (Integer o1, Integer o2) -> {
						return o1 -o2;
				});


				// lambda表达式的写法（jdk8之后）
				// () -> {} 箭头函数
				// 1. 简化函数式接口（有且只有一个抽象方法的接口 能用@FunctionalInterface注解）的匿名内部类的写法
				// 如下面的例子，实现了一个函数式接口

				// lambda写法
				method(() -> {
						System.out.println("这里使用lambda表达式 重写了lambdaFunc");
				});

				// 匿名内部类的写法
				method(new LambdaFunctionalInterface() {
						@Override
						public void lambdaFunc() {
								System.out.println("这里使用匿名内部类的形式 重写了 lambda func");
						}
				});


				// 极简写法 -> 参考js的箭头函数，极简写法一样
				method(() -> System.out.println("极简lambda"));

				Arrays.sort(arr2, (o1, o2) -> o1 - o2);


		}


		public static void method(LambdaFunctionalInterface lfi){
				lfi.lambdaFunc();
		}
}

// 只有一个抽象方法的接口 -> 函数式接口，此时才能使用lambda简写实现 -> 此时才能用FunctionalInterface注解
@FunctionalInterface
interface LambdaFunctionalInterface {

		public abstract void lambdaFunc();


		public static void show(){
				System.out.println(" 这是静态方法 ");
		};
}
