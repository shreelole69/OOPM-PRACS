/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;


import java.util.Scanner ;
/**
 *
 * @author SHREE
To write a java program to define a class that represent Complex numbers with
constructor to enable an object of this class to be initialized when it is declared and a default
constructor when no argument is provided and define methods to do the following by passing
objects as arguments
a)Addition of two Complex numbers
b)Subtraction of two Complex numbers
c)Printing the Complex numbers in the form (a, b).
*/
class Complex
{
    Scanner scan = new Scanner(System.in);
    int real , img ;
    Complex()
    {
        System.out.println("Enter Real Term : ");
        real = scan.nextInt() ;
        System.out.println("Enter Imaginary Term : ");
        img = scan.nextInt();
    }
    Complex(int a)
    {
        real=img=0 ;
    }
    void Addition(Complex a , Complex b)
    {
        System.out.println("Additon of Both Complex Terms is  : ");
        real = a.real + b.real ;
        img = a.img + b.img ;
    }
    void Subtraction(Complex a , Complex b)
    {
        System.out.println("Subtraction of Both Complex no is : ");
        real = a.real - b.real ;
        img = a.img - b.img ;
    }
    void display()
    {
        System.out.println(""+real+" +"+img+"i");
    }
            
}

public class Q34DEMO {
    public static void main(String[] args) {
    Complex c1 = new Complex();
    Complex c2 = new Complex();
    Complex c3 = new Complex(0);
    c3.Addition(c1, c2);
    c3.display();
    c3.Subtraction(c1, c2);
    c3.display();
    }
}











 