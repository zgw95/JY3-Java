 package com.zgw.java;
/*
 * �ͻ�����
 */

import java.util.Scanner;


public class StudentClient {
	
	//��ʼ���û���  ��  ����
	static String userName = "admin";
	static String passWord = "admin";
	
	//����Scanner��  (��Ϊ����ʹ�ã�����д����)
	 Scanner scanner= new Scanner(System.in);
	
	 
	// ���ܻᷢ��ջ����� ���󣨽���취 ʹ��this�ؼ��֣�����StudentManager�����µĹ�������
	//����һ��StudentManager�Ķ���
	StudentManager sm = new StudentManager(this);
	
	
	//
	//
	//������ 
	public static void main(String[] args) {
		//����һ���ͻ���
		StudentClient studentClient = new StudentClient();
		studentClient.welcomePage();
	}
	
	
	//��ӭ����
	public void welcomePage()
	{
		System.out.println("**********��ӭ ��¼ѧ����Ϣ����ϵͳ**********");
	    System.out.println("1.��¼         2.�˳�");
	    System.out.println("************************************");
	    //�����û������1��2
	    System.out.print("��ѡ��");
	    int nextInt = scanner.nextInt();
	    switch (nextInt) {
		case 1:
			System.out.println("��ӭ��¼��");
			System.out.print("�������û�����");
	    	String userName1 = scanner.next();
	    	System.out.print("���������룺");
	    	String passWord1 = scanner.next();
	    	Admin admin = new Admin(userName1,passWord1);
	    	boolean loginReturn = login(admin);
	    	if(loginReturn == true)
	    	{
	    		System.out.println("��¼�ɹ�");
		    	System.out.println("��ӭ��,"+userName1);
		    	stuManagerIndex();
	    	}else
	    	{
	    		System.out.println("�û������������������µ�¼...");
	    		welcomePage();
	    	}
			break;
		case 2:
			System.out.println("�����˳�ϵͳ ");
			exitSystem();
			break;
		default:
			System.out.println("��������������ѡ��...");
			welcomePage();
			break;
		}
	    
	}
	
	
	//��¼�ķ���
	public boolean login(Admin admin)
	{
		//�жϴ�����û����������Ƿ���ȷ
		if(userName.equals(admin.userName) && passWord.equals(admin.passWord))
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	//�˳�ϵͳ�ķ���  (�ᱻ��ε��õ�)
	public void exitSystem()
	{
		System.out.println("�����˳�ѧ������ϵͳ.....");
		System.exit(0);
	}
		
	//ѧ������ϵͳ����ҳ 
	public void stuManagerIndex()
	{
		System.out.println("**********************��ѡ��Ҫ��������Ϣ��Ӧ����*********************");
    	System.out.println("*1.�鿴ѧ����Ϣ          2.���ѧ����Ϣ          3.ɾ��ѧ����Ϣ           4.�޸�ѧ����Ϣ          5.�˳�*");
      	System.out.println("*************************************************************");
    	System.out.print("��ѡ��");
    	//���������ѡ��
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
			System.out.println("����Ҫɾ����id��");
			int nextInt3 = scanner.nextInt();
			sm.delOneStudentByStuId(nextInt3);
			System.out.println("ɾ���ɹ����Զ��˻���һ��...");
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
	
	
	//1.��ѯѧ����Ϣ��������
	public void displayStudentPage(Scanner scanner)
	{
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("| 1.�鿴����ѧ����Ϣ               2.����id��ѯѧ����Ϣ               3.����id��ѯѧ������               4.������һ��             |");
		System.out.println("-------------------------------------------------------------------------");
		System.out.print("��ѡ��");
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
			System.out.println("���������밴��������...");
			break;
		}
	}
	
	//4.�޸�ѧ����Ϣ��������
		public void updateStudentPage(Scanner scanner)
		{
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("| 1.����id�޸�ѧ��ȫ����Ϣ               2.����id�޸�ѧ��������Ϣ               3.�����ϼ�Ŀ¼               4.ϵͳ�˳�         |");
			System.out.println("-------------------------------------------------------------------------");
			System.out.print("��ѡ��");
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
				System.out.println("���������밴��������...");
				break;
			}
			
		}
	
}


