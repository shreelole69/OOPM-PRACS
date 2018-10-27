

import java.util.Scanner ;
/**
 *
 * @author SHREE
To write a java program to create a package for Book details giving Book name, Author
name, price and year of publishing.*/

class Book
{
    Scanner scan = new Scanner(System.in);
    String name , author ;
    int price , year ;
    Book()
    {
        System.out.println("Enter Name of Book : ");
        name = scan.next();
        System.out.println("Enter Name of Author : ");
        author = scan.next();
        System.out.println("Enter Price of Book : ");
        price = scan.nextInt();
        System.out.println("Enter Year of Publishing : ");
        year =scan.nextInt();
    }
    void display()
    {
        System.out.println("Name of Book : "+name);
        System.out.println("Name of Author : "+author);
        System.out.println("Price of Book : "+price);
        System.out.println("Year of Publishing : "+year);
    }
}
public class Q36DEMO {
    public static void main(String[] args) {
    Book bk  = new Book();
    bk.display();
    }
}











 