package com.zgw.homework0409;
/*
定义一个矩形类Rectangle：（知识点：对象的创建和使用）[必做题]
2.1 定义三个方法：getArea()求面积、getPer()求周长，showAll()分别在控制台输出长、宽、面积、周长。
2.2 有2个属性：长length、宽width
2.3 通过构造方法Rectangle(int width, int length)，分别给两个属性赋值
2.4 创建一个Rectangle对象,并输出相关信息 
 */

import java.util.*;

public class Rectangle {
	//两个属性
	int length;
	int width;
	//构造方法
	public Rectangle()
	{
		
	}
	public Rectangle(int width,int length)
	{
		this.width=width;
		this.length=length;
	}
	//定义三个方法 getArea()求面积、getPer()求周长，showAll()分别在控制台输出长、宽、面积、周长。
	public int getArea()
	{
		int Area = this.width*this.length;
		return Area;
	}
	public int getPer()
	{
		int Per = 2*(this.width+this.length);
		return Per;
	}
	public void showAll()
	{
		System.out.println("长为："+this.length);
		System.out.println("宽为："+this.width);
		System.out.println("面积："+getArea());
		System.out.println("周长："+this.getPer());
	}
	
	public static void main(String[] args)
	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入矩形的长：");
		int length = scanner.nextInt();
		System.out.println("请输入矩形的宽：");
		int width = scanner.nextInt();
		scanner.close();
		
		Rectangle rectangle = new Rectangle(width,length);
		rectangle.showAll();
		
	}
}
