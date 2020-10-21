public class Fibonacci

{
	
	public static void main(String args[])
	
	{
		
		int n=20,t1=0,t2=1;

		float sum=0.0;		
		
		for(int i=2;i<=n;++i)
		
		{
			
			System.out.print(t1 +" ");	
			
			int t3=t1+t2;
			
			t1=t2;
			
			t2=t3;	
				
			sum+=t2;
		
		}
		
		System.out.println("Average of Fibonacci series is:"+(sum/n));
	
	}	
	
}