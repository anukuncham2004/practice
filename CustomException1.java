import java.util.Scanner;
class InvalidException extends Exception{
public String getMessege(){
return "Invalid password.Try again";
}
}
class Login{
int username="ANU";
int password=123456;
int ps;
String us;
void takeOutput(){
Scanner s=new Scanner(System.in);
System.out.println("Enter the username:");
us=s.next();
System.out.println("Enter the password:");
ps=s.nextInt();
}
void check()throws passwordException{
if(password==ps && username.equals(us)){
system.out.println("Login successful");
}
else{
passwordException p=new passwordException();
System.out.println(p.getMessage());
throw p;
}
}
}
class WebSite{
void start(){
login l=new login();
try{
l.takeInput();
l.check();
}
catch(Exception e){
try{
l.takeInput();
l.check();
}
catch(Exception a){
try{
l.takeInput();
l.check();
}
catch(Exception b){
System.out.println("Login failed");
System.exit(0);
}
}
}
}
}
public class CustomException{
public static void main(String[]args){
WebSite ws=new WebSite();
ws.start();
}
}



