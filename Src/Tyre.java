//Author: Tushar Grewal
//Version:1.12.1

import java.util.*;
class Vehicle
{
void display()
{
System.out.println("This is a Vehicle");	
}
}
class Bike extends Vehicle
{
void display()
{
System.out.println("The vehicle is bike");	
}	
}
class Car extends Vehicle
{
void display()
{
System.out.println("The vehicle is car");	
}	
}
class Tyre
{
public static void main(String args[])
{
int N;
Scanner input=new Scanner(System.in);
System.out.println("Enter number of tyres");
N=input.nextInt();
switch (N)
{
case 2:
Bike ob1 = new Bike();
ob1.display();
break;
case 4:
Car ob2 = new Car();
ob2.display();
break;
default:
System.out.println("Vehicle is neither a bike nor a car");	
}
}
}