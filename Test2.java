package com.zgw.java;

public class Test2 {
		static
		{
			System.out.println("静态代码块");
		}
		
		{
			System.out.println("你好");
		}
		public Test2()
		{
			System.out.println("无参构造器");
		}
		public Test2(String str)
		{
			System.out.println(str);
		}
		
		public void abc()
		{
			System.out.println("我是测试用的");
		}
		public static void main(String[] args) {
			new Test2("周一...");
			System.out.println("main方法");
			Test2 nqw = new Test2();
			nqw.abc();
			
		}
}
	

