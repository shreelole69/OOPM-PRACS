


import java.util.Scanner ;
/**
 *
 * @author SHREE
Write a Java program to perform division of two numbers accepted from the user.
* Handle the IOException, NumberFormatException and ArithmeticException using multiple try, catch blocks*/
public class Q5DEMO {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        
    try
    {
        int no1 =scan.nextInt();
        int no2 = scan.nextInt();
        int no3 = no1/no2;
        System.out.println("no3");
    
    }
    catch(NumberFormatException e)
     {
                System.out.println("NumberFormatException");
     }
    catch(ArithmeticException e)
    {
        System.out.println("ArithmeticException");
    }
    
    }   
    }









 