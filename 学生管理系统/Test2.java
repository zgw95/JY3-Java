package com.zgw.java;

public class Test2 {
		static
		{
			System.out.println("��̬�����");
		}
		
		{
			System.out.println("���");
		}
		public Test2()
		{
			System.out.println("�޲ι�����");
		}
		public Test2(String str)
		{
			System.out.println(str);
		}
		
		public void abc()
		{
			System.out.println("���ǲ����õ�");
		}
		public static void main(String[] args) {
			new Test2("��һ...");
			System.out.println("main����");
			Test2 nqw = new Test2();
			nqw.abc();
			
		}
}
	

