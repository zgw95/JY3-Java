import java.util.*;

public class LogicDemo
{
	public static void main(String[] args)
	{
		Scanner sca = new Scanner(System.in);
		System.out.println("������������������");
		int total = sca.nextInt();
		int size = 10;
		int page = total%size==0 ? total/size : total/size+1;
		System.out.println("�������ݱ��ֳ���"+page+"ҳ");
	}
}
