 import java.util.* ;
 
 class Test9
 {
    public static void main(String args[])
	
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter first number");
	  Float n1 = sc.nextFloat();
	  System.out.println("enter second number");
	  Float n2 = sc.nextFloat();
	  System.out.println("enter third number");
	  Float n3 = sc.nextFloat();
	  System.out.println("enter fourth number");
	  Float n4 = sc.nextFloat();
	  
	  double k = ((n1*n2-n2*n2)/(n3-n4));
	  
	  System.out.println(k);
	
    
 }
 
 }