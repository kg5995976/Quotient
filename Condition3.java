public class Condition3{
public static void main(String[] args){
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter 1st number");
int a=scn.nextInt();
System.out.println("Enter 2nd number");
int b=scn.nextInt();

if(a>b)
{
System.out.println("a is greater than b");
}
if(a<b)
{
System.out.println("b is greater than a");
}
else 
{
System.out.println("a and b is equal");
}
}
}