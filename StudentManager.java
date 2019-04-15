package com.zgw.java;

import java.util.Arrays;
import java.util.Scanner;
/*
 * 学生管理类
 */
public class StudentManager {
	
	StudentClient sc;
	
	//无参 有参 两个构造器
	public StudentManager()
	{
		 
	}
	
	public StudentManager(StudentClient sc) 
	{
		this.sc = sc;
	}
	
	//声明一个学生
	//Student student1 =new Student(1, "张三", '男', (short)23, "初级", "天津", 123456, "123@qq.com");
	
	//声明一个学生数组   (多次用到)
	static Student[] stus = new Student[0];
	//声明一个删除后的数组
	static Student[] newStus;
	//1.查询学生信息(1.1查看所有学生信息		1.2根据id查询学生信息		1.3根据id查询学生姓名  )
	
	//展示学生信息的方法
	public void display(int i)
	{
		System.out.println("==========================================================================================");
		System.out.print("|学号\t");
		System.out.print("|姓名\t");
		System.out.print("|年龄\t");
		System.out.print("|性别\t");
		System.out.print("|年级\t");
		System.out.print("|电话\t\t");
		System.out.print("|Email\t\t");
		System.out.print("|地址\t\t");
		System.out.println();
		System.out.println("------------------------------------------------------------------------------------------");	
		System.out.print("|"+stus[i].id+"\t");
		System.out.print("|"+stus[i].stuName+"\t");
		System.out.print("|"+stus[i].stuAge+"\t");
		System.out.print("|"+stus[i].stuSex+"\t");
		System.out.print("|"+stus[i].stuGrade+"\t");
		System.out.print("|"+stus[i].stuTel+"\t\t");
		System.out.print("|"+stus[i].stuEmail+"\t\t");
		System.out.print("|"+stus[i].stuAddress+"\t");	
		System.out.println();
		System.out.println("==========================================================================================");
	}
	
	//1.1查看所有学生信息
	public void displayAllInfo()
	{
		System.out.println("+++++++++++++++++++++++++++++++++++++++所有学生信息+++++++++++++++++++++++++++++++++++++++");
		for(int i=0;i<stus.length;i++){
			display(i);	
		}
	}
	
	//1.2根据id查询学生信息
	public void displayInfoById(Scanner scanner)
	{
		System.out.print("请输入要查询的学生id：");
		int id = scanner.nextInt();
		for(int i=0;i<stus.length;i++)
		{
			if(stus[i].id == id)
			{
				 display(i);
				 break;
			}
			if(i==stus.length-1 && stus[i].id != id)
			{
				System.out.println("未找到id为"+id+"的学生");
				break;
			}
		}
	}
	
	//1.3根据id查询学生姓名
	public void displayNamefoById(Scanner scanner)
	{
		System.out.print("请输入要查询的学生id：");
		int id = scanner.nextInt();
		for(int i=0;i<stus.length;i++)
		{
			if(stus[i].id == id)
			{
				 System.out.println("id为"+id+"的学生姓名为："+stus[i].stuName);
				 break;
			}
			if(i==stus.length-1 && stus[i].id != id)
			{
				System.out.println("未找到id为"+id+"的学生");
				break;
			}
		}		
	}
	
	
	
	
	
	
	
	//2.添加学生信息
	//添加学生的方法
	public void addStudent(Student student)
	{
		//扩容学生数组
		stus = Arrays.copyOf(stus, stus.length+1);
		stus[stus.length-1] = student;
	}
	
	//添加学生界面
	public void addStuPage(Scanner scanner)
	{
		System.out.print("请输入学生id：");
		int idAdd = scanner.nextInt();
		System.out.print("请输入学生姓名：");
		String nameAdd = scanner.next();
		System.out.print("请输入学生性别：");
		char sexAdd = scanner.next().charAt(0);
		System.out.print("请输入学生年龄（只能是1-120之内的数字）：");
		short ageAdd = scanner.nextShort();
		System.out.print("请输入学生所属年级（只能初级、中级、高级）：");
		String gradeAdd = scanner.next();
		System.out.print("请输入学生地址：");
		String addressAdd = scanner.next();
		System.out.print("请输入学生联系方式：");
		int telephoneAdd = scanner.nextInt();
		System.out.print("请输入学生电子邮箱（包含@和.com）：");
		String emailAdd = scanner.next();
		
		//前提要创建 studentManager  stuAdd这两个对象
		StudentManager studentManager = new StudentManager();
		Student stuAdd = new Student(idAdd,nameAdd,sexAdd,ageAdd,gradeAdd,addressAdd,telephoneAdd,emailAdd);
		//调用添加学生的方法 
		studentManager.addStudent(stuAdd);
		System.out.println("数据保存成功，系统将自动返回上层目录~");
		//调用stuManagerIndex方法,回到首页
		sc.stuManagerIndex();
		 
	}
	
