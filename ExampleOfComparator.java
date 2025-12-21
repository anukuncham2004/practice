import java.util.*;
class NameComparator implements Comparator<Student>{
public int compare(Student s1,Student s2){
return s1.getName().compareTo(s2.getName());
}
}
class RollnoComparator implements Comparator<Student>{
public int compare(Student s1,Student s2){
return s1.getRollno().compareTo(s2.getRollno());
}
}
class Student{
private String name;
private String rollno;
public Student(String name,String rollno){
super();
this.name=name;
this.rollno=rollno;
}
public String getName(){
return name;
}
public String getRollno(){
return rollno;
}
public String toString(){
return "Student Name: "+name+" Student Rollno: "+rollno;
}
}
public class ExampleOfComparator{
public static void main
(String[]args){
Student s1=new Student("minnu","23Ak1A0501");
Student s2=new Student("sanvy","23Ak506");
ArrayList<Student> al=new ArrayList<Student>();
al.add(s1);
al.add(s2);
Collections.sort(al,new RollnoComparator());
for(Object o:al){
System.out.println(o);
}
}
}
