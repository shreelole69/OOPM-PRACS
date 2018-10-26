
import java.util.Scanner ;
/**
 *
 * @author SHREE
 *Write a program to concatenate two strings without using string function.
*/

public class Q24DEMO {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter String 1 : ");
        String s1 = scan.nextLine();
        System.out.println("Enter String 2 i.e to be Concatenate to 1 : ");
        String s2 = scan.nextLine();
        s1 = s1 + s2 ;
        System.out.println("Now After Concatenate String is : ");
        System.out.println(s1);
    
    }
}











