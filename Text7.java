import java.util.*;
public class Text7
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����һ�����x����");
		int x1 = scanner.nextInt();
		System.out.println("�����һ�����y����");
		int y1 = scanner.nextInt();
		System.out.println("����ڶ������x����");
		int x2 = scanner.nextInt();
		System.out.println("����ڶ������y����");
		int y2 = scanner.nextInt();
		double result = f(x1,x2,y1,y2);
		System.out.println("����ľ���Ϊ��"+result);
	}
	public static double f(int x1,int x2,int y1,int y2)
	{	
		double result = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		return result;
	}
}