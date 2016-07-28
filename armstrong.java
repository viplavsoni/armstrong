import java.util.*;
import java.lang.*;
class viplav
{
	public static void main(String args[])
	{
		int sum;
		int i;
		int number;
		int length=0;
		int mod;
		int armstrong=0;
		int modulous;
		Scanner vip = new Scanner(System.in);
		System.out.println("Enter a number");
		number = vip.nextInt();
		modulous = number;
		
		while(modulous>0)
		{
			modulous = modulous/10;
			length = ++length;
		}
	
		modulous = number;
		while(modulous>0)
		{
			mod = modulous%10;
			modulous = modulous/10;
			sum = 1;
			for(i=0;i<length;i++)
			{
				sum = sum*mod;
			}	
			armstrong = armstrong + sum;
		}
		
		if(number == armstrong)
		{
			System.out.println(number + " is a Armstrong number");
		}
		else
		{
			System.out.println(number + " is not a Armstrong number");
		}
	}
}
