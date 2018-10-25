
import java.util.Scanner ;
/**
 *
 * @author SHREE
Define a class Time . It stores the time in hours and minutes .
* Create two objects of Time and find the difference in time between two objects using  constructor*/
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
    Time(int h1 , int h2 , int m1 , int m2)
    {
        hours = h1 - h2 ;
        minutes = m1 - m2 ;
        System.out.println("Difference in Time is Hours :"+hours+" Minutes : "+minutes);
    }
  
}
public class Q20DEMO {
    public static void main(String[] args) {
    Time t1 = new Time();
    Time t2 = new Time();
    Time t3 = new Time(t1.hours,t2.hours,t1.minutes,t2.minutes);
    }
}











