import java.util.Scanner;
public class PrimeNumber
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting number ");
		int start=sc.nextInt();
		System.out.println("Enter the ending number");
		int end =sc.nextInt();

		final int temp=start;

		int count=0;

		while(start<=end)
		{
			if (isPrime(start))
		    {

			 System.out.println(start+" is a Prime Number");
			 count++;

		    }
			start++;

		}
		System.out.println("The count of the prime numbers present between "+temp+" to "+end+" is "+count);

		
		

	}

	public static boolean isPrime(int num)
	{
		if (num<=1)
		{
			return false;
		}
		else
		{
			for (int i=2;i<num ;i++ )
			{
				int quot=num/i;
				if ((quot*i==num) && i!=num)
				{
					return false;
				}
			}
			return true;
		}
	}
}