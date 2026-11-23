package com.learn.a25generics261116;

import java.util.ArrayList;
import java.util.List;

public class GenericsClass {
		public static void main(String[] args) {

				// 20261116 21:17 -> 22:01
				// 192 -> 193
				// 194 -> 196 数据结构 tree 跳过

				// 泛型 在编译阶段 约束数据类型 并进行检查
				List<Integer> list = new ArrayList<Integer>();

				//如果不指定类型 -> 默认为Object -> 获取数据后 无法使用多态 实现特有功能
				List list2 = new ArrayList();
				list2.add("123");
				list2.add(123);
				list2.add(null);

				// java泛型只在编译期有效 -> 编译之后按照Object处理 -> 使用时通过强制类型转换 转换原来的类型
				// 1. 泛型不支持基本数据类型
				// 2. 泛型支持具体类型和具体类型的子类
				// 3. 默认为Object

				//泛型类
				GenericsClassExample<Integer> gce = new GenericsClassExample<Integer>();
				gce.setInnerVal(123);
				System.out.println(gce.getInnerVal()); // 123


				// 泛型方法
				// 方法中形参 不确定
				// 1. 使用类后面定义的泛型
				gce.getValue(111); // 111
				// 2. 在方法上 定义自己的泛型
				gce.getValue2(312, "123" ); // == 类定义的泛型T 312 == 自己申明的泛型 E == 123
				gce.getValue2(312, new int[]{1, 2, 3, 4}); // == 类定义的泛型T 312 == 自己申明的泛型 E == [I@452b3a41


				// 拓展参数 + 自定义泛型
				gce.getValue3(1,2,3,4,5,6); // == 1 2 3 4 5 6
				gce.getValue3(1,2,3); // == 1 2 3


				// 泛型接口 相同 接口类型不确定 例如 Collection 和 List
				// 使用带泛型的接口
				// 1. 实现类给出具体类型
				GenericsInterfaceImpl gii = new GenericsInterfaceImpl();
				System.out.println(gii.genericsInterfaceFunc(123)); // 123
				// 2. 实现类 延续泛型，创建对象的时候再确认
				GenericsInterfaceImpl2<String> gii2 = new GenericsInterfaceImpl2<String>();
				System.out.println(gii2.genericsInterfaceFunc("字符串")); // 字符串




		}



}
