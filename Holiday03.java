import java.util.*;
public class Holiday03
{
	public static void main(String[] args)
	{
	    System.out.println("本程序功能:统计字符串数字奇数位及偶数为上的数字的和");
        System.out.println("字符串数字为：123456789012");
        String s = "123456789012";
        String result1 = "", result2 = "";
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            if (i % 2 == 0) {
                if (i == 0){
                    result1+= cs[i] ;
                } else {
                    result1+="+"+cs[i] ;
                }
            } else {
                if (i == 1){
                    result2+= cs[i];
                } else {
                    result2+="+"+cs[i];
                }
            }

        }
        System.out.println("c1=" +result1 );
        System.out.println("c2=" +result2 );

    }

}
