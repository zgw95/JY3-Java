package com.zgw.java;

public class Vehicle {
	int speed;
	int size;
	
	public void move()
	{
		System.out.println("������");
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
		System.out.println("�������ٺ���ٶ�" + speed);
	}
	public void speedDown()
	{
		if(speed > 5)
		{
			speed = speed - 5;
			System.out.println("�������ٺ��ٶȣ�"+speed);
		}
		else
		{
			System.out.println("��ɲ��");
		}
	}
	
	public static void main(String[] args)
	{
		//����ʵ����
		Vehicle bmw = new Vehicle();
		bmw.setSize(280);
		System.out.println("���������"+bmw.size);
		
		bmw.move();
		
		bmw.setSpeed(80);
		System.out.println("�����ٶȣ�"+bmw.speed);
		
		bmw.speedUp();
		bmw.speedDown();
	}
}
