import java.util.Scanner;
interface Calculator{
void add();
void sub();
}
class MyCalculator1 implements Calculator{
 public void add(){
int num1=10;
int num2=12;
int sum=num1+num2;
System.out.println("the sum is:"+sum);
}
public void sub(){
int num1=10;
int num2=12;
int diff=num1-num2;
System.out.println("the difference is:" +diff);
}
}
class MyCalculator2 implements Calculator{
public void add(){
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
System.out.println("enter the first number:");
int num2=sc.nextInt();
System.out.println("enter the second number:");
int sum=num1+num2;
System.out.println("the sum is:"+sum);
}
public void sub(){
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
System.out.println("enter the first number:");
int num2=sc.nextInt();
System.out.println("enter the second number:");
int diff=num1-num2;
System.out.println("the difference is:"+diff);
}
}
public class Interface{
public static void main(String[]args){
MyCalculator1 m1=new MyCalculator1();
MyCalculator2 m2=new MyCalculator2();
m1.add();
m1.sub();
m2.add();
m2.sub();
}
}


