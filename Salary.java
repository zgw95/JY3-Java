import java.util.*;

public class Salary
{
	public static void main(String[] args)
	{
		Scanner sca = new Scanner(System.in);
		System.out.println("������������ʣ�");
		double x = sca.nextInt();
		double y = f(x);
		System.out.println("���ĵ��ֹ���Ϊ"+y+"Ԫ");
	}
	
	public static double f(double num)
	{
		double wuXianYiJin = num*0.22;
		double yingNaShuiSuoDe = num-wuXianYiJin;
		double result = yingNaShuiSuoDe;
		
		return result;
	}
}

