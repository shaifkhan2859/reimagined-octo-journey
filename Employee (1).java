import java.util.Scanner;
class Employee
{
   String ename;
   int id;
   Employee()
   {
     id=0;
     ename="xxx";
   }
   Employee(int i,String nm)
   {
     id=i;
     ename=nm;
   }
  
    public void display()
    {
      System.out.println("employee name"+ename);
      System.out.println("employee id"+id);
    }
}
public class EmployeeData
{
  public static void main(String args[])
  {
    System.out.println("the employee details are:");
    Employee e1=new Employee(1,"SHAIFALI");
    Employee e2=new Employee(2,"SUBRAT");
    Employee e3=new Employee();
    e1.display();
    e2.display();
    e3.display();
   
  }
}
      