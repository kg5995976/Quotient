public class Methodreturnvalue1{
	public static String mobile(String name){
		return name;
	}
	public static int add(int a,int b){
		return a+b;
	}
	public static void main(String[] args){
		System.out.println("main starts");
		java.util.Scanner scn=new java.util.Scanner(System.in);
		System.out.println("Enter the name");
		String n=scn.next();
		String s =mobile(n);
		System.out.println("name="+s);
		System.out.println("1st no.");
		int a=scn.nextInt();
	     System.out.println("2nd no.");
		 int b=scn.nextInt();
		 int q=add(a,b);
		 System.out.println("Sum of "+a+" & "+b+" is"+q);
		 System.out.println("Main ends");
	}
}
		 
