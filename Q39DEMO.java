

import java.util.Scanner ;
/**
 *
 * @author SHREE
Write a program to search an element in an array.
*/

public class Q39DEMO {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Number of Elements in the list");
    int n = scan.nextInt();
    int[] arr  = new int[n];
        System.out.println("Enter List : ");
        for(int i=0 ; i<n ;i++)
        {
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter Element to Find in the List : ");
        int num = scan.nextInt();
        int flag=0;
        for(int i=0 ; i<n ; i++)
        {
            if(num==arr[i])
            {
                System.out.println(""+num+" Found at "+(i+1)+" Position");
                flag=1;
            }
          
        }
        if(flag==0)System.out.println("Element Not Found in The list");
    }
}











 