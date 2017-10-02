package three;

public class Three {

	public static void permutation(String str) { 
	    permutation("", str); 
	}

	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
    public static void main(String args[]) 
    {
    	int counter = 1;
    	String str = "AACE";
        while(true)
        {
        	for(int i = 0;i +counter <= 4;i++)
        	{
        		permutation(str.substring(i,i + counter));
        	}
        	counter++;
        	if(counter == 5)
        		break;
        }
    }
}

