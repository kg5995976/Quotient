public class Switchstatement1{
public static void main(String[] args){
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter the Operator");
String oper=scn.next();
System.out.println("Enter 1st no.");
int a=scn.nextInt();
System.out.println("Enter 2nd no.");
int b=scn.nextInt();
switch(oper)
{
   case "add":
   System.out.println("sum of "+a+" and "+b+"="+(a+b));
   break;
   case "sub":
   System.out.println("sub of "+a+" and "+b+"="+(a-b));
   break;
   case "multi":
   System.out.println("multi of "+a+" and "+b+"="+(a*b));
   break;
   case "div":
   System.out.println("div of "+a+" and "+b+"="+(a/b));
   break;
   }
   }
   }