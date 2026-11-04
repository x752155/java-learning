package com.learn.a12interface261104;

public class SonTwo extends Father implements InterfaceFunc {

		@Override
		public void fatherAbstractShow() {
				System.out.println("=== SonTwo 实现 父类抽象方法 fatherAbstractShow ===");
		}

		@Override
		public void interfaceShow() {
				System.out.println("=== SonTwo 实现 接口的方法 interfaceShow ===");
		}

		@Override
		public void InterfaceFuncFatherShow() {
				System.out.println("=== SonTwo 实现 接口的父接口的方法 InterfaceFuncFatherShow ===");
		}
}
