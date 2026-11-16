package com.learn.a25generics261116;


// 泛型接口的第二种 -> 继续继承泛型
public class GenericsInterfaceImpl2<T> implements GenericsInterface<T>{


		@Override
		public  T genericsInterfaceFunc(T val) {
				return val;
		}
}
