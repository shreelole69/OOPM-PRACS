

import java.util.Scanner ;
/**
 *
 * @author SHREE
Write a Java method to count all vowels in a string.
 */

public class Q13DEMO {
    public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   String s ;
        System.out.println("Enter String : ");
        s = scan.nextLine();
        int vowel=0;
        
        for(int i=0 ; i<s.length() ; i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u' ||
                    s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')vowel++ ;
        }
        System.out.println("Vowels are : "+vowel);
    }
        
}












