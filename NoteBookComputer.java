package com.zgw.homework0409;
/*
    ����һ���ʼǱ��࣬��������ɫ��char����cpu�ͺţ�int���������ԡ� [������]
3.1 �޲κ��вε��������췽�����вι��췽�������ڴ��������ͬʱΪÿ�����Ը�ֵ;
3.2 ����ʼǱ���Ϣ�ķ���
3.3 Ȼ���дһ�������࣬���ԱʼǱ���ĸ�������.
 */
public class NoteBookComputer {
	//������������
	char colour;
	int cpuType;
	//�޲Σ��в��������췽��
	public NoteBookComputer()
	{
		
	}
	public NoteBookComputer(char colour,int cpuType)
	{
		this.colour = colour;
		this.cpuType = cpuType;
	}	
	public void showAll()
	{
		System.out.println("��ɫ��"+colour);
		System.out.println("cpu�ͺţ�"+cpuType);
	}
}
