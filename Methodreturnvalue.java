class Methodreturnvalue{
public static String studentdetails(String name){
return name;
}
public static void main(String[] args){
System.out.println("main start");
String s=studentdetails("Aarav");
System.out.println("student name is ="+s);
System.out.println("main ends");
}
}