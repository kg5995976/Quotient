// 2.Fibonacci series interview



public class Fibonacci{
public static void main(String[] args){
java.util.Scanner scn=new java.util.Scanner(System.in);    // 1 1 2 3 5 8 13 21 35 56
System.out.println("Enter 1st number");
int a=scn.nextInt();
System.out.println("Enter 2nd number");
int b=scn.nextInt();
System.out.println("Enter no.of series");
int n=scn.nextInt();
System.out.print(a+" ");
System.out.print(b+" ");

for(int i=1;i<=n;i++)
 { 
    int c=a+b;
	  System.out.print(c+" ");
	  a=b;
	  b=c;
	  }
	  }
}
