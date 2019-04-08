package com.zgw.java;

public class Vehicle {
	int speed;
	int size;
	
	public void move()
	{
		System.out.println("已启动");
	}
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}
	public void setSize(int size)
	{
		this.size = size;
	}
	public void speedUp()
	{
		speed = speed + 2;
		System.out.println("汽车加速后的速度" + speed);
	}
	public void speedDown()
	{
		if(speed > 5)
		{
			speed = speed - 5;
			System.out.println("汽车减速后速度："+speed);
		}
		else
		{
			System.out.println("已刹车");
		}
	}
	
	public static void main(String[] args)
	{
		//对象实例化
		Vehicle bmw = new Vehicle();
		bmw.setSize(280);
		System.out.println("宝马车体积："+bmw.size);
		
		bmw.move();
		
		bmw.setSpeed(80);
		System.out.println("宝马车速度："+bmw.speed);
		
		bmw.speedUp();
		bmw.speedDown();
	}
}
