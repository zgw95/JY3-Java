package com.zgw.java;

import java.util.Arrays;
import java.util.Scanner;
/*
 * ѧ��������
 */
public class StudentManager {
	
	StudentClient sc;
	
	//�޲� �в� ����������
	public StudentManager()
	{
		 
	}
	
	public StudentManager(StudentClient sc) 
	{
		this.sc = sc;
	}
	
	//����һ��ѧ��
	//Student student1 =new Student(1, "����", '��', (short)23, "����", "���", 123456, "123@qq.com");
	
	//����һ��ѧ������   (����õ�)
	static Student[] stus = new Student[0];
	//����һ��ɾ���������
	static Student[] newStus;
	//1.��ѯѧ����Ϣ(1.1�鿴����ѧ����Ϣ		1.2����id��ѯѧ����Ϣ		1.3����id��ѯѧ������  )
	
	//չʾѧ����Ϣ�ķ���
	public void display(int i)
	{
		System.out.println("==========================================================================================");
		System.out.print("|ѧ��\t");
		System.out.print("|����\t");
		System.out.print("|����\t");
		System.out.print("|�Ա�\t");
		System.out.print("|�꼶\t");
		System.out.print("|�绰\t\t");
		System.out.print("|Email\t\t");
		System.out.print("|��ַ\t\t");
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
	
	//1.1�鿴����ѧ����Ϣ
	public void displayAllInfo()
	{
		System.out.println("+++++++++++++++++++++++++++++++++++++++����ѧ����Ϣ+++++++++++++++++++++++++++++++++++++++");
		for(int i=0;i<stus.length;i++){
			display(i);	
		}
	}
	
	//1.2����id��ѯѧ����Ϣ
	public void displayInfoById(Scanner scanner)
	{
		System.out.print("������Ҫ��ѯ��ѧ��id��");
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
				System.out.println("δ�ҵ�idΪ"+id+"��ѧ��");
				break;
			}
		}
	}
	
	//1.3����id��ѯѧ������
	public void displayNamefoById(Scanner scanner)
	{
		System.out.print("������Ҫ��ѯ��ѧ��id��");
		int id = scanner.nextInt();
		for(int i=0;i<stus.length;i++)
		{
			if(stus[i].id == id)
			{
				 System.out.println("idΪ"+id+"��ѧ������Ϊ��"+stus[i].stuName);
				 break;
			}
			if(i==stus.length-1 && stus[i].id != id)
			{
				System.out.println("δ�ҵ�idΪ"+id+"��ѧ��");
				break;
			}
		}		
	}
	
	
	
	
	
	
	
	//2.���ѧ����Ϣ
	//���ѧ���ķ���
	public void addStudent(Student student)
	{
		//����ѧ������
		stus = Arrays.copyOf(stus, stus.length+1);
		stus[stus.length-1] = student;
	}
	
	//���ѧ������
	public void addStuPage(Scanner scanner)
	{
		System.out.print("������ѧ��id��");
		int idAdd = scanner.nextInt();
		System.out.print("������ѧ��������");
		String nameAdd = scanner.next();
		System.out.print("������ѧ���Ա�");
		char sexAdd = scanner.next().charAt(0);
		System.out.print("������ѧ�����䣨ֻ����1-120֮�ڵ����֣���");
		short ageAdd = scanner.nextShort();
		System.out.print("������ѧ�������꼶��ֻ�ܳ������м����߼�����");
		String gradeAdd = scanner.next();
		System.out.print("������ѧ����ַ��");
		String addressAdd = scanner.next();
		System.out.print("������ѧ����ϵ��ʽ��");
		int telephoneAdd = scanner.nextInt();
		System.out.print("������ѧ���������䣨����@��.com����");
		String emailAdd = scanner.next();
		
		//ǰ��Ҫ���� studentManager  stuAdd����������
		StudentManager studentManager = new StudentManager();
		Student stuAdd = new Student(idAdd,nameAdd,sexAdd,ageAdd,gradeAdd,addressAdd,telephoneAdd,emailAdd);
		//�������ѧ���ķ��� 
		studentManager.addStudent(stuAdd);
		System.out.println("���ݱ���ɹ���ϵͳ���Զ������ϲ�Ŀ¼~");
		//����stuManagerIndex����,�ص���ҳ
		sc.stuManagerIndex();
		 
	}
	
	//3.ɾ��ѧ����Ϣ
	//����idɾ��ѧ���ķ���         (��������)
	public Student[] delOneStudentByStuId(int stuId)
	{
		//��ɾ��������鸳ֵ����ֵ����Ϊ ԭ����ĳ��ȼ�1��
		newStus = new Student[stus.length-1];
		int j =0 ;
		//���������е�����Ԫ��
		for(int i = 0;i<stus.length;i++)
		{
			//�ж������е�Ԫ�� �Ƿ���id��Ϊ stuId ��ѧ��
			if(stuId != stus[i].id)
			{
				newStus[j] = stus[i];
				j++;
			}
		}
		stus = newStus;
		return stus;
	}
	
	
	//4.�޸�ѧ����Ϣ(4.1�޸�ȫ���� 4.2�޸Ĳ��֡�)
	
	//4.1����id�޸�ѧ��ȫ����Ϣ�ķ���
	public void updateStudentAllInfo(Student student)
	{
		//�ҵ�Ҫ�޸ĵ�ѧ��
		for(int i=0;i<stus.length;i++)
		{
			if(stus[i].id == student.id)
			{
				 //�ҵ�id��ͬ��ѧ��
				stus[i] = student;
			}
		}
	}
	//4.1����id�޸�ѧ��ȫ����Ϣ�Ľ���
	 public void updateStudentAllInfoPage(Scanner scanner)
	 {
		System.out.print("������Ҫ�޸�ѧ����id��");
		int idUpdate = scanner.nextInt();
		System.out.print("�������µ�ѧ��������");
		String nameUpdate = scanner.next();
		System.out.print("�������µ�ѧ���Ա�");
		char sexUpdate = scanner.next().charAt(0);
		System.out.print("�������µ�ѧ�����䣨ֻ����1-120֮�ڵ����֣���");
		short ageUpdate = scanner.nextShort();
		System.out.print("�������µ�ѧ�������꼶��ֻ�ܳ������м����߼�����");
		String gradeUpdate = scanner.next();
		System.out.print("�������µ�ѧ����ַ��");
		String addressUpdate = scanner.next();
		System.out.print("�������µ�ѧ����ϵ��ʽ��");
		int telephoneUpdate = scanner.nextInt();
		System.out.print("�������µ�ѧ���������䣨����@��.com����");
		String emailUpdate = scanner.next();
			
		//ǰ��Ҫ���� studentManager  stuUpdate����������
		StudentManager studentManager = new StudentManager();
		Student stuUpdate = new Student(idUpdate,nameUpdate,sexUpdate,ageUpdate,gradeUpdate,addressUpdate,telephoneUpdate,emailUpdate);
		//�����޸�ѧ��ȫ����Ϣ�ķ��� 
		studentManager.updateStudentAllInfo(stuUpdate);
		System.out.println("���ݱ���ɹ���ϵͳ���Զ������ϲ�Ŀ¼~");
		//����updateStudentPage����,�ص��޸�ѧ����Ϣ������
		sc.updateStudentPage(scanner);
		 
	 }
	
	 
	//4.2����id�޸�ѧ��������Ϣ�ķ���+����
	public void updateStudentPartInfo(Scanner scanner)
	{
		//Student stuUpdate = new Student();
		System.out.print("������Ҫ�޸�ѧ����id��");
		int idUpdate = scanner.nextInt();
		//�ҵ�Ҫ�޸ĵ�ѧ��
		out:for(int i=0;i<stus.length;i++)
		{
			if(stus[i].id == idUpdate)
			{
				//�ҵ�id��ͬ��ѧ��
				System.out.println("������Ҫ�޸ĵ����ԣ�");
				System.out.print("����������ԣ��������Ա����䡢�꼶����ַ����ϵ��ʽ�����䣩��");
				String typeUpdate = scanner.next();	
				switch (typeUpdate) {
				case "����":
					System.out.print("�������޸ĺ��"+typeUpdate+":");
					String name = scanner.next();
					stus[i].stuName=name;
					break;
				case "�Ա�":
					System.out.print("�������޸ĺ��"+typeUpdate+":");
					char sex = scanner.next().charAt(0);
					stus[i].stuSex=sex;
					break;
				case "����":
					System.out.print("�������޸ĺ��"+typeUpdate+":");
					short age = scanner.nextShort();
					stus[i].stuAge=age;
					break;
				case "�꼶":
					System.out.print("�������޸ĺ��"+typeUpdate+":");
					String grade = scanner.next();
					stus[i].stuGrade=grade;
					break;
				case "��ַ":
					System.out.print("�������޸ĺ��"+typeUpdate+":");
					String address = scanner.next();
					stus[i].stuAddress=address;
					break;
				case "��ϵ��ʽ":
					System.out.print("�������޸ĺ��"+typeUpdate+":");
					int tel = scanner.nextInt();
					stus[i].stuTel=tel;
					break;
				case "����":
					System.out.print("�������޸ĺ��"+typeUpdate+":");
					String email = scanner.next();
					stus[i].stuEmail=email;
					break;
				default:
					System.out.println("��������Բ����ڣ�����������...");
					break out;
				}				
			}
		}
		//System.out.println("�����޸ĳɹ����������޸ĺ����Ϣ:");
		System.out.println("ϵͳ���Զ������ϲ�Ŀ¼~");
		sc.updateStudentPage(scanner);
		
	}
}	
			

					/*
							//д�������� ����һ��
							Student stu1 = new Student(1,"��һ",'Ů',(short)11,"����","���",1123456,"1789@qq.com");
							studentManager.addStudent(stu1);
							Student stu2 = new Student(2,"ţ��",'��',(short)22,"�м�","����",2123456,"2789@qq.com");
							studentManager.addStudent(stu2);
							Student stu3 = new Student(3,"����",'��',(short)33,"�߼�","�ӱ�",3123456,"3789@qq.com");
							studentManager.addStudent(stu3);
							Student stu4 = new Student(4,"����",'��',(short)44,"����","ɽ��",4123456,"4789@qq.com");
							studentManager.addStudent(stu4);
					*/
	

