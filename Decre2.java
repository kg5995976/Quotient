public class Decre2{
public static void main(String[] args){
 
 int a=4;
 int b=4;
 int c=4;
 
 //3  - 3 -4
 a=--a - --b - c--;
 
 //-4-2-2
 b=a-- - --b - --c;
 //-6+8-2
 c=--a - b-- - c--;
 
 System.out.println("a:"+a);
 System.out.println("b:"+b);
 System.out.println("c:"+c);
 
 }
 }
 
 