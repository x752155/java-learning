package com.learn.a27reflect261123;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class ReflectLearn {
		public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {


				// 下 1 -> 190暂时跳过 涉及io流 字符集 网络 异常等
				// 20261123 21:05 -> 21：54
				// 下 191 -> 193

				// 反射 -> 允许对封装类的字段 方法 和 构造函数的信息 进行编程式访问
				// 类之类 使用之使用 对象之对象

				// 1. 获取class对象
				// 1.1 Class.forName("类名") -> 源代码阶段 xxx.java
				// 必须是全类名 -> 最常用
				Class clazz = Class.forName("com.learn.a27reflect261123.ReflectExampleClass");
				System.out.println("== Class.forName == " + clazz); // == Class.forName == class com.learn.a27reflect261123.ReflectExampleClass


				// 1.2 类名.class -> 加载阶段 xxx.class
				// 当做参数进行传递
				Class<ReflectExampleClass> clazz2 = ReflectExampleClass.class;
				// 获取的本质上是一样的
				System.out.println(clazz2 == clazz); // true

				// 1.3 对象.getClass -> 运行阶段
				// 当有对象时才能使用
				ReflectExampleClass rec = new ReflectExampleClass();
				Class clazz3 = rec.getClass();
				System.out.println(clazz3 == clazz2); // true



				// 2. 构造方法 Constructor

				// Constructor<?>[] getConstructors() -> 获取公共构造方法对象数组
				// Constructor<?>[] getDeclaredConstructors(); -> 返回所有构造方法对象的数组
				// getDeclaredConstructor -> 返回单个的构造方法对象
				// getConstructor -> 返回单个公共的构造方法对象
				// com.learn.a27reflect261123.ReflectExampleClass -> 共有4个构造方法
				Constructor[] publicCons = clazz.getConstructors(); // 获取所有public构造方法

				// public com.learn.a27reflect261123.ReflectExampleClass()
				// public com.learn.a27reflect261123.ReflectExampleClass(java.lang.String)
				for(Constructor con : publicCons){
						System.out.println(con);
				}

				// public com.learn.a27reflect261123.ReflectExampleClass()
				// public com.learn.a27reflect261123.ReflectExampleClass(java.lang.String)
				// protected com.learn.a27reflect261123.ReflectExampleClass(java.lang.Integer)
				// private com.learn.a27reflect261123.ReflectExampleClass(java.lang.Integer,java.lang.String)
				Constructor[] allCons = clazz.getDeclaredConstructors();
				for(Constructor con : allCons){
						System.out.println(con);
				}

				 // == 获取特定入参的public构造方法 == public com.learn.a27reflect261123.ReflectExampleClass(java.lang.String)
				Constructor stringInputCons = clazz.getConstructor(String.class);
				System.out.println(" == 获取特定入参的构造方法 == " + stringInputCons);

				//  == 获取双入参的构造方法 == private com.learn.a27reflect261123.ReflectExampleClass(java.lang.Integer,java.lang.String)
				Constructor dualInputCons = clazz.getDeclaredConstructor(Integer.class, String.class);
				System.out.println(" == 获取双入参的构造方法 == " + dualInputCons);


				// 权限修饰符 编码
				System.out.println(" == 获取构造函数的 权限 修饰符类型 == " + dualInputCons.getModifiers()); // 2 代表 private
				System.out.println(" == 获取构造函数的参数 数量 == " + dualInputCons.getParameterCount() ); // 2 2个入参
				//获取构造函数入参的类型
				Parameter[] dualInputConsParams = dualInputCons.getParameters();
				// java.lang.Integer arg0
				// java.lang.String arg1
				for (Parameter param : dualInputConsParams){
						System.out.println(param);
				}


				// 利用构造函数 创建实例 （private例子） -> 暴力反射

				// Exception in thread "main" java.lang.IllegalAccessException: class com.learn.a27reflect261123.ReflectLearn cannot access a member of class com.learn.a27reflect261123.ReflectExampleClass with modifiers "private"
				// 	at java.base/jdk.internal.reflect.Reflection.newIllegalAccessException(Reflection.java:392)

				// 如上，如果不临时授予权限，会报错，因为是private类型
				dualInputCons.setAccessible(true); // -> 临时取消private权限校验
				ReflectExampleClass rec2 = (ReflectExampleClass) dualInputCons.newInstance(123, "private构造");
				System.out.println(rec2.toString()); // ReflectExampleClass{id=123, name='private构造'}



				// 3. 字段 Field

				// 4. 成员方法 Method

		}
}
