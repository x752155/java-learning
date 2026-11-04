package com.learn.a13interfaceextra261104;

public interface Inter {


		public abstract void abstractShow();

		public default void defaultShow(){
				System.out.println("=== 写在接口中的 default 默认方法 defaultShow ===");
		};


		public default void anotherDefaultShow(){
				System.out.println("=== 写在接口中的 另一个 default 默认方法 anotherDefaultShow ===");
		};


		public static void staticShow(){
				System.out.println("=== inter 中的静态方法 无需重写 ===");
		}

}
