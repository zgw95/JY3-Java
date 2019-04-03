import java.util.*;

public class Salary
{
	public static void main(String[] args)
	{
		Scanner sca = new Scanner(System.in);
		System.out.println("请输入基本工资：");
		double x = sca.nextInt();
		double y = f(x);
		System.out.println("您的到手工资为"+y+"元");
	}
	
	public static double f(double num)
	{
		double wuXianYiJin = num*0.22;
		double yingNaShuiSuoDe = num-wuXianYiJin;
		double result = yingNaShuiSuoDe;
		
		return result;
	}
}

