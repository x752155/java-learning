package com.jd.demo1;


// project -> module -> package -> class 一对多的关系，package就是文件夹

// 类
// 新建类 -> 右键new
// 删除类 -> 右键delete
// 修改类名 -> 右键Refactor -> Rename


// 模块
// 新建 File -> Project Structure -> + -> new Module
// 删除
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println(1);
        String str = "123";
        str += "123";
        System.out.println(str);
    }
}
