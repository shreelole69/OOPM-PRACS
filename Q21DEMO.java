

import java.util.Scanner ;
/**
 *
 * @author SHREE
 * Write a program to check whether the given string is palindrome
*/
public class Q21DEMO {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s ;
        System.out.println("Enter String");
        s = scan.nextLine();
        int i , j ,flag=0;
        int n = s.length();
        for(i=0,j=(n-1);  i<n/2 ; i++, j--)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                flag=1; 
            }
        }
        if(flag==0)
        {
            System.out.println("Entered String is Palindrome");
        }
        else
        {
            System.out.println("Entered String is not Palindrome");
        }
     }
}











