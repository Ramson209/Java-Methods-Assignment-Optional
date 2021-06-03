package amalitech;

public class Q1 {
	
	static class GFG {
	     
	   
	    static void mul_table(int N, int i)
	    {
	        
	        if (i > 10)
	            return ;
	     
	        
	        System.out.println(N + " * " + i + " = " + N * i);
	                
	        
	        mul_table(N, i + 1);
	    }
	     
	    
	    public static void main (String[] args)
	    {
	       
	        int N = 15;
	     
	        
	        mul_table(N, 1);
	    }
	}
}
