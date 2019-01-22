import java.util.*;
class Grades
{
static public void main(String args[])
{
int[] sum = new int[10];
int[][] arr = new int[10][];
int a,b,c;
Scanner input = new Scanner(System.in);
for (a=0;a<(arr.length);a++)
{
System.out.println("enter number of subjects for student "+(a+1));
c=input.nextInt();
++c;
arr[a]=new int[c];
for (b=0;b<(arr[a].length-1);b++)
{
System.out.println("Enter marks of subject "+(b+1));
arr[a][b]=input.nextInt();
}
}
System.out.println("out data");
for (a=0;a<(arr.length);a++)
{
for (b=0;b<(arr[a].length-1);b++)
{
System.out.print(arr[a][b]+"\t");
}
System.out.print("\n");
}
System.out.println("out data done");
for (a=0;a<arr.length;a++)
{
for (b=0;b<arr[a].length;b++)
{
sum[a]+=arr[a][b];
}
}
System.out.println("sum done");
for (a=0;a<arr.length;a++)
{
arr[a][arr[a].length-1]=sum[a];
}
System.out.println("final out data");
for (a=0;a<(arr.length);a++)
{
for (b=0;b<(arr[a].length);b++)
{
System.out.print(arr[a][b]+"\t");
}
System.out.print("\n");
}
}
}