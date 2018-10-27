

import java.util.Scanner ;
/**
 *
 * @author SHREE
*/

public class Q42DEMO {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number to find equivalent String : ");
        int n = scan.nextInt();
        String[] arr = {"zero" , "one" , "two" , "three" , "four" , "five" , "six" ,"seven" , "eight" , "nine"};
        String s = String.valueOf(n);
        System.out.println("The Number is : ");
        for(int i=0 ; i<s.length() ; i++)
        {
            System.out.print(" "+arr[Character.getNumericValue(s.charAt(i))]);
        }


    }
}











 