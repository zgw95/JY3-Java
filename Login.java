import java.util.*;
public class Login
{
	public static void main(String[] args)
	{
		//�����ʼ���û���������
		char userName = 'a';
		char passWord = 'b';
		
		//������������Ķ���
		Scanner sca = new Scanner(System.in);
		
		//��Ļ������������˺ţ�������ʾ
		System.out.println("�������˺ţ�");
		//���ռ�������ĵ�һ���ַ���
		String inPutName = sca.next();
		//��������ȡ���ַ����еĵ�һ���ַ�
		char c1 = inPutName.charAt(0);
		
		//��Ļ��������������룺������ʾ
		System.out.println("���������룺");
		//���ռ�������ĵڶ����ַ���
		String inPutWord = sca.next();
		//��������ȡ���ַ����еĵڶ����ַ�
		char c2 = inPutWord.charAt(0);

		if( userName == c1 && passWord == c2 )
		{
			System.out.println("��¼�ɹ���");
		}
		else
		{
			System.out.println("��¼ʧ����");
		}
	}
}