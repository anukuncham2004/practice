class Credit{
int cardNo=1234456;
int pinNo=1332567;
}
class Hacker extends Credit{
void viewDetails(){
System.out.println(cardNo);
System.out.println(pinNo);
}
void changeDetails(){
cardNo=456729;
pinNo=88888888;
}
}
public class Inheritance{
public static void main (String[]args){
Hacker h=new Hacker();
h.viewDetails();
h.changeDetails();
System.out.println("----------------------------------------------");
h.viewDetails();
}
}