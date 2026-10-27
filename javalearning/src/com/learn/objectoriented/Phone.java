package com.learn.objectoriented;

// java bean类 没有main方法
// 	类名 大驼峰
//	成员变量使用private修饰
//	提供至少两个构造方法 1. 无参构造 2. 全部参数的构造方法
//	成员方法 1. 每个成员变量 都必须有set和get 2. 补充其他行为
public class Phone {
    private String brand;
    private double price;
    private String key = "keykey";

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

		public void setBrand(String brand) {
				this.brand = brand;
		}

		public void setPrice(double price) {
				this.price = price;
		}


		// 体现封装 对数据的处理 最好放在封装类的内部
    // ！！对private的成员变量，都要提供get和set方法
    public void setKey(String newKey) {
        if(newKey.contains("key")){
            // key = newKey; // 这么写不好
					this.key = newKey;
        }else{
            System.out.println("not allowed");
        }
    }


    public String getKey() {
        return key;
    }

    public void  call(){
        System.out.println("calling.....");
    }


		public void showThisValue(){
			System.out.println("this.key: " + this.key);
		}



		//构造方法 空参
		public Phone(){
				System.out.println("默认空参构造");
		}

		//构造函数 全参
		public Phone(String brand, String key){
				this.brand = brand;
				this.key = key;
				System.out.println("带参构造：brand key  " + brand + " " + key);
		}


}
