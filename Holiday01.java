import java.util.*;
public class Holiday01 {
 
    public  static void main(String[] arg)
    {
        String str = "ͳ��һ���ַ����ַ����е�����λ��";
        int[] iArr =  countAll(str,'��');
        System.out.println(Arrays.toString(iArr));
    }
    private static int[] countAll(String str,char ch)
    {
        int[] iArr={};
        for(int i = 0; i < str.length();i++){
            char c =str.charAt(i);
            if (c==ch){
                iArr = Arrays.copyOf(iArr,iArr.length+1);//���鸴�ƣ��½����ڴ�
                iArr[iArr.length-1] = i;
            }
        }
        return iArr;
    }
}
