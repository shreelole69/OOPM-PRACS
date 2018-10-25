

import java.util.Scanner ;
/**
 *
 * @author SHREE
Write a program to generate Fibonacci series using constructor.
 */
class Fibonacci
{
    int t1=0 , t2=1 , t3;
    Fibonacci(int t)
    {
        System.out.print(""+t1+" "+t2);
        for(int i=1 ; i<t ; i++)
        {
            t3 = t1 + t2 ;
            t1 = t2 ;
            t2 = t3;
            System.out.print(" "+t3);
        }
    }
            
}

public class JavaApplication2 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number of Terms : ");
        int term = scan.nextInt() ;
        Fibonacci fb = new Fibonacci(term);
        
}
}











