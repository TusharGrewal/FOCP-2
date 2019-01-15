//Author : Tushar Grewal
//Version : 1.122
//Purpose : Create a class Employee that includes the following: name, year of joining, salary,address.
import java.util.*;
class Employee2
{
String Name()
{Scanner input = new Scanner(System.in);
System.out.println("Enter your name :");
String Name = input.nextLine();
return Name;
}
double Year()
{
Scanner input = new Scanner(System.in);
System.out.println("Enter your year of joining :");
double Year = input.nextDouble();
return Year;
}
double Salary()
{
Scanner input = new Scanner(System.in);
System.out.println("Enter your annual salary :");
double Salary = input.nextDouble();
return Salary;
}
String Address()
{
Scanner input = new Scanner(System.in);
System.out.println("Enter your address :");
String Address = input.nextLine();
return Address;
}
public void display(String Name,double Year,double Salary,String Address)
{
System.out.print("Name");
System.out.print("   ");
System.out.print("Year of joining");
System.out.print("   ");
System.out.print("Salary");
System.out.print("   ");
System.out.print("Address");
System.out.println("   ");
System.out.print(Name);
System.out.print("   ");
System.out.print(Year);
System.out.print("           ");
System.out.print(Salary);
System.out.print("       ");
System.out.print(Address);
System.out.print("   ");
}
}
class EmployeeTest2
{
public static void main(String args[]){
Employee2 EmployeeObject = new Employee2();
EmployeeObject.display(EmployeeObject.Name(),EmployeeObject.Year(),EmployeeObject.Salary(),EmployeeObject.Address());
}
}

