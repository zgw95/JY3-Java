import java.util.*;
public class abc
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要转换的字符：");
		String char1 = scanner.next();
		char specialChar = char1.charAt(0);
		int result = getCharToInt(specialChar);
		System.out.println("转换后的数字："+result);
	}
	public static int getCharToInt(char c)
	{
		return c;
	}
}