	//3.删除学生信息
	//根据id删除学生的方法         (缩容数组)
	public Student[] delOneStudentByStuId(int stuId)
	{
		//给删除后的数组赋值，赋值长度为 原数组的长度减1。
		newStus = new Student[stus.length-1];
		int j =0 ;
		//遍历数组中的所有元素
		for(int i = 0;i<stus.length;i++)
		{
			//判断数组中的元素 是否有id不为 stuId 的学生
			if(stuId != stus[i].id)
			{
				newStus[j] = stus[i];
				j++;
			}
		}
		stus = newStus;
		return stus;
	}
	
	
	//4.修改学生信息(4.1修改全部、 4.2修改部分、)
	
	//4.1根据id修改学生全部信息的方法
	public void updateStudentAllInfo(Student student)
	{
		//找到要修改的学生
		for(int i=0;i<stus.length;i++)
		{
			if(stus[i].id == student.id)
			{
				 //找到id相同的学生
				stus[i] = student;
			}
		}
	}
	//4.1根据id修改学生全部信息的界面
	 public void updateStudentAllInfoPage(Scanner scanner)
	 {
		System.out.print("请输入要修改学生的id：");
		int idUpdate = scanner.nextInt();
		System.out.print("请输入新的学生姓名：");
		String nameUpdate = scanner.next();
		System.out.print("请输入新的学生性别：");
		char sexUpdate = scanner.next().charAt(0);
		System.out.print("请输入新的学生年龄（只能是1-120之内的数字）：");
		short ageUpdate = scanner.nextShort();
		System.out.print("请输入新的学生所属年级（只能初级、中级、高级）：");
		String gradeUpdate = scanner.next();
		System.out.print("请输入新的学生地址：");
		String addressUpdate = scanner.next();
		System.out.print("请输入新的学生联系方式：");
		int telephoneUpdate = scanner.nextInt();
		System.out.print("请输入新的学生电子邮箱（包含@和.com）：");
		String emailUpdate = scanner.next();
			
		//前提要创建 studentManager  stuUpdate这两个对象
		StudentManager studentManager = new StudentManager();
		Student stuUpdate = new Student(idUpdate,nameUpdate,sexUpdate,ageUpdate,gradeUpdate,addressUpdate,telephoneUpdate,emailUpdate);
		//调用修改学生全部信息的方法 
		studentManager.updateStudentAllInfo(stuUpdate);
		System.out.println("数据保存成功，系统将自动返回上层目录~");
		//调用updateStudentPage方法,回到修改学生信息主界面
		sc.updateStudentPage(scanner);
		 
	 }
	
	 
	//4.2根据id修改学生部分信息的方法+界面
	public void updateStudentPartInfo(Scanner scanner)
	{
		//Student stuUpdate = new Student();
		System.out.print("请输入要修改学生的id：");
		int idUpdate = scanner.nextInt();
		//找到要修改的学生
		out:for(int i=0;i<stus.length;i++)
		{
			if(stus[i].id == idUpdate)
			{
				//找到id相同的学生
				System.out.println("请输入要修改的属性：");
				System.out.print("可输入的属性（姓名、性别、年龄、年级、地址、联系方式、邮箱）：");
				String typeUpdate = scanner.next();	
				switch (typeUpdate) {
				case "姓名":
					System.out.print("请输入修改后的"+typeUpdate+":");
					String name = scanner.next();
					stus[i].stuName=name;
					break;
				case "性别":
					System.out.print("请输入修改后的"+typeUpdate+":");
					char sex = scanner.next().charAt(0);
					stus[i].stuSex=sex;
					break;
				case "年龄":
					System.out.print("请输入修改后的"+typeUpdate+":");
					short age = scanner.nextShort();
					stus[i].stuAge=age;
					break;
				case "年级":
					System.out.print("请输入修改后的"+typeUpdate+":");
					String grade = scanner.next();
					stus[i].stuGrade=grade;
					break;
				case "地址":
					System.out.print("请输入修改后的"+typeUpdate+":");
					String address = scanner.next();
					stus[i].stuAddress=address;
					break;
				case "联系方式":
					System.out.print("请输入修改后的"+typeUpdate+":");
					int tel = scanner.nextInt();
					stus[i].stuTel=tel;
					break;
				case "邮箱":
					System.out.print("请输入修改后的"+typeUpdate+":");
					String email = scanner.next();
					stus[i].stuEmail=email;
					break;
				default:
					System.out.println("输入的属性不存在，请重新输入...");
					break out;
				}				
			}
		}
		//System.out.println("数据修改成功，以下是修改后的信息:");
		System.out.println("系统将自动返回上层目录~");
		sc.updateStudentPage(scanner);
		
	}
}	
			

					/*
							//写个主函数 测试一下
							Student stu1 = new Student(1,"伊一",'女',(short)11,"初级","天津",1123456,"1789@qq.com");
							studentManager.addStudent(stu1);
							Student stu2 = new Student(2,"牛二",'男',(short)22,"中级","北京",2123456,"2789@qq.com");
							studentManager.addStudent(stu2);
							Student stu3 = new Student(3,"张三",'男',(short)33,"高级","河北",3123456,"3789@qq.com");
							studentManager.addStudent(stu3);
							Student stu4 = new Student(4,"李四",'男',(short)44,"初级","山东",4123456,"4789@qq.com");
							studentManager.addStudent(stu4);
					*/
	

