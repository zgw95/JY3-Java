package com.zgw.java;

public class Test {
	public static void main(String[] args) 
	{
		Book b1 = new Book();
		b1.name = "��ͽ��ͯ��";
		b1.author ="��ͽ��";
		b1.price = 99.99;
		System.out.println("������"+b1.name);		
		System.out.println("���ߣ�"+b1.author);
		
	}
}
class Book
{
	String name;
	String author;
	double price;
	
	public void f()
	{
		
	}
}