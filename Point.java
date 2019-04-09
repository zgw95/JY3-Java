package com.zgw.homework0409;
/* 第一题：
 * 定义一个点类Point，包含2个成员变量x、y分别表示x和y坐标，
 * 2个构造器Point()和Point(intx0,y0),
 * 以及一个movePoint（int dx,int dy)方法实现点的位置移动，
 * 创建两个Point对象p1、p2，分别调用movePoint方法后，打印p1和p2的坐标。
 * 
 */
public class Point {
	int x;
	int y;
	//两个构造器Point()和Point(intx0,y0)
	public Point()
	{
		
	}
	public Point(int x0,int y0)
	{
		this.x=x0;
		this.y=y0;
	}
	//movePoint（int dx,int dy)方法实现点的位置移动
	public void movePoint(int dx,int dy)
	{
		this.x+= dx;
		this.y+= dy;
		System.out.print("沿x轴移动了"+dx+"；沿y轴移动了"+dy+"。");
		System.out.println("移动后的坐标为" + "(" + this.x + "," + this.y + ")");
	}
	
	public static void main(String[] args)
	{
		Point p1 = new Point(0,0);
		Point p2 = new Point(1,2);
		
		System.out.println("p1的坐标为" + "(" + p1.x + "," + p1.y + ")");
		p1.movePoint(2,3);
		System.out.println("p2的坐标为" + "(" + p2.x + "," + p2.y + ")");
		p2.movePoint(2,3);
	}
}

