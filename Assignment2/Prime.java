import java.util.Scanner;

public class Prime{
 
public static void main(String[] args) 
   {
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number");
	 
	 int num = sc.nextInt();
	 int temp = 0;
	 
	 for(int i=2; i<=num;i++)
	 
	 {
	 
	  if(num%i==0) 
		  temp = 1;
	  }
	  if (temp==0)
	  {
	  
	  System.out.println("It is a prime number");
	  
	  }else
	  {
	  System.out.println("It is not a prime number");
	 
	 }
	 
	
     
   }
   
}