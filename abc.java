import java.util.*;
public class abc
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ҫת�����ַ���");
		String char1 = scanner.next();
		char specialChar = char1.charAt(0);
		int result = getCharToInt(specialChar);
		System.out.println("ת��������֣�"+result);
	}
	public static int getCharToInt(char c)
	{
		return c;
	}
}
