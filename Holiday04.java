import java.util.*;
public class Holiday04
{
	public static void main(String[] args)
	{
		//��һ��������56123����λ��ת��32165��
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