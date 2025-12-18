class Plane{
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
class CargoPlane extends Plane{
void fly(){
System.out.println(" CargoPlane flying at low height");
}
void carryCargo(){
System.out.println("cargoPlane carries cargo");
}
}
class Indigo extends Plane{
void land(){
System.out.println("indigo plane is landing");
}
void carryIndigo(){
System.out.println("Indigo plane is carries indigo");
}
}
public class MethodsOfInheritance{
public static void main(String[]args){
CargoPlane cp=new CargoPlane();
Indigo in=new Indigo();
cp.takeoff();
cp.fly();
cp.land();
cp.carryCargo();
in.fly();
in.land();
in.carryIndigo();
}
}
