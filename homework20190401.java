import java.util.*;
public class homework20190401
{
	public static void main(String[] args)
	{
		
		//
		int age1 = 24;
		int age2 = 23;
		System.out.println(age1+age2);
		
		//����һ��int���͵�����19���ڿ���̨�������2��������16��������8������
		int num1 = 19;
		System.out.println(Integer.toBinaryString(num1));
		System.out.println(Integer.toHexString(num1));
		System.out.println(Integer.toOctalString(num1));
		
		//
		long num2 = 12345678901L;
		float num3 = 3.1415926F;
		double num4 = 1234567890.0987654321;
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);

		//�����ĸ
		Random r = new Random();
		char c = (char)('A'+r.nextInt(26));
		System.out.print(c);

		//����̨
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������");
		int number = scanner.nextInt();
		System.out.println("�����������Ϊ��"+number*number);

		//ϲȵ
		double bird = 0.00045;
		double lightYear = 9460500000000.0*4.2;
		System.out.println(lightYear/bird);

		//��������v^2=2gh
		double x=2*9.8*384;
		System.out.println(Math.sqrt(x));	
	}
}
