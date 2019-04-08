package com.zgw.java;
import java.awt.Point;
public class Circle
{
	Point center;
	int r;
	int x;
	int y;
	//方法名与类名一致的方法叫构造方法,或构造器
	public Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}
	public Circle(int x,int y,int r ) {
		this(new Point(x,y),r);
		this.x=x;
		this.y=y;	
	}
	//计算圆的面积
	public double area()
	{
		return Math.PI*this.r*this.r;
	}
	//判断坐标（x,y）是否在圆内	
	public double distance(int x, int y)
	{
		return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y)* (this.y - y));
	}
	
	public boolean contains(int x,int y)
	{
		return this.center.distance(x, y)>=this.r ;
	}
	//计算一个点是否在圆内
	public boolean contains(Point p)
	{
		return this.contains(p.x, p.y);
	}
	public static void main(String[] args)
	{
		Circle circle = new Circle(3,4,5);
		System.out.println("两点的距离："+circle.distance(6, 8));
		System.out.println("点是否在圆内："+circle.contains(6, 8));
		System.out.println("面积为："+circle.area());
	}
}
