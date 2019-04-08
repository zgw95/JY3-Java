package com.zgw.java;

public class Test {
	public static void main(String[] args) 
	{
		Book b1 = new Book();
		b1.name = "安徒生童话";
		b1.author ="安徒生";
		b1.price = 99.99;
		System.out.println("书名："+b1.name);		
		System.out.println("作者："+b1.author);
		
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