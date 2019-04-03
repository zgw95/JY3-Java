import java.util.Random;
public class homework2
{
	public static void main(String[] args)
	{
		Random r = new Random();
		char c = (char)('A'+r.nextInt(26));
		System.out.print(c);
	}
}
