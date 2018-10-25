
import java.util.Scanner ;
/**
 *
 * @author SHREE
Write a program to define the following inheritance relationship
 */
class Staff
{
    Scanner scan = new Scanner(System.in) ;
    int code ;
    String name ;
    Staff()
    {
        System.out.println("Enter Code : ");
        code = scan.nextInt();
        System.out.println("Enter Name : ");
        name = scan.next() ;
    }
    void display()
    {
        System.out.println("Code : "+code+" Name : "+name);
    }
}
class Teacher extends Staff
{
    String subject , publication ;
    Teacher()
    {
        super();
        System.out.println("Enter Subject : ");
        subject = scan.next() ;
        System.out.println("Enter Publication : ");
        publication = scan.next() ;
    }
    @Override
    void display()
    {
        super.display();
        System.out.println("Subject : "+subject+" Publication : "+publication);
    }
}
class Officer extends Staff
{
    char grade ;
   Officer()
   {
       super() ;
       System.out.println("Enter Grade : ");
       grade = scan.next().charAt(0) ;
   }
   void display()
   {
       super.display();
       System.out.println("Grade : "+grade);
   }
}
class Typist extends Staff
{
    int speed ;
    Typist()
    {
        System.out.println("Enter Speed : ");
        speed = scan.nextInt() ;
    }
    void display()
    {
        super.display();
        System.out.println("Speed : "+speed);
    }
}
class Regular extends Typist
{
    int salary ;
    Regular()
    {
        super() ;
        System.out.println("Enter Salary : ");
        salary = scan.nextInt() ;
    }
    void display()
    {
        super.display();
        System.out.println("Salary Regular : "+salary);
    }
}
class Casual extends Typist
{
    int daily ;
    Casual()
    {
        super() ;
        System.out.println("Enter Daily Wages : ");
        daily = scan.nextInt() ;
    }
    void display()
    {
        super.display();
        System.out.println("Daily Wages : "+daily);
    }
}
public class Q12DEMO {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        int g=1;
       
         while(g!=0)
        {
            int choice ;
            System.out.println("Enter Choice 1-Teacher 2-officer 3-Regular Typist 4-Casual Typist : ");
            choice = scan.nextInt();
            switch(choice)
            {
                case 1:
                    Teacher t = new Teacher();
                    t.display();
                    break;
                case 2:
                    Officer of = new Officer();
                    of.display();
                    break;
                case 3:
                    Regular rg = new Regular();
                    rg.display();
                    break ;
                case 4:
                    Casual cs = new Casual();
                    cs.display();
                    break;
                default :
                    System.out.println("Enter Correct Choice");
            }
            System.out.println("Enter 1-continue 0-Exit : ");
            g = scan.nextInt();
        }
  }
        
}












