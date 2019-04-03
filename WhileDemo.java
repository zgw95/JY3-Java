import java.util.*;
public class WhileDemo
{
	public static void main(String[] args) 
	{	
		Scanner sca = new Scanner(System.in);
		System.out.print("输入一个数字");
		int i = sca.nextInt();
		int sum = 0;
		while (i<=10)
		{
			sum += i;
			i=++i;
		}
		
		System.out.println(sum);
	}
}
