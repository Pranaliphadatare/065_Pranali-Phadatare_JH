import java.util.Scanner;
public class Test19 
    {
      public static void main(String args[])
    {
        int dec_num, quot, i=0, j;
        int bin_num[] = new int[100];
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Input a Decimal Number : ");
        dec_num = scan.nextInt();//5
		
        quot = dec_num;//5
		
        while(quot != 0)
        {
            bin_num[i++] = quot%2; //[0]=1 [1]=0 [2]=1 i=3
            quot = quot/2; //quot=2 quote=1 q=0
        }
		
        System.out.print("Binary number is: ");
        for(j=i-1; j>=0; j--)
        {
            System.out.print(bin_num[j]); //101
        }
        System.out.print("\n");
    }
}