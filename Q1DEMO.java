/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner ;
/**
 *
 * @author SHREE
 *
 */
class Para
{
    Scanner scan = new Scanner(System.in);
    double radius;
    double length ;
    double breath ;
    Para(int a)
    {
        System.out.println("Enter Radius : ");
        radius = scan.nextDouble();
    }
    Para()
    {
        System.out.println("Enter Lenght and Breath : ");
        length = scan.nextDouble() ;
        breath = scan.nextDouble() ;
    }
}
class Circle extends Para
{
    double area , para ;
    Circle(int a)
    {
        super(a);
    }
    void area()
    {
         area = 3.14*radius*radius;
    }
    void perimeter()
    {
        para = 2 * 3.14 * radius ;
    }
}
class Rectangle extends Para
{
    double area , para ;
    Rectangle()
    {
        super();
    }
    void area()
    {
        area = length * breath ;
    }
    void perimeter()
    {
        para = 2 *(length+breath);
    }
}
public class Q1DEMO
{
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 1-Circle 2-Rectangle :");
    int choice = scan.nextInt() ;
    switch(choice)
    {
        case 1:
            Circle c = new Circle(1);
            c.area() ;
            c.perimeter() ;
            System.out.println("Area : "+c.area+" Perimeter : "+c.para);
            
            break ;
        case 2:
            Rectangle r = new Rectangle();
            r.area();
            r.perimeter();
            System.out.println("Area : "+r.area+" Perimeter : "+r.para);
            break ;
        default:
        System.out.println("Enter Correct Choice");
    }




		
	}
} 
