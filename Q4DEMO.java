
import java.util.Scanner;
/**
 *
 * @author SHREE
 * Write a Java Program to find number of uppercase and lowercase characters 
 * blank spaces , digits and special characters from input string.
 */

public class Q4DEMO {
    public static void main(String[] args) {
       Scanner scan =new Scanner(System.in);
        String s ;
        int uppercase=0 , lowercase=0 , space=0 ,digits=0, special=0 ;
        System.out.println("Enter String : ");
        s = scan.nextLine();
        for(int i=0 ; i<s.length() ; i++)
        {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')uppercase++;
            else if(s.charAt(i)>='a' && s.charAt(i)<='z')lowercase++ ;
            else if(s.charAt(i)==' ')space++ ;
            else if(s.charAt(i)>='0' && s.charAt(i)<='9')digits++ ;
            else special++ ;                
        }
        System.out.println("Uppercase : "+uppercase+"\nLowercase : "+lowercase+"\nSpaces : "+space+"\nDigits : "+digits
        +"\nSpecial : "+special);
        
}
}
