//6.Armstrong number Interview  a^n
//153=1*1*1+5*5*5+3*3*3=153

public class Armstrong_number{
public static void main(String[] args){
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter the number");
int n=scn.nextInt();  //n=153
int a=n;
int sum=0;
while(n!=0)
{
  int r=n%10;
  sum=r*r*r;
  n/=10;
  }
  if(sum==a)
  {
  System.out.println("Number "+a+" is a Armstrong number");
  }
  else
  {
  System.out.println("number "+a+" is not a Armstrong number");
  }
}
}  