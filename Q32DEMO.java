
import java.util.Scanner ;
/**
 *
 * @author SHREE
To write a java program to display total marks of 5 students using student class.
Given the following attributes: Regno(int), Name(string), Marks in subjects(Integer Array),
Total (int).
*/
class Student
{
    Scanner scan = new Scanner(System.in); 
    int regno ;
    String name ;
    int[] marks = new int[5];
    int total ;
    Student()
    {
        System.out.println("Enter Registration Number : ");
        regno = scan.nextInt();
        System.out.println("Enter Name : ");
        name = scan.next();
        for(int i=0 ; i<5 ; i++)
        {
            System.out.println("Enter Marks in Subject "+(i+1)+" :");
           marks[i] = scan.nextInt();
           total = total + marks[i] ; 
        }
    }
    void display()
    {
        System.out.print("Name : "+name+" RegNo : "+regno+" Marks in subject :");
        for(int i=0 ; i<5 ; i++)
        {
            System.out.print(" "+marks[i]);
        }
        System.out.print(" Total : "+total);
        System.out.println("");
    }
}
public class Q32DEMO {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student[] s = new Student[5];
        
        for(int i=0 ; i<5 ; i++)
        {
            s[i] = new Student();
            
        }
        for(int i=0 ; i<5 ; i++)
        {
                    
            s[i].display();
        }
       
    }
}











 