

import java.util.Scanner ;
/**
 *
 * @author SHREE
 To write a java program that creates a string object and initializes it with your name
and performs the following operations
a)To find the length of the string object using appropriate String method.
b)To find whether the character ‘a’ is present in the string. If yes find the number of
times ‘a’ appear in the name and the location where it appears
*/

public class Q31DEMO {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The String : ");
        String s = scan.nextLine();
        int len = s.length();
        int count=0 ;
        for(int i=0 ; i<s.length() ; i++)
        {
          if(s.charAt(i)=='a')
          {
              System.out.println("Character a is present at position : "+(i+1));
              count++;
          }              
        }
        System.out.println("Total Character 'a' alphabets present : "+count);
        System.out.println("Lenght of the String is : "+len);
    }
}











 