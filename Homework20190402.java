import java.util.*;
public class Homework20190402
{
	public static void main(String[] args)
	{
		//��һ��
		int a = 48;
		char b = (char)a;
		System.out.println(b);
		String charc= "��";
		char specialChar = charc.charAt(0);
		int d = (int)specialChar;
		System.out.println(d);
		
		//�ڶ���
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������֣�");
		int x2 = scanner.nextInt();
		int y2 = f2(x2);
		System.out.println("��ϰ2���Ϊ��"+y2);

		//������
		Scanner scanner3 = new Scanner(System.in);
		System.out.println("���������֣�");
		int x3 = scanner3.nextInt();
		int y31 = f31(x3);
		int y32 = f32(x3);
		System.out.println("��ϰ3���1Ϊ��"+y31);
		System.out.println("��ϰ3���2Ϊ��"+y32);
	}
	public static int f2(int num)
	{
		int result2 = num*num-2*num+4;
		return result2;
	}
	public static int f31(int num31)
	{
		int result31 = num31%3;
		return result31;
	}
	public static int f32(int num32)
	{
		int result32 = num32++;
		return result32;
	}
}