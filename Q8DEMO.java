
package javaapplication2;



/**
 *
 * @author SHREE
 * Write a program that has two threads . One of the threads displays
 * the elements of Fibonacci series upto 100 while the other displays even numbers upto 30.
 */
class Fibonacci extends Thread
{
    Fibonacci()
    {
        super("Fibonacci Thread");
        start();
    }
    public void run()
    {
        int t1=0 , t2=1 , t3=t1+t2 , count=0;
       
         try {
        
        while(t3<100)
        {
              if(count<=1)
              {
               if(count==0)
               {
                   System.out.println("Fibonacci "+t1);
               }
               else
               {
                   System.out.println("Fibonacci :"+t2);
               }
              }
              else
              { t3 = t1 + t2 ;
                t1 = t2  ;
                t2 = t3 ;
                System.out.println("Fibonacci : "+t3);
              }
                Thread.sleep(1000);
                count++ ;
            }
         }
        catch(Exception ex) {
            }
            
            
             }
            
            
          
        }
        


class  Even extends Thread
{
    Even()
    {
        super("Even Thread");
    
        start();
        
    }
    public void run()
    {
        int sum=2 , count=0 ;
        try{
        while(sum<30)
        {    
            
                System.out.println("Even : "+sum);
                sum = sum + 2 ;
                Thread.sleep(1000);
                count++ ;
            }
        
        }
        catch (Exception ex) {
            }
            
        }
        
    
    }

public class Q8DEMO {
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        Even eve = new Even();
}
}











