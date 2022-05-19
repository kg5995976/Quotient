//4.Sum of digits interview   
// 1454=1+4+5+4=14

public class Sum_of_digits{
public static void main(String[] args){
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter the number");
int n=scn.nextInt();    //n=1454
int a=n;
int sum=0;
while(n>0)       //while(n!=0)
  {
       int r=n%10;    // n=1454, 1454%10=4,  r=4, sum+r=0+4,sum=4,n=1454/10=145
       sum=sum+r;
	   n=n/10;
	   }
	   System.out.println("The sum of digits of  "+a+"  is" +sum);
	   }
	   }


