package com.learn.a17runtimeandobject261111;



import java.io.IOException;
import java.util.Objects;

public class RuntimeAndObject {

		public static void main(String[] args) throws IOException {

				// 20261111 21:06 -> 21:37
				// 158 -> 160

				// Runtime -> 虚拟机的环境对象
				Runtime runtime = Runtime.getRuntime();
				Runtime runtime2 = Runtime.getRuntime();
				System.out.println("=== 同时只能获取一个runtime实例对象 ===" + (runtime2 == runtime));

				// runtime.exit(1); // 和system本质上一样


				System.out.println("=== 获取cpu线程数量 ===" + runtime.availableProcessors());

				System.out.println("=== 获取总内存大小 单位字节：" + runtime.maxMemory() / 1024 / 1024); // 4096 (mb)

				System.out.println("=== 已经获取的总内存大小 单位字节：" + runtime.totalMemory() / 1024 / 1024); // 260

				System.out.println("=== 剩余内存的大小 单位字节：" + runtime.freeMemory() / 1024 / 1024); // 254

				// System.out.println("=== 执行exe命令：" + runtime.exec("ls")); // 需要处理异常？ === 执行exe命令：Process[pid=98545, exitValue=0]


				// Object
				// 1. 无成员变量
				// 2. 只有空参构造方法 -> 所以所有构造方法 默认隐藏调用父类的构造方法

				// toString -> 和js一样的逻辑，子类可以重写toString实现字符串展示不同内容
				// 打印对象 等同于toString
				Object obj = new Object();
				System.out.println("Object toString：" + obj.toString()); //Object toString：java.lang.Object@f6f4d33  包名+类名 + @ + 地址

				//equals -> 比较方法
				// 默认Object的equals比较的是地址值
        // 调用左侧对象内部的equals方法

				class Example {
						public int a;
						@Override
						public boolean equals(Object o){
								Example tmpExp = (Example) o;

								return tmpExp.a == this.a;
						}
				}


				Example exp  = new Example();
				exp.a = 123;
				Example exp2 = new Example();
				exp2.a = 123;
				System.out.println(exp2.equals(exp)); // true


				// Objects 工具类

				System.out.println("== 使用Objects进行比较：" + Objects.equals(exp, exp2)); // true
				System.out.println("== 判断对象是否为 null：" + Objects.isNull(exp)); // false
				System.out.println("== 判断对象是否为 非null：" + Objects.nonNull(exp)); // true




		}
}
