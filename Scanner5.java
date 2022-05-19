public class Scanner5{
public static void main(String[] args){
java.util.Scanner scn=new java.util.Scanner(System.in);
//int
System.out.println("Enter the Small number");
int a=scn.nextInt();
System.out.println("Small number="+a);


//String
System.out.println("Enter Name");
String s=scn.next();
System.out.println("name="+s);

//Char

System.out.println("Letter");
char h=scn.next().charAt(0);
System.out.println("Letter="+h);
System.out.println("Small no="+a+"name"+s+"letter"+h);

}
}
