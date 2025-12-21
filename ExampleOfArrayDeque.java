import java.util.*;
public class ExampleOfArrayDeque{
public static void main(String[]args){
//Deque d=new ArrayDeque();
ArrayDeque<Integer> ad=new ArrayDeque<Integer>();
ad.add(10);
ad.add(20);
ad.add(30);
ad.add(40);
ad.add(50);
System.out.println(ad);
System.out.println("...............................");
System.out.println(ad.poll());
System.out.println("...............................");
for(Object i:ad){
System.out.println(i);
}
System.out.println("..............................");
System.out.println(ad.remove(20));
System.out.println("................................");
System.out.println(ad);
}
}
