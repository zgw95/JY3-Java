import java.util.*;
public class Homework20190402
{
	public static void main(String[] args)
	{
		//第一题
		int a = 48;
		char b = (char)a;
		System.out.println(b);
		String charc= "中";
		char specialChar = charc.charAt(0);
		int d = (int)specialChar;
		System.out.println(d);
		
		//第二题
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入数字：");
		int x2 = scanner.nextInt();
		int y2 = f2(x2);
		System.out.println("练习2结果为："+y2);

		//第三题
		Scanner scanner3 = new Scanner(System.in);
		System.out.println("请输入数字：");
		int x3 = scanner3.nextInt();
		int y31 = f31(x3);
		int y32 = f32(x3);
		System.out.println("练习3结果1为："+y31);
		System.out.println("练习3结果2为："+y32);
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