class Methodpara3{
public static void methodname1(int a,int b){  //parameter
System.out.println("methodname1 a="+a+ ",b="+b);
}
public static void methodname2(int a,double b){   //parameter
System.out.println("methodname2 a="+a+ ",b="+b);
}

public static void main(String[] args){
System.out.println("main start");
methodname1(200,10);  //arguments
methodname2(40,213.24);  //arguments
System.out.println("main ends");
}
}