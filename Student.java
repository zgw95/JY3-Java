package com.zgw.java;
/*
 *  ѧ����
 * 	���ԣ�
	 * id��
	 * ������
	 * �Ա�
	 * ���䣨1~120����
	 * �����꼶���������м����߼���
	 * ��ַ��
	 * ��ϵ��ʽ��11λ�ֻ��ţ���
	 * �������䣨����@��.com�� 
 */
public class Student {
	
	//������
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
	
	
	//����
	//����1 id
  	public int getId()
  	{
  		return id;
  	}
  	public void setId(int id)
  	{
  		this.id = id;
  	}
  	//����2  ����
  	public String getName()
  	{
  		return stuName;
  	}
  	public void setName(String name)
  	{
  		this.stuName = name;
  	}
  	//����3 �Ԅe
  	public char getSex()
  	{
  		return stuSex;
  	}
  	public void setSex(char sex)
  	{
  		this.stuSex = sex;
  	}
  	//����4 ����
  	public short getAge()
  	{
  		return stuAge;
  	}
  	public void setAge(short age)
  	{
  		this.stuAge = age;
  	}
  	//����5�����༉
  	public String getGrade()
  	{
  		return stuGrade;
  	}
  	public void setGrade(String grade)
  	{
  		this.stuGrade = grade;
  	}
  	//����6��ַ
  	public String getAddress()
  	{
  		return stuAddress;
  	}
  	public void setAddress(String address)
  	{
  		this.stuAddress = address;
  	}
  	//����7��ϵ��ʽ
  	public int getTel()
  	{
  		return stuTel;
  	}
  	public void setTel(int telephone)
  	{
  		this.stuTel = telephone;
  	}	
  	//����8��������
  	public String getEmail()
  	{
  		return stuEmail;
  	}
  	public void setEmail(String email)
  	{
  		this.stuEmail = email;
  	}	



}
