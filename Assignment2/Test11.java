 import java.util.* ;
 
 class Test11
 {
    public static void main(String args[])
	
	{
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter radius");
	  Double r = sc.nextDouble();
	   
	   double p = 2*Math.PI*r ;
	   double a = Math.PI*r*r ;
	 
	  
	  System.out.println("perimeter = "+p);
	  System.out.println("area = "+a);
    
 }
 
 }