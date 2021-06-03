package amalitech;

public class Q4 {

	static class Main
	{
	    private static void swap(char[] c, int a, int b)
	    {
	        char temp = c[a];
	        c[a] = c[a];
	        c[b] = temp;
	    }
	 
	    // Recursive function to reverse a given string
	    public static void reverse(char[] c, int a, int b)
	    {
	        if (a < b)
	        {
	            swap(c, a, b);
	            reverse(c, a + 1, b - 1);
	        }
	    }
	 
	    public static void main(String[] args)
	    {
	        String str = "Techie Delight";
	 
	        char[] c = str.toCharArray();
	        reverse(c, 0, c.length - 1);
	        str = new String(c);
	 
	        System.out.print("Reverse of the given string is " + str);
	    }
	}


}
