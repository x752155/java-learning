package com.learn.a25generics261116;

public class GenericsClassExample<T> {
		private T innerVal;

		public GenericsClassExample(T innerVal) {
				this.innerVal = innerVal;
		}


		public GenericsClassExample() {
		}

		public T getInnerVal() {
				return innerVal;
		}


		public void setInnerVal(T innerVal) {
				this.innerVal = innerVal;
		}


		// 泛型方法 -> 使用类的泛型
		public void getValue(T val){
				System.out.println(val);
		}

		// 泛型方法 -> 方法上申明自己的泛型
		public <E> void getValue2(T val, E val2){
				System.out.println("== 类定义的泛型T " + val + " == 自己申明的泛型 E == " + val2);
		}

		// 泛型方法 -> 定义自己的泛型 + 拓展参数
		public <E> void getValue3(E...e){
				String str = "== ";
				for(int i=0;i < e.length; i++){
						// 支持动态长度的参数
						str += e[i];
						str += " ";
				}
				System.out.println(str);
		}

}
