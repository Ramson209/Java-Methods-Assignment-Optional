package amalitech;

import java.util.*;

public class Q3 {
	 
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		{
		  
		     int base,exponent;
		      
		      Scanner sc=new Scanner(System.in);
		 
		      System.out.println("enter number");
		 
		      base=sc.nextInt();
		 
		      System.out.println("enter exponent");
		 
		      exponent=sc.nextInt();
		      sc.close();
		      
		      System.out.println("Power("+base+"^"+exponent+") = "+power(base,exponent));}
		      
		      
		   }
		static int power(int b,int e)
		 {
		 if(e==0)
		         return 1;
		     else 
		         return (b*power(b,e-1));
		 
		
		
		 
		
	}

}

