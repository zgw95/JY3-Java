 package com.zgw.java;
/*
 * 客户端类
 */

import java.util.Scanner;


public class StudentClient {
	
	//初始化用户名  和  密码
	static String userName = "admin";
	static String passWord = "admin";
	
	//创建Scanner类  (因为会多次使用，所以写在这)
	 Scanner scanner= new Scanner(System.in);
	
	 
	// 可能会发生栈溢出的 错误（解决办法 使用this关键字，并在StudentManager创建新的构造器）
	//创建一个StudentManager的对象
	StudentManager sm = new StudentManager(this);
	
	
	//
	//
	//主函数 
	public static void main(String[] args) {
		//创建一个客户端
		StudentClient studentClient = new StudentClient();
		studentClient.welcomePage();
	}
	
	
	//欢迎界面
	public void welcomePage()
	{
		System.out.println("**********欢迎 登录学生信息管理系统**********");
	    System.out.println("1.登录         2.退出");
	    System.out.println("************************************");
	    //接受用户输入的1和2
	    System.out.print("请选择：");
	    int nextInt = scanner.nextInt();
	    switch (nextInt) {
		case 1:
			System.out.println("欢迎登录！");
			System.out.print("请输入用户名：");
	    	String userName1 = scanner.next();
	    	System.out.print("请输入密码：");
	    	String passWord1 = scanner.next();
	    	Admin admin = new Admin(userName1,passWord1);
	    	boolean loginReturn = login(admin);
	    	if(loginReturn == true)
	    	{
	    		System.out.println("登录成功");
		    	System.out.println("欢迎您,"+userName1);
		    	stuManagerIndex();
	    	}else
	    	{
	    		System.out.println("用户名或密码有误，请重新登录...");
	    		welcomePage();
	    	}
			break;
		case 2:
			System.out.println("您已退出系统 ");
			exitSystem();
			break;
		default:
			System.out.println("输入有误，请重新选择...");
			welcomePage();
			break;
		}
	    
	}
	
	
	//登录的方法
	public boolean login(Admin admin)
	{
		//判断传入的用户名和密码是否正确
		if(userName.equals(admin.userName) && passWord.equals(admin.passWord))
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	//退出系统的方法  (会被多次调用的)
	public void exitSystem()
	{
		System.out.println("您已退出学生管理系统.....");
		System.exit(0);
	}
		
	//学生管理系统的首页 
	public void stuManagerIndex()
	{
		System.out.println("**********************请选择要操作的信息对应数字*********************");
    	System.out.println("*1.查看学生信息          2.添加学生信息          3.删除学生信息           4.修改学生信息          5.退出*");
      	System.out.println("*************************************************************");
    	System.out.print("请选择：");
    	//接受输入的选项
    	int nextInt = scanner.nextInt();
    	switch (nextInt) {
		case 1:
			displayStudentPage(scanner);
			stuManagerIndex();
			break;
		case 2:
			sm.addStuPage(scanner);
			break;
		case 3:
			System.out.println("输入要删除的id：");
			int nextInt3 = scanner.nextInt();
			sm.delOneStudentByStuId(nextInt3);
			System.out.println("删除成功，自动退回上一层...");
			stuManagerIndex();
			break;
		case 4:
			updateStudentPage(scanner);
			break;
		default:
			exitSystem();
			break;
		}
	}
	
	
	//1.查询学生信息的主界面
	public void displayStudentPage(Scanner scanner)
	{
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("| 1.查看所有学生信息               2.根据id查询学生信息               3.根据id查询学生姓名               4.返回上一层             |");
		System.out.println("-------------------------------------------------------------------------");
		System.out.print("请选择：");
		int nextInt=scanner.nextInt();
		switch (nextInt) {
		case 1:
			sm.displayAllInfo();
			break;
		case 2:
			sm.displayInfoById(scanner);
			break;
		case 3:
			sm.displayNamefoById(scanner);
			break;
		case 4:
			stuManagerIndex();
			break;
		default:
			System.out.println("输入有误，请按规则输入...");
			break;
		}
	}
	
	//4.修改学生信息的主界面
		public void updateStudentPage(Scanner scanner)
		{
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("| 1.根据id修改学生全部信息               2.根据id修改学生部分信息               3.返回上级目录               4.系统退出         |");
			System.out.println("-------------------------------------------------------------------------");
			System.out.print("请选择：");
			int nextInt=scanner.nextInt();
			switch (nextInt) {
			case 1:
				sm.updateStudentAllInfoPage(scanner);
				break;
			case 2:
				sm.updateStudentPartInfo(scanner);
				break;
			case 3:
				stuManagerIndex();
				break;
			case 4:
				exitSystem();
				break;
			default:
				System.out.println("输入有误，请按规则输入...");
				break;
			}
			
		}
	
}


