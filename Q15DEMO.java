

import java.util.Scanner ;
/**
 *
 * @author SHREE
 * Imagine a publishing company that markets both book and audio cassettes. Create a class
publication that stores the title and price of a publication. From this class derive two classes book,
which adds the page count and tape which adds the playing time in minutes. Each of these three
classes should have a getdata() function to get its data and putdata() function to display the data.
Write a main() program to test the book and tape classes by creating instances of them , asking the
user to fill in their data with getdata() and then displaying the data with putdata().
*/

class Publishing
{
    Scanner scan = new Scanner(System.in);
    String title ,publication ;
    void getdata()
    {
        System.out.println("Enter Title : ");
        title = scan.next();
        System.out.println("Enter Publishing : ");
        publication = scan.next();       
    }
    void putdata()
    {
        System.out.print("Title : "+title+" Publication : "+publication);
    }
}
class Book extends Publishing
{
    int count; 
    @Override
    void getdata()
    {
        super.getdata();
        System.out.println("Enter Total Number of Page : ");
        count = scan.nextInt();
    }
    
    void putdata()
    {
      super.putdata();
        System.out.print(" Total Pages : "+count); 
        System.out.println("");
    }
}
class Tape extends Publishing
{
    int time;
    void getdata()
    {
        super.getdata();
        System.out.println("Enter Time of Tape in Minutes : ");
        time = scan.nextInt();
                
    }
    void putdata()
    {
        super.putdata();
        System.out.print(" Time : "+time);
        System.out.println("");
    }
    
}


public class Q15DEMO {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter Choice 1-Book 2-Tape");
        int choice = scan.nextInt();
        switch(choice)
        {
            case 1:
             Book bk = new Book();
             bk.getdata();
             bk.putdata();
             break;
            case 2:
                Tape tp = new Tape();
                tp.getdata();
                tp.putdata();
                break ;
            default:
                System.out.println("Enter Correct Choice");
               
        }
        
    }
}











 