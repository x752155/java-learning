package com.learn.a28InvocationHandlerAndProxy261124;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 创建一个代理
public class ProxyUtil {



		// 给ExampleImpl 类 创建一个代理
		public static ExampleInterface createProxy(ExampleImpl exm){



				// 入参：
				// 1. 类加载器 -> 指定用哪个类加载器，去加载生成的代理类 （所在的类）
				// 2. 指定接口 -> 用于指定生成的代理 -> 拥有哪些方法 （数组 需要代理的所有）
				// 3. 指定生成的代理要做什么事情
				ExampleInterface exmInterface = (ExampleInterface) Proxy.newProxyInstance(
						ProxyUtil.class.getClassLoader(),
						new Class[]{ExampleInterface.class},
						new InvocationHandler() {
								@Override
								public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
										// 参数1: 代理对象
										// 参数2: 要运行的方法
										// 参数3: 运行方法的实际参数

										if("method1".equals(method.getName())){
												System.out.println(" === 代理捕获了 method1 === ");
										}
										if("method2".equals(method.getName())){
												System.out.println(" === 代理捕获了 method2 === ");
										}
										return  method.invoke(exm, args); // 类似apply或call的调用方式
								}
						}

				);

				// 需求：
				// 1. 获取代理的对象
				//   代理对象 = ProxyUtil.createProxy()
				// 2. 调用代理的方法
				//   代理对象.代理方法() -> 底层调用invoke
				return exmInterface;
		}
}
