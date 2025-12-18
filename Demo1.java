class Demo1{
void div() throws ArithmeticException{
int n1=10;
int n2=0;
System.out.println(n1/n2);
}
public static void main(String[]args){
Demo1 d=new Demo1();
try{
d.div();
}
catch(ArithmeticException e){
e.printStackTrace();
}
}
}
