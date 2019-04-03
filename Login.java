import java.util.*;
public class Login
{
	public static void main(String[] args)
	{
		//定义初始化用户名和密码
		char userName = 'a';
		char passWord = 'b';
		
		//创建键盘输入的对象
		Scanner sca = new Scanner(System.in);
		
		//屏幕输出“请输入账号：”的提示
		System.out.println("请输入账号：");
		//接收键盘输入的第一个字符串
		String inPutName = sca.next();
		//根据索引取出字符串中的第一个字符
		char c1 = inPutName.charAt(0);
		
		//屏幕输出“请输入密码：”的提示
		System.out.println("请输入密码：");
		//接收键盘输入的第二个字符串
		String inPutWord = sca.next();
		//根据索引取出字符串中的第二个字符
		char c2 = inPutWord.charAt(0);

		if( userName == c1 && passWord == c2 )
		{
			System.out.println("登录成功了");
		}
		else
		{
			System.out.println("登录失败了");
		}
	}
}