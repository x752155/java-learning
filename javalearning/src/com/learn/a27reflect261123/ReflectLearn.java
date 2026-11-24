package com.learn.a27reflect261123;

import java.lang.reflect.*;

public class ReflectLearn {
		public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {


				// 下 1 -> 190暂时跳过 涉及io流 字符集 网络 异常等
				// 20261123 21:05 -> 21：54
				// 下 191 -> 193

				// 20261124 21:13 -> 21:48
				// 下 194 -> 195
				// 196 197练习跳过

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



				// 3. 获取成员变量 Field
				// Field[] getFields() -> 获取所有公共成员变量数组
				// Field[] getDeclaredFields() -> 获取 所有 成员变量数组
				// Field getField(String name) -> 获取单个公共成员变量对象
				// Field getDeclaredField(String name) -> 获取单个成员变量对象
				Field[] publicFields = clazz.getFields();
				// 如下 两个public变量
				// public java.lang.String[] com.learn.a27reflect261123.ReflectExampleClass.publicFieldArr
				// public java.lang.Double com.learn.a27reflect261123.ReflectExampleClass.publicFieldDouble
				for(Field field : publicFields){
						System.out.println(field);
				}
				// getDeclaredFields() 同上

				// 获取特定field
				Field field = clazz.getDeclaredField("protectedFiledBool");
				System.out.println(" === 获取成员变量 字段 权限修饰符 === " + field.getModifiers()); //  === 获取成员变量 字段 权限修饰符 === 4
				System.out.println(" === 获取成员变量 字段 名称 === " + field.getName());  //  === 获取成员变量 字段 名称 === protectedFiledBool
				System.out.println(" === 获取成员变量 字段 类型 === " + field.getType()); //  === 获取成员变量 字段 类型 === class java.lang.Boolean


				// void set(Object obj, Object value) -> 赋值
				// Object get(Object obj) -> 获取值
				// 必须通过对象 set/get
				System.out.println(" === get 获取对象的 成员变量值 === " + field.get(rec2)); //  === get 获取对象的 成员变量值 === null （因为这个bool没有赋值）
				field.set(rec2, true); // 赋值
				System.out.println(" === get 获取对象的 成员变量值 === " + field.get(rec2)); // === get 获取对象的 成员变量值 === true ( 此时进行了赋值 ）


				// 4. 成员方法 Method
				// Method[] getMethods() -> 相同 获取 所有的public 方法 重要！ 包含父类的所有公共方法
				// Method[] getDeclaredMethods()
				// Method getMethod(String name, Class<?>...parameterTypes)
				// Method getDeclaredMethod(String name, Class<?>...parameterTypes)


				Method[] allMethods = clazz.getMethods();
				// 如下：很多 -> 因为包含父类的
				// public java.lang.String com.learn.a27reflect261123.ReflectExampleClass.getName()
				// public java.lang.String com.learn.a27reflect261123.ReflectExampleClass.toString()
				// public void com.learn.a27reflect261123.ReflectExampleClass.setName(java.lang.String)
				// public java.lang.Integer com.learn.a27reflect261123.ReflectExampleClass.getId()
				// public void com.learn.a27reflect261123.ReflectExampleClass.setId(java.lang.Integer)
				// public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException
				// public final void java.lang.Object.wait() throws java.lang.InterruptedException
				// public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException
				// public boolean java.lang.Object.equals(java.lang.Object)
				// public native int java.lang.Object.hashCode()
				// public final native java.lang.Class java.lang.Object.getClass()
				// public final native void java.lang.Object.notify()
				// public final native void java.lang.Object.notifyAll()
				for(Method m : allMethods){
						System.out.println(m);
				}

				System.out.println(" ==== 分割线 ====== ");
				// 如下：获取本类的 所有方法
				// public java.lang.String com.learn.a27reflect261123.ReflectExampleClass.getName()
				// public java.lang.String com.learn.a27reflect261123.ReflectExampleClass.toString()
				// public void com.learn.a27reflect261123.ReflectExampleClass.setName(java.lang.String)
				// public java.lang.Integer com.learn.a27reflect261123.ReflectExampleClass.getId()
				// public void com.learn.a27reflect261123.ReflectExampleClass.setId(java.lang.Integer)
				// protected void com.learn.a27reflect261123.ReflectExampleClass.protectedFunc(java.lang.String)
				// private void com.learn.a27reflect261123.ReflectExampleClass.privateFunc(java.lang.Integer,java.lang.Boolean)
				Method[] allDeclaredMethods = clazz.getDeclaredMethods();
				for(Method m : allDeclaredMethods){
						System.out.println(m);
				}

				System.out.println(" ==== 分割线 ====== ");

				// 获取特定的method 必须有参数 -> 因为有重载 同名的存在
				Method method = clazz.getDeclaredMethod("protectedFunc", String.class);

				System.out.println(" === 获取方法的 修饰符 === " + method.getModifiers() );
				Parameter[] methodParams = method.getParameters();
				for(Parameter p : methodParams){
						System.out.println(p); // java.lang.String arg0
				}

				// 获取方法抛出的异常
				Class[] exceptionTypes = method.getExceptionTypes();
				for (Class exceptionType : exceptionTypes) {
						// 略 能够打印所有 throws 的异常类型
				}

				// 唤起方法 obj -> 调用方法的对象 -> 类似 js 的 call apply ？
				Object result = method.invoke(rec2, "唤起方法"); //  === protectedFunc === 唤起方法
				// 存在返回值 可以接收



				// 反射作用
				// -> 获取一个类里的信息 -> 获取后执行其他逻辑
				// -> 结合配置文件 -> 动态创建对象 并且调用方法 -> spring配置文件原理（后面来补充吧）


		}
}
