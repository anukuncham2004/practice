class Car{
private String Name;
private String Milage;
private String Color;
public Car(){
public void setData(String x,String y,String z);
Name=x;
milage=y;
Color=z;
}
public void String setName(){
this.name=name;
}
public void String setMilage(){
this.milage=milage;
}
public void String setColor(){
this.color=color;
}
public void String getName(){
return name;
}
public void String getMilage(){
return milage;
}
public void String getColor(){
return color;
}
}
public class Encapsulation1{
public static void main(String[]args){
car c=new Car();
c.setData("farary","50 km/h","blue");
System.out.println("Car name is :"+c.getName());
System.out.println("Car milage is :"+c.getMilage());
System.out.println("Car Color is :"+c.getColor());
}
}

