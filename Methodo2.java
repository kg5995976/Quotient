class Methodo2{
public static void add(int a,int b){
System.out.println("Sum of 1st int="+(a+b));
}
public static void add(int a, int b, int c){
System.out.println("Sum of 2nd int="+(a+b+c));
}
public static void add(double d1,double d2){
System.out.println("sum of double="+(d1+d2));
}

public static void main(String [] args){
System.out.println("Main starts");
add(20,50);
add(30,1,2);
add(24578.2,52.5);
System.out.println("main ends");
}
}