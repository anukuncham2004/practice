class Restaurant implements Runnable{
synchronized void foodOrder(String orderName){
String name=Thread.currentThread().getName();
System.out.println("Thread"+ name + "customer has ordered" +orderName);
try{
wait();
}
catch(Exception e){
e.printStackTrace();
}
System.out.println("Thread" + name + "food is delivered the customer");
}
synchronized void cookedOrder(){
String name=Thread.currentThread().getName();
System.out.println("Thread"+ name + "chef is received the ordered" +orderName);
System.out.println("Thread"+ name + "cooking is under progress");
try{
Thread.sleep(2000);
}
catch(Exception e){
e.printStackTrace();
}
System.out.println("Thread" +name+ "order is ready!");
notifyAll();
}
synchronized void receivedOrder(){
String name=Thread.currentThread().getName();
System.out.println("Thread"+ name + "customer is choosing an order...............");
try{
wait();
}
catch(Exception e){
e.printStackTrace();
}
System.out.println("Thread" + name + "customer has received the order" +orderName);
}
}
public class InterThreadConnection{
public static void main(String[]args){
Restaurant r=new Restaurant();
String orderName="chilli Gobi";
Thread t1=new Thread("customer"){
public void run(){
r.receivedOrder(orderName);
}
};
t1.start();
Thread t2=new Thread("waiter"){
public void run(){
r.receivedOrder(orderName);
}
};
t2.start();
Thread t3=new Thread("cook"){
public void run(){
r.receivedOrder(orderName);
}
};
t3.start();
}
}
