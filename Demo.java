import java.util.*;
public class Demo
{
	public static void main(String[] args)
	{
		Scanner sca = new Scanner(System.in);
		System.out.println("请输入购买数量");
		int qty = sca.nextInt();
		
		double price = 6.00;
		double pay = 6.00;
		if (qty<1)
		{
			System.out.println("不卖给你！");
			return；
		}
		if (qty>1)
		{
			pay += + (qty-1)*price/2;
		}

	}
}
