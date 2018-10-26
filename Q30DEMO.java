

import java.util.Scanner ;
/**
 *
 * @author SHREE
To write a java program to print the Armstrong numbers
*/

public class Q30DEMO {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number for which ArmsStrong Number Less than that are displayed : ");
        int num = scan.nextInt() ;
        System.out.println("Armstrong Numbers are : ");
        for(int i=100 ; i<num ; i++)
        {
                
            String temp =String.valueOf(i) ;
            int sum=0 ;
            for(int j=0 ;j<temp.length();j++)
            {
                String s ="";
                s = s + temp.charAt(j);
                int a = Integer.parseInt(s);
                sum = sum +  a*a*a ;
            }
            
            if(sum==i)
            {
                System.out.println(i);
            }
        }
    }
}











 