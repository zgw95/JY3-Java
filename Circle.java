package com.zgw.java;
import java.awt.Point;
public class Circle
{
	Point center;
	int r;
	int x;
	int y;
	//������������һ�µķ����й��췽��,������
	public Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}
	public Circle(int x,int y,int r ) {
		this(new Point(x,y),r);
		this.x=x;
		this.y=y;	
	}
	//����Բ�����
	public double area()
	{
		return Math.PI*this.r*this.r;
	}
	//�ж����꣨x,y���Ƿ���Բ��	
	public double distance(int x, int y)
	{
		return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y)* (this.y - y));
	}
	
	public boolean contains(int x,int y)
	{
		return this.center.distance(x, y)>=this.r ;
	}
	//����һ�����Ƿ���Բ��
	public boolean contains(Point p)
	{
		return this.contains(p.x, p.y);
	}
	public static void main(String[] args)
	{
		Circle circle = new Circle(3,4,5);
		System.out.println("����ľ��룺"+circle.distance(6, 8));
		System.out.println("���Ƿ���Բ�ڣ�"+circle.contains(6, 8));
		System.out.println("���Ϊ��"+circle.area());
	}
}
