package com.learn.a26set261123;


// 注意 这里的Comparable必须是自己的类
public class TreeSetExample implements Comparable<TreeSetExample>{

		private Integer innerVal;

		TreeSetExample(Integer i){
				this.innerVal = i;
		}

		// 通过实现Comparable接口 来进行排序
		@Override
		public int compareTo(TreeSetExample o) {
				return  o.getInnerVal() - this.getInnerVal();
		}

		public Integer getInnerVal() {
				return innerVal;
		}
}
