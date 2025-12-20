import java.util.ArrayList;
class Student{
private int age;
private String name;
public void setName(String name){
this.name=name;
}
public void setAge(int age){
this.age=age;
}
String getName(){
return name;
}
int getAge(){
return age;
}
public Student(String name,int age)
{
super();
this.name=name;
this.age=age;
}
@Override
public String toString(){
return "Name" +name+ "Age:" +age;
}
}
public class ExampleOfArraylist{
public static void main(String[]args){
Student s1=new Student("Anu",21);
Student s2=new Student("AArthi",20);
ArrayList al=new ArrayList();
al.add(s1);
al.add(s2);
for(Object i:al){
System.out.println(i);
}
}
}

