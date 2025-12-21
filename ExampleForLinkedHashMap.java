import java.util.*;
public class ExampleForLinkedHashMap{
public static void main(String[]args){
//Map m=new LinkedHashMap();
LinkedHashMap lhm=new LinkedHashMap();
lhm.put("Name","anu");
lhm.put("Age",21);
System.out.println("...................................");
System.out.println(lhm);
System.out.println("...................................");
System.out.println(lhm.get(0));
System.out.println("...................................");
for(Object i:lhm.keySet()){
System.out.println(i);
}
System.out.println("...................................");
for(Object i:lhm.entrySet()){
System.out.println(i);
}
}
}