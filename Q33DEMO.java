
import java.util.Scanner ;
/**
 *
 * @author SHREE
To write a program in java with a class Rectangle with the data fields width, length,
area and colour. The length, width and area are of double type and colour is of string
type.The methods are get_length(), get_width(), get_colour() and find_area().
Create two objects of Rectangle and compare their area and colour. If the area and
colour both are the same for the objects then display “Matching Rectangles”, otherwise
display “ Non-matching Rectangle”.
*/
class Rectangle
{
    Scanner scan = new Scanner(System.in);
    double width , length , area ;
    String color ;
    void get_length()
    {
        System.out.println("Enter  length : ");
        length = scan.nextDouble();
    }
    void get_width()
    {
        System.out.println("Enter Width : ");
        width = scan.nextDouble();
    }
    void get_color()
    {
        System.out.println("Enter Colour : ");
        color = scan.next();
    }
    void find_area()
    {
        area = length * width ;
    }
    void compare(String colour , Double areaa)
    {
        if(areaa==area && colour.equals(color))
        {
            System.out.println("Matching Rectangle");
        }
        else
        {
            System.out.println("Non-matching Rectangle");
        }
    }
    
}
        
public class Q33DEMO {
    public static void main(String[] args) {
       Rectangle r1 = new Rectangle();
       r1.get_length(); 
       r1.get_width();
       r1.get_color();
       r1.find_area();
       Rectangle r2 = new Rectangle();
       r2.get_length(); 
       r2.get_width();
       r2.get_color();
       r2.find_area();
       r1.compare(r2.color, r2.area);
    }
}











 