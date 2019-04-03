import java.util.*;
public class Text7
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入第一个点的x坐标");
		int x1 = scanner.nextInt();
		System.out.println("输入第一个点的y坐标");
		int y1 = scanner.nextInt();
		System.out.println("输入第二个点的x坐标");
		int x2 = scanner.nextInt();
		System.out.println("输入第二个点的y坐标");
		int y2 = scanner.nextInt();
		double result = f(x1,x2,y1,y2);
		System.out.println("两点的距离为："+result);
	}
	public static double f(int x1,int x2,int y1,int y2)
	{	
		double result = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		return result;
	}
}