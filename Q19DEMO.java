
import java.util.Scanner ;
/**
 *
 * @author SHREE
 * Define a class Time . It stores the time in hours and minutes .
 * Create two objects of Time and find the difference in time between two objects using  member functions
*/
class Time
{
    Scanner scan = new Scanner(System.in);
    int hours , minutes , fhour , fmin ;
    Time()
    {
        System.out.println("Enter Time in Hours and Minutes : ");
        hours = scan.nextInt() ;
        minutes = scan.nextInt() ;
        while(minutes>=60)
        {
            minutes=minutes-60;
            hours++ ;
        }
    }
    void difference(int h , int min)
    {
        fhour = hours - h ;
        fmin = minutes - min;
        System.out.println("Difference Hours : "+fhour+" Minutes :"+fmin);
    }
}
public class Q19DEMO {
    public static void main(String[] args) {
    Time t1 = new Time();
    Time t2 = new Time();
    t1.difference(t2.hours, t2.minutes);
    }
}











