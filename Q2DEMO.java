
import java.util.Scanner ;
/**
 *
 * @author SHREE
Write a Java Program to calculate gross salary of an employee.
* Read Employee's details as Name, BirthDate, Designation, Basic salary, number of leaves etc.
* Make use of try, catch, throws, throws and finally keywords
*/

class Employee
{
    Scanner scan = new Scanner(System.in);
    String name ,desig, birthdate ; 
    double salary, leaves , gross  ;
    Employee()
    {
        try
        {
            System.out.println("Enter Name of Employee : ");
            name = scan.next();
            System.out.println("Enter Designation : ");
            desig = scan.next();
            System.out.println("Enter Birth date in DD/MM/YYYY format only : ");
            birthdate =scan.next();
            System.out.println("Enter Salary : ");
            salary = scan.nextDouble();
            System.out.println("Enter Leaves : ");
            leaves = scan.nextDouble();
        }
        catch(Exception e)
        {
            System.out.println("Exception Occured is "+(e.getMessage()));
        }
   }
    void gross()
    {
        if(leaves>10)
        {
          double temp = ((leaves-10)*1000);
          System.out.println("Number of Leaves : "+leaves+" Therefore for Leaves Greater 10 Deduction will be "+temp);
          salary=salary-temp;
        }
        gross  = salary + salary*0.5 + salary*0.2 ;
        System.out.println("Therefore After Adding DA and HRA Gross Salary is : "+gross);
    }
}




   public class Q2DEMO {
    public static void main(String[] args) {
    Employee emp = new Employee();
    emp.gross();
            
    }   
    }









 