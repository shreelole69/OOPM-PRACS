
import java.util.Scanner ;
/**
 *
 * @author SHREE
 Consider the class network given. The class 'Admin' derives information from the class 'Account' which in 
 * turn derives information from 'Persons' class. write a program to display Admin object.
 */

class Person
{  Scanner scan = new Scanner(System.in) ;
    String name ;
    int code ;
    Person()
    {
        System.out.println("Enter Name : ");
        name = scan.next() ;
        System.out.println("Enter Code : ");
        code = scan.nextInt();
    }
    void displayper()
    {
        System.out.println("Name : "+name+" Code : "+code);
    }
}
class Account extends Person
{
    Scanner scan = new Scanner(System.in);
    int pay ;
    Account()
    {
        super() ;
        System.out.println("Enter Payement : ");
        pay = scan.nextInt() ;
    }
   
    void displayac()
    {
        super.displayper();
        System.out.println("Payment : "+pay);
    }
}
class Admin extends Account
{
    int exp ;
    Admin()
    {
        super() ;
        System.out.println("Enter Experince : ");
        exp = scan.nextInt() ;
    }
    void display()
    {
        super.displayac();
        System.out.println("Experince : "+exp);
    }
}
public class Q10DEMO {
    public static void main(String[] args) {
       Admin ad = new Admin() ;
       ad.display();
}
}











