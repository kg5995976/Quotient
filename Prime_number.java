//3.Prime number Interview
//prime no.=3 5 7 11 13 17 19 23 31  % reminder , / quotient

public class Prime_number{
	public static void main(String[] args){
		java.util.Scanner scn=new java.util.Scanner(System.in);
		System.out.println("Enter the number");
		int n=scn.nextInt();               //n=11
		int a=1;
		for(int i=2;i<n;i++)   //n=11      i=2 true 11/2=rem 1
		{
			if(n%i==0)
			{
				a=0;
			break;
			}
		}
		
		if(a==1)
		{
		System.out.println("Number "+n+" is a prime number");
	}
			else
			{
				System.out.println("Number "+n+" is not a prime number");
			}
		}
	}
				