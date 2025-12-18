class Student{
private String rollno;
private String name;
private String email;
private int age;
public void setData(String x,String y,String z,int a){
rollno=x;
name=y;
email=z;
age=a;
}
public String getRollno(){
return rollno;
}
public String getName(){
return name;
}
public String getEmail(){
return email;
}
public int getAge(){
return age;
}
}
public class Encapsulation{
public static void main(String[]args){
Student s=new Student();
s.setData("23Ak1A0509","anu","anu@gmail.com",21);
System.out.println("the student roll number:"+s.getRollno());
System.out.println("the student name:"+s.getName());
System.out.println("the student email:"+s.getEmail());
System.out.println("the student age:"+s.getAge());
}
}
