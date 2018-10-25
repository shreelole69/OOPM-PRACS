/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;



/**
 *
 * @author SHREE
Write a program that has two threads .
 One of the threads displays the even numbers 30 while the other displays odd numbers upto 30.
 */
class Odd extends Thread
{
    Odd()
    {
        super("Odd Thread");
        start();
    }
    public void run()
    {
       int sum=1 ;
         try {
             while(sum<30)
             {
                 System.out.println("Odd : "+sum);
                 sum = sum + 2 ;
                 Thread.sleep(1000);
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
        int sum=2 ;
        try{
         while(sum<30)
        {    
            
                System.out.println("Even : "+sum);
                sum = sum + 2 ;
                Thread.sleep(1000);
              
            }
        
        }
        catch (Exception ex) {
            }
            
        }
        
    
    }

public class Q9DEMO {
    public static void main(String[] args) {
        Odd fib = new Odd();
        Even eve = new Even();
}
}











