//��֤������(��13λ)��������һ����Ʒ���룬ǰ12λ��"692116851128"��
//�о�������壬��13λ��ͨ�����²���������ģ�
 
public class BarCodeChecking {
    static String bar = "692116851128";
    public static void main(String[] args) {  
        System.out.print("��������ĵ�ʮ��λ�ϵ������ǣ�");
        System.out.println(change());
        System.out.println("���������ǣ�"+bar+change());
 }
 public static int change(){
     int c1 = 0;
     int c2 = 0;
     int cc;
     //��1����ȡ������������λ��
     //��2����ȡ��������ż��λ��
    for(int i=0;i<bar.length();i++){
         if((i+1)%2==0){
              c2 += bar.charAt(i)-'0';
         }else{
              c1 += bar.charAt(i)-'0';
				}
		 }
     //��3������"������"��"ż���͵�����"���
     cc = c1 + c2*3;
     //��4����ȡ����ĸ�λ������10ȡ�ࣩ
     //��5������10��ȥ�����λ��
     //��6�����Եõ�������ȡ��λ������10ȡ�ࣩ
     return (10 - cc%10)%10;
    }
 
}

