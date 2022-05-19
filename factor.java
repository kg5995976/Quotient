
//1. Factorial number Interview

class Factor{
public static void main(String[] args){
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter the Number");
int n=scn.nextInt();
int fact=1;
for(int i=1;i<=n;i++)   //5!=1*2*3*4*5=120
{
fact=fact*i;
}
System.out.println("factorial of"+n+" is"+fact);
}
}