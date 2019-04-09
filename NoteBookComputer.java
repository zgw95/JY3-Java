package com.zgw.homework0409;
/*
    定义一个笔记本类，该类有颜色（char）和cpu型号（int）两个属性。 [必做题]
3.1 无参和有参的两个构造方法；有参构造方法可以在创建对象的同时为每个属性赋值;
3.2 输出笔记本信息的方法
3.3 然后编写一个测试类，测试笔记本类的各个方法.
 */
public class NoteBookComputer {
	//定义两个属性
	char colour;
	int cpuType;
	//无参，有参两个构造方法
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
		System.out.println("颜色："+colour);
		System.out.println("cpu型号："+cpuType);
	}
}
