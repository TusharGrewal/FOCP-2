import java.util.*;
class Circle1 
{
double r,area;
String color;
Scanner inp=new Scanner(System.in);
Circle1()
{
this.r=1.0;
this.color="red";
}
Circle1(double x1)
{
this.r=x1;
}
Circle1(double x1,String clr)
{
r=x1;	
color=clr;;
}
void setvalue1()
{
System.out.println("Enter the value of radius");
 r= inp.nextDouble();
}
double getvalue1()
{
 return r;	
}
void setvalue2()
{
System.out.println("Enter the color");	
color = inp.nextLine();
}
 String getvalue2()
{
 return color;	
}
void setarea()
{
area = r*r*3.14;	
}
double getarea()
{
return area;	
}
}

class Cylinder extends Circle1
{
double height,volume;	
Scanner inp = new Scanner(System.in);
Cylinder()

{
super();
height=1.0;
}
Cylinder(double x1)
{
r=x1;	
}
Cylinder(double x1,double h)
{
r=x1;
height=h;
}
Cylinder(double x1,double h,String clr)
{
r=x1;
height=h;
color=clr;
}
void setvalue3()
{
System.out.println("Enter the height");
height=inp.nextDouble();
}
double getvalue3()
{
return height;	
}
void setvolume()
{
volume = 3.14*r*r*height;	
}
double getvolume()
{
return volume;	
}
}

class TestCylinder
{
public static void main(String args[])
{
Cylinder ob = new Cylinder();
ob.setvalue1();
ob.setvalue2();
ob.setarea();
ob.setvalue3();
ob.setvolume();
double d1,d3,d4,d5;
String d2;
d1=ob.getvalue1();
d2=ob.getvalue2();
d3=ob.getarea();
d4=ob.getvalue3();
d5=ob.getvolume();
System.out.println("Radius is-"+d1);
System.out.println("Colour is-"+d2);
System.out.println("Area is-"+d3);
System.out.println("Height is-"+d4);
System.out.println("Volume is-"+d5);
}
}