import java.util.Scanner;
public class Test20 
{
      public static void main(String args[])
    {
        int dec_num, rem;
        String hexdec_num="";
        
        /* hexadecimal number digits */
        
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        Scanner in = new Scanner(System.in);
		
        System.out.print("Input a decimal number: ");
        dec_num = in.nextInt();
		
        while(dec_num>0)
        {
            rem = dec_num%16; //rem =5%16=5 s1=ab s2= cd ...s1+s2= abcd
            hexdec_num = hex[rem] + hexdec_num;//5+0=5
            dec_num = dec_num/16;// 5/16=0
        }
        System.out.print("Hexadecimal number is : "+hexdec_num+"\n");         
    }
}