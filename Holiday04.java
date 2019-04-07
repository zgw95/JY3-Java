import java.util.*;
public class Holiday04
{
	public static void main(String[] args)
	{
		//将一个整数（56123）数位翻转（32165）
		System.out.println(rev(56123));
	}
	public static int rev(int num)
	{
		int val = 0;
		while(true)
		{
			int last = num%10;
			val = val*10+last;
			num = num/10;
			if(num==0)
			{
				break;
			}
		}
		return val;
	}
}