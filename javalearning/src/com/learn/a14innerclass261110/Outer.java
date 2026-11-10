package com.learn.a14innerclass261110;

public class Outer {

		static  int staticVal = 123;



		public void outerShow(){
				System.out.println("=== 外部类 普通方法 ===");
		}


		public static void outerStaticShow(){
				System.out.println("=== 访问 外部类 静态方法 ===");
		}



		public void showLocalClass(){
				int aa = 10;
				class LocalClass{
						public void showLocalClassInner(){
								System.out.println(aa);
						}
				}

				LocalClass local = new LocalClass();

				local.showLocalClassInner();

		}


		//静态内部类
		static class Inner {

				public void innerShow(){
						System.out.println("=== 非静态方法 ===");
				}

				public static void innerStaticShow(){
						// this.outerShow() // 不行，因为是非静态的

						Outer.outerStaticShow(); // 可以
						System.out.println("== 外部staticVal ==" + Outer.staticVal);
				}

		}
}
