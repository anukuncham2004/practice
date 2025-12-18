import java.util.Scanner;
public class ExceptionHandling{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the numerator:");
int a=sc.nextInt();
System.out.println("enter the dinamenator:");
int b=sc.nextInt();
try{
int quotient=a/b;
System.out.println(quotient);
}
catch( Arithmatic Exception e){
System.out.println("we can't divide a number by 0");
}
catch(Null Pointer Exception e){
System.out.println();
}
}
}
