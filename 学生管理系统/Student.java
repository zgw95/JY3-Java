package com.zgw.java;
/*
 *  学生类
 * 	属性：
	 * id，
	 * 姓名，
	 * 性别，
	 * 年龄（1~120），
	 * 所属年级（初级、中级、高级）
	 * 地址，
	 * 联系方式（11位手机号），
	 * 电子邮箱（包含@和.com） 
 */
public class Student {
	
	//构造器
	public Student()
	{
		
	}
	
	
	public Student(int id,String stuName,char stuSex,short stuAge,String stuGrade,String stuAddress,int stuTel,String stuEmail) 
	{
		this.id = id;
		this.stuName = stuName;
		this.stuSex = stuSex;
		this.stuAge = stuAge;
		this.stuGrade = stuGrade;
		this.stuAddress = stuAddress;
		this.stuTel = stuTel;
		this.stuEmail = stuEmail;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", stuName=" + stuName + ", stuSex=" + stuSex + ", stuAge=" + stuAge
				+ ", stuGrade=" + stuGrade + ", stuAddress=" + stuAddress + ", stuTel=" + stuTel + ", stuEmail="
				+ stuEmail + "]";
	}

	int id;
	
	String stuName;
	
	char stuSex;
	
	short stuAge;
	
	String stuGrade;
	
	String stuAddress;
	
	int stuTel;
	
	String stuEmail;
	
	
	//方法
	//方法1 id
  	public int getId()
  	{
  		return id;
  	}
  	public void setId(int id)
  	{
  		this.id = id;
  	}
  	//方法2  名字
  	public String getName()
  	{
  		return stuName;
  	}
  	public void setName(String name)
  	{
  		this.stuName = name;
  	}
  	//方法3 性別
  	public char getSex()
  	{
  		return stuSex;
  	}
  	public void setSex(char sex)
  	{
  		this.stuSex = sex;
  	}
  	//方法4 年龄
  	public short getAge()
  	{
  		return stuAge;
  	}
  	public void setAge(short age)
  	{
  		this.stuAge = age;
  	}
  	//方法5所属班級
  	public String getGrade()
  	{
  		return stuGrade;
  	}
  	public void setGrade(String grade)
  	{
  		this.stuGrade = grade;
  	}
  	//方法6地址
  	public String getAddress()
  	{
  		return stuAddress;
  	}
  	public void setAddress(String address)
  	{
  		this.stuAddress = address;
  	}
  	//方法7联系方式
  	public int getTel()
  	{
  		return stuTel;
  	}
  	public void setTel(int telephone)
  	{
  		this.stuTel = telephone;
  	}	
  	//方法8电子邮箱
  	public String getEmail()
  	{
  		return stuEmail;
  	}
  	public void setEmail(String email)
  	{
  		this.stuEmail = email;
  	}	



}
