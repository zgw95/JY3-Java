import java.util.*;
public class Holiday01 {
 
    public  static void main(String[] arg)
    {
        String str = "统计一个字符在字符串中的所有位置";
        int[] iArr =  countAll(str,'字');
        System.out.println(Arrays.toString(iArr));
    }
    private static int[] countAll(String str,char ch)
    {
        int[] iArr={};
        for(int i = 0; i < str.length();i++){
            char c =str.charAt(i);
            if (c==ch){
                iArr = Arrays.copyOf(iArr,iArr.length+1);//数组复制，新建的内存
                iArr[iArr.length-1] = i;
            }
        }
        return iArr;
    }
}
