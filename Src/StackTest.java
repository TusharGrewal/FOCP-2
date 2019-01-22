import java.util.*;
class Stack
{
int[] arr =new int[10];
int a;
void push(int b)
{
a=b-1;
Scanner input = new Scanner(System.in);
int x;
System.out.println("enter elements of stack");
for (x=0;x<=a;x++)
{
arr[x]=input.nextInt();
}
}
void pop(int ch)
{
int x,y,tem;
for (x=0;x<=a;x++)
{
if (arr[x]==ch)
{
for (y=x+1;y<=a;y++)
{
tem=arr[y];
arr[y]=arr[x];
arr[x]=tem;
}
--a;
}
}
System.out.println("after poping stack is ");
for (x=0;x<=a;x++)
{
System.out.println(arr[x]);	
}
}
void isEmpty()
{
if (a==0)
System.out.println("it is empty");
}
void isFull()
{
if (a==9)
System.out.println("it is full");
}
void spaceLeft()
{
System.out.println("space left is"+(9-a));
}
}

class StackTest
{
static public void main(String args[])
{
Scanner input = new Scanner(System.in);
Stack ob = new Stack();
int c,d;
System.out.println("enter size of stack");
d=input.nextInt();
ob.push(d);
boolean f=false;
do
{
System.out.println("enter 1 for pop\n enter 2 to check if empty\n enter 3 to check if full\n enter 4 to check if space is left");
c=input.nextInt();
switch(c)
{
case 1:
int e;
System.out.println("enter element to be popped");
e=input.nextInt();
ob.pop(e);
break;
case 2:
ob.isEmpty();
break;
case 3:
ob.isFull();
break;
case 4:
ob.spaceLeft();
break;
default :
System.out.println("Wrong choice\nenter again");
f=true;
break;
}
}while(f);
}
}