class Family implements Runnable
{
String resource1="TV";
String resource2="PlayStation";
public void run(){
String name=Thread.currentThread().getName();
if(name.equals("CR")==true){
crAccquiredResource();
}
else{
minnuAccquiredResource();
}
}
void crAccquiredResource(){
synchronized(resource2){
try{
System.out.println("CR acquired the playstation");
Thread.sleep(2000);
synchronized(resource1)
{
System.out.println("CR acquired TV");
Thread.sleep(1000);
}
}
catch(Exception e){
System.out.println("Rohit failed");
}
}
}
void minnuAccquiredResource(){
synchronized(resource1){
try{
System.out.println("minnu acquired the Tv");
Thread.sleep(2000);
synchronized(resource2)
{
System.out.println("CR acquired playstation");
Thread.sleep(1000);
}
}
catch(Exception e){
System.out.println("minnu failed");
}
}
}
}
public class Deadlock{
public static void main(String[]args){
Family f=new Family();
Thread t1=new Thread(f);
Thread t2=new Thread(f);
t1.setName("CR");
t2.setName("minnu");
t1.start();
t2.start();
}
}