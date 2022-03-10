import java.util.Scanner;
public class Test22 
  {
   public static void main(String[] args) 
 {
   Scanner sc = new Scanner(System.in);
   long binaryNumber, dec_Num = 0, j = 1, rem;
   System.out.print("Input a binary number: ");
   binaryNumber = sc.nextLong();

    while (binaryNumber != 0) 
  {
     rem = binaryNumber % 10;
     dec_Num = dec_Num + rem * j;
      j = j * 2;
      binaryNumber = binaryNumber / 10;
  }
           System.out.println("Decimal Number: " + dec_Num);
 }
}