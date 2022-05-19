public class Swap2{
public static void main(String[] args){
int a=13;
int b=17;
a=a+b;  //a=30
b=a-b;  //a=30,b=13
a=a-b;  //a=17,b=13

System.out.println(a);
System.out.println(b);
}
}