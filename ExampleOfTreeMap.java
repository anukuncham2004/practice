import java.util.*;
public class ExampleForTreeMap{
public static void main(String[]args){
TreeMap tm=new TreeMap();
tm.put("Name","Sanvy");
tm.put("Email","Sanvy@gamil.com");
System.out.println(tm);
System.out.println("...................................");
for(Object i=tm.keySet()){
System.out.println(i);
}
System.out.println("...................................");
for(Object i=tm.entrySet()){
System.out.println(i);
}
System.out.println("...................................");
for(Object i=tm.values()){
System.out.println(i);
}
}
}