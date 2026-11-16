package com.learn.a25generics261116;


//泛型接口的第一种实现 -> 类在实现接口的时候，确定类型
public class GenericsInterfaceImpl implements GenericsInterface<Integer>{
		@Override
		public Integer genericsInterfaceFunc(Integer val) {
				return val;
		}
}
