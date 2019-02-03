import java.util.*;
import java.lang.*;
class ExceptionHandlingQ1
{
static public void main(String args[])
{
Scanner input = new Scanner(System.in);
System.out.println("Enter case Number");
int a=input.nextInt();
switch(a)
{
case 1:
try
{
int b=50/0;
}
catch(ArithmeticException e)
{
System.out.println(e);
}
break;
case 2:
try
{
String b=null;
System.out.println(b.length());
}
catch(NullPointerException e)
{
System.out.println(e+" null pointer");
}
break;
case 3:
try
{
String b ="abc";
int c = Integer.parseInt(b);
}
catch(NumberFormatException e)
{
System.out.println(e+" Number format");
}
break;
case 4:
try
{
int[] b=new int[5];
b[10]=5;
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
}
break;
case 5:
try
{
int b=input.nextInt();
}
catch(Exception e)
{
System.out.println(e);
}
break;
case 6:
try
{
throw new IllegalArgumentException("Invalid code");
}
catch(IllegalArgumentException e)
{
System.out.println(e);
}
break;
}
}
}