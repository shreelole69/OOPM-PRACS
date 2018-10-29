

import java.util.Scanner ;
/**
 *
 * @author SHREE
To write a java program to create our exception subclass that throws exception if the
sum of two integers is greater than 99.
*/

class MyException extends Exception
{
    int a ;
    MyException(int b)
    {
      a = b ;
    }
    public String toString()
    {
        return("Sum is Greater than 99");
    }
    
}
class Q37DEMO{
   public static void main(String args[]){
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter Number 1 : ");
       int no1 = scan.nextInt();
       System.out.println("Enter Number 2 :");
       int no2 = scan.nextInt();
       try
       {
          if((no1+no2)>100)throw new MyException(2);
           System.out.println("Sum is : "+(no1+no2));
       }
       catch(MyException e)
       {
           System.out.println(e);
       }
  
}
}







 