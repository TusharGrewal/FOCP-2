//Author :Tushar Grewal
//Version :1.02
//Purpose 3.  Use a one-dimensional array to solve the following problem: Write an application that inputs five numbers, each between 10 and 100, inclusive. As each number is read, display it only if it’s not a duplicate of a number already read. Provide for the worst case, in which all five numbers are different. Display the complete set of unique values input after the user enters each new value. The program should not use any function other than main ( ) functions. 
import java.util.*;
public class ArrayWorstCase
{
public static void main(String[] args) 
{
Scanner numb = new Scanner(System.in); 
int[] arr = new int[5]; 
int tem, a;
System.out.println("Enter an integer : ");
for ( a = 0; a < 5; a++)
{
tem = numb.nextInt();
if((tem <= 100 && tem >= 10))
{
for (int b = 0; b <= a; b++ )
{
if (tem != arr[b])
{
arr[a]= tem;
break;
}
else
{
tem= 0;
arr[a]=tem;
System.out.println("Duplicate value");
}
}
}
else
{
tem = numb.nextInt();
}       
}
System.out.println("Unique numbers entered are:");
for(int c= 0; c< 5; c++)
{ 
System.out.print(arr[c] + " "); 
} 
System.out.println("\nWorst Case"); 
}
}