public class Incpp2{
public static void main(String [] args){
int x=2;
int y=2;
int z=2;

//3     3     2
x=++x + ++y + z++;
//8      4     4
y=x++ + ++y  + ++z;
//10    16     5
z=++x + y++  + ++z;


System.out.println(x);
System.out.println(y);
System.out.println(z);

}
}
