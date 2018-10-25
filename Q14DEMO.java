
import java.util.Scanner ;
/**
 *
 * @author SHREE
Write a Java method to count all words in a string.
 */

public class Q14DEMO {
    public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   String s ;
        System.out.println("Enter String : ");
        s = scan.nextLine();
        int word=0;
        
        for(int i=0 ; i<s.length() ; i++)
        {
            if((s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='A' && s.charAt(i)<='Z'))word++ ;
        }
        System.out.println("Words are : "+word);
    }
        
}












