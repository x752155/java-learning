package com.learn.a13interfaceextra261104;

public class InterfaceExtraExample {

		public static void main(String[] args) {

				// 20261104 22:46 -> 23:27
				// 139 -> 139

				// jdk8 后 接口的新方法 -> 支持方法体
				// 问题：接口新增方法 会导致 所有的实现类 出现问题
				// 解决方法：使用默认方法
				// public default 返回值 func(args) {}
				// 1. 默认方法非 抽象方法 不强制重写 -> 如果重写 移除default 关键字
				// 2. public 可以省略 default 不可以
				// 3. 如果实现了多接口，多接口存在名字相同的默认方法 -> 必须重写 这个例子省略了 可以ai补充
				InterImpl impl = new InterImpl();

				// 实现后执行
				impl.abstractShow(); // == 实现接口的 public abstract 方法 ===


				// 无需实现 就能执行方法体内容
				impl.defaultShow(); // === 写在接口中的 default 默认方法 defaultShow ===

				// 重写一个default方法
				// === 写在接口中的 另一个 default 默认方法 anotherDefaultShow ===
				// === 类中写的  anotherDefaultShow ===
				impl.anotherDefaultShow();



				// 允许 定义静态方法 -> 使用static修饰 -> 只能通过接口名调用
				// public static void show()
				impl.showInterfaceStaticFunc(); // === inter 中的静态方法 无需重写 ===


				// jdk9 后 新增私有方法 抽取接口default 方法中重复的方法 构建成私有方法 -> 只供接口使用 -> 代码略
				//  静态的逻辑也是类似，有静态了 -> 抽离公共 -> 因为能被外部访问 -> 新增private static void func()
				// private void 通用方法(){}; // public default会被外界调用，所以使用private -> 给默认方法服务
				// private static void 静态私有(){} // 静态私有 -> 给静态方法服务


				// 一个方法的参数是接口的时候， 可以传递接口所有实现类的对象 -> 接口多态 （待补充例子
				// 类似 interface inter = new 实现接口的类(); // 同样编译看左边 执行看右边 （ 执行右边类的方法）
				interPoly(impl); // == 实现接口的 public abstract 方法 ===


				// 设计模式 -> 适配器设计模式 -> 解决接口与接口实现类之间的矛盾
				// 接口存在10个abstract方法 -> 但是实现类只需要第五个方法 -> 但是剩下9个都必须实现 -> 使用中间类adapter
				InterTwo impl2 = new InterImplTwo();
				impl2.method1(); // == 通过重写Adapter的method1 实现只重写接口的method1 ===
		}



		public static void interPoly(Inter impl){
				impl.abstractShow(); // == 实现接口的 public abstract 方法 === 接口的多态
				//相当于 inter impl = new InterImpl()
		}
}
