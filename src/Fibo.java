
public class Fibo {

	    public static void main(String[] args) {

int n=5;
System.out.println("Fib:");
for(int i=0;i<n;i++)
{
	System.out.print(Fibona(i)+"");
}
}
	    public static int Fibona(int n)
	    {
	    	if(n<= 1)
	    	{
	    		return n;
	    	}
	    	return Fibona(n-1)+Fibona(n-2);
	    }
		
}

