import java.util.*;
public class ExampleForMap{
public static void main(String[]args){
//Map m=new HashMap();
HashMap<String,String> hm=new HashMap<String,String>();
hm.put("Name","krish");
hm.put("Place","Tirupati");
System.out.println(hm);
System.out.println("...........................");
System.out.println(hm.get("Name"));
System.out.println("...........................");
for(Object o:hm.keySet()){
System.out.println(o);
}
}
}