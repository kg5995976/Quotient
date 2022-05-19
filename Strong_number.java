//7.Strong number interview
//145=1!+4!+5!=145
public class Strong_number{
public static void main(String[] args){
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter the number");
int n=scn.nextInt();
int a=n;
int sum=0;
while(n!=0)
{
int r=n%10;
int i=1;
int p=1;
while(i<=r)
{
p=p*i;
i++;
}
sum=sum+p;
n/=10;
if(sum==a)
{
System.out.print("Number "+a+" is a strong number");
}
}
}
}