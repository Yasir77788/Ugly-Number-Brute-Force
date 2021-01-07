// An ugly number is a number whose only prime factors are 2, 3 or 5
public class UglyNumber
{
	public static void main(String[] args)
	{
		for(int i = 1; i < 100; ++i)
			System.out.println(i + " is ugly number? " + isUglyNum(i));
		
	}
	
	// method to check and return if the nth number is an ugly number
	// time complexity is O(n)
	public static boolean isUglyNum(int n)
	{
		if (n == 1) 
			return true;
		
		while(n%2 == 0)
		{
			n = n/2;
		}
		if (n == 1)
			return true;
		
		while(n%3 == 0)
		{
			n = n/3;
		}
		if (n == 1)
			return true;
		
		while(n%5 == 0)
		{
			n = n/3;
		}
		if (n == 1)
			return true;
		else
			return false;	
	}
}
