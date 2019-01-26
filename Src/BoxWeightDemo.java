import java.util.*;
class Box
{Scanner inp = new Scanner(System.in);
float width;
float height;
float depth;
float volume;
Box()
{
width = 0.0f;
height = 0.0f;
depth = 0.0f; 
}
Box(Box a)
{
width = a.width;
height= a.height;
depth = a.depth;
}
Box(float width, float height, float depth)
{
this.width = width;
this. height= height;
this.depth = depth;
}
void setheight()
{
System.out.println("Enter height");
height =inp.nextFloat();
}
float getheight()
{
return height;
}
void setdepth()
{
System.out.println("Enter depth");
depth =inp.nextFloat();
}
float getdepth()
{
return depth;
}
void setwidth()
{
System.out.println("Enter width");
width =inp.nextFloat();
}
float getwidth()
{
return width;
}
public void display1()
{
volume = depth*height*width;
System.out.println("Volume = " +volume);
}

}
class Boxweight extends Box
{Scanner inp = new Scanner(System.in);
float weight;
Boxweight()
{
float weight =0.0f;
}
Boxweight(Boxweight b)
{
width = b.width;
height= b.height;
depth = b.depth;
weight =b.weight;
}
Boxweight(float height,float width, float depth, float weight)
{
super();
this.weight = weight;
}
void setweight()
{
System.out.println("Enter weight");
weight =inp.nextFloat();
}
float getweight()
{
return weight;
}
public void display2()
{
System.out.println("Weight = " +weight);
}
}    

class BoxWeightDemo{
public static void main(String args[])
{
Box c = new Box();
c.setwidth();
c.setdepth();
c.setheight();
Boxweight c1 = new Boxweight();
c1.setweight();
c1.display2();
c.display1();
}
}