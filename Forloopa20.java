public class Forloopa20{
public static void main(String[] args){
int a=1;
for(int i=1;i<=5;i++)
{
  for(int j=5;j>i;j--)
  {
    System.out.print(" ");
} 
for(int k=1;k<=a;k++)
{

System.out.print("*");
}
a=a+2;

System.out.println();
}
}
}	

/*
          *
        * * *
      * * * * *
    * * * * * * *
  * * * * * * * * *       */