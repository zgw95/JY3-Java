//验证码条码(共13位)，代表了一件商品编码，前12位（"692116851128"）
//有具体代表含义，第13位是通过如下步骤算出来的：
 
public class BarCodeChecking {
    static String bar = "692116851128";
    public static void main(String[] args) {  
        System.out.print("该条形码的第十三位上的数字是：");
        System.out.println(change());
        System.out.println("该条形码是："+bar+change());
 }
 public static int change(){
     int c1 = 0;
     int c2 = 0;
     int cc;
     //第1步：取出该数的奇数位和
     //第2步：取出该数的偶数位和
    for(int i=0;i<bar.length();i++){
         if((i+1)%2==0){
              c2 += bar.charAt(i)-'0';
         }else{
              c1 += bar.charAt(i)-'0';
				}
		 }
     //第3步：将"奇数和"与"偶数和的三倍"相加
     cc = c1 + c2*3;
     //第4步：取结果的个位数（对10取余）
     //第5步：用10减去这个个位数
     //第6步：对得到的数再取个位数（对10取余）
     return (10 - cc%10)%10;
    }
 
}

