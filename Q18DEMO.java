

import java.util.Scanner ;
/**
 *
 * @author SHREE
Define a class Distance . The class stores distances in feet and inches.
* Create two objects of the class Distance and add them. 
*/
class Distance
{
Scanner scan = new Scanner(System.in);    
int feet , inches ;
Distance()
{
    System.out.println("Enter Distance in feet and Inches : ");
    feet = scan.nextInt();
    inches = scan.nextInt();
    while(inches>=12)
    {
        inches = inches - 12 ;
        feet++ ;
    }
}

}

public class Q18DEMO {
    public static void main(String[] args) {
        Distance d1 = new Distance();
        Distance d2 = new Distance() ;
        int feet = d1.feet + d2.feet ;
        int inches = d1.inches + d2.inches;
        while(inches>=12)
        {
            inches = inches - 12 ;
            feet++ ;
        }
        System.out.println("Total Distance Feet : "+feet+" Inches : "+inches);
}
}











