import java.util.Scanner;
abstract class Calculator{
abstract void add();
abstract void sub();
abstract void mul();
abstract void div();
}
class MyCalculator extends Calculator{
void add(){
int num1=10;
int num2=12;
int sum=num1+num2;
System.out.println("the sum is:"+sum);
}
void sub(){
int num1=10;
int num2=12;
int diff=num1-num2;
System.out.println("the difference is:" +diff);
}
void mul(){
int num1=10;
int num2=12;
int mul=num1*num2;
System.out.println("the product is:"+mul);
}
void div(){
int num1=10;
int num2=12;
int div=num1/num2;
System.out.println("the division is:"+div);
}
}
class MyCalculator2 extends Calculator{
void add(){
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
System.out.println("enter the first number:");
int num2=sc.nextInt();
System.out.println("enter the second number:");
int sum=num1+num2;
System.out.println("the sum is:"+sum);
}
void sub(){
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
System.out.println("enter the first number:");
int num2=sc.nextInt();
System.out.println("enter the second number:");
int diff=num1-num2;
System.out.println("the difference is:"+diff);
}
void mul(){
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
System.out.println("enter the first number:");
int num2=sc.nextInt();
System.out.println("enter the second number:");
int mul=num1*num2;
System.out.println("the product is: "+mul);
}
void div(){
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
System.out.println("enter the first number:");
int num2=sc.nextInt();
System.out.println("enter the second number:");
int div=num1/num2;
System.out.println("the division is: "+div);
}
}
class Math{
void arithmetic(Calculator c){
c.add();
c.sub();
c.mul();
c.div();
}
}
public class Abstraction1{
public static void main (String[]args){
MyCalculator m1=new MyCalculator();
MyCalculator2 m2=new MyCalculator2();
Math m=new Math();
m.arithmetic(m1);
m.arithmetic(m2);
}
}




