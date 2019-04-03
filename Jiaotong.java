//一个司机肇事后想逃跑，但被三人看见了车牌号，但没看全。
//甲说：车牌的前两位是一样的；
//乙说：车牌的后两位是一样的，但与前两位不一样； 
//丙说：车牌是一个数字的平方；
//假定车牌号4位数，请编写一个程序计算车牌号

public class Jiaotong
{
	public static void main(String[] args)
	{
		int a,b;
		int total;
		for(int i=30;i<100;i++)
		{
			total = i*i;
			for(a=1;a<10;a++)
			{
				for(b=0;b<10;b++)
				{
					if(total == a*1000+a*100+b*10+b)
					{
						System.out.println("车牌号是："+total);
					}
				}
			}
		}
	}
}