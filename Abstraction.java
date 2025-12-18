abstract class Plane{
abstract void takeoff();
abstract void fly();
abstract void land();
}
class CargoPlane extends Plane{
void takeoff(){
System.out.println("CargoPlane is takeoff");
}
void fly(){
System.out.println("CargoPlane is flying");
}
void land(){
System.out.println("CargoPlane is landing");
}
}
class PassengerPlane extends Plane{
void takeoff(){
System.out.println(" PassengerPlane is takeoff");
}
void fly(){
System.out.println("PassengerPlane is flying");
}
void land(){
System.out.println("PassengerPlane is landing");
}
}
class FighterPlane extends Plane{
void takeoff(){
System.out.println(" FighterPlane is takeoff");
}
void fly(){
System.out.println("FighterPlane is flying");
}
void land(){
System.out.println("FighterPlane is landing");
}
}
class Airport{
void permit(Plane ref){
ref.takeoff();
ref.fly();
ref.land();
}
}
public class Abstraction{
public static void main(String[]args){
CargoPlane cp=new CargoPlane();
PassengerPlane pp=new PassengerPlane();
FighterPlane fp=new FighterPlane();
Airport a=new Airport();
a.permit(cp);
a.permit(pp);
a.permit(fp);
}
}
