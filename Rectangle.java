package com.zgw.homework0409;
/*
����һ��������Rectangle����֪ʶ�㣺����Ĵ�����ʹ�ã�[������]
2.1 ��������������getArea()�������getPer()���ܳ���showAll()�ֱ��ڿ���̨���������������ܳ���
2.2 ��2�����ԣ���length����width
2.3 ͨ�����췽��Rectangle(int width, int length)���ֱ���������Ը�ֵ
2.4 ����һ��Rectangle����,����������Ϣ 
 */

import java.util.*;

public class Rectangle {
	//��������
	int length;
	int width;
	//���췽��
	public Rectangle()
	{
		
	}
	public Rectangle(int width,int length)
	{
		this.width=width;
		this.length=length;
	}
	//������������ getArea()�������getPer()���ܳ���showAll()�ֱ��ڿ���̨���������������ܳ���
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
		System.out.println("��Ϊ��"+this.length);
		System.out.println("��Ϊ��"+this.width);
		System.out.println("�����"+getArea());
		System.out.println("�ܳ���"+this.getPer());
	}
	
	public static void main(String[] args)
	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������εĳ���");
		int length = scanner.nextInt();
		System.out.println("��������εĿ�");
		int width = scanner.nextInt();
		scanner.close();
		
		Rectangle rectangle = new Rectangle(width,length);
		rectangle.showAll();
		
	}
}
