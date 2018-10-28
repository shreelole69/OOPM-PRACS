

import java.util.Scanner ;
/**
 *
 * @author SHREE
 * Write a Program to compute area of a Rectangle and Square by using abstract class
*/
abstract class Parameter
{
    Scanner scan = new Scanner(System.in);
    double length , breath , side ;
    Parameter()
    {
        System.out.println("This Rectangle");
        System.out.println("Enter Length : ");
        length  = scan.nextDouble();
        System.out.println("Enter Breath : ");
        breath = scan.nextDouble();
    }
    Parameter(int a)
    {
        System.out.println("This Square");
        System.out.println("Enter Side : ");
        side = scan.nextDouble();
    }
}
class Rectangle extends Parameter
{
    Rectangle()
    {
        super() ;
    }
    void area()
    {
        System.out.println("Area is : "+(length*breath));
    }
}
class Square extends Parameter
{
    Square()
    {
        super(0);
    }
    void area()
    {
        System.out.println("Area is : "+(side*side));
    }
}

public class Q16DEMO {
    public static void main(String[] args) {
    Rectangle r = new Rectangle();
    Square s = new Square();
    r.area();
    s.area();

    }
}











 