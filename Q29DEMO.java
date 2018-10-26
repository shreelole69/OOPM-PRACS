

import java.util.Scanner ;
/**
 *
 * @author SHREE
 Write a program to swap contents of two arrays
*/

public class Q29DEMO {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter No Elements : ");
        int num = scan.nextInt();
        int[] arr1 = new int[num];
        int[] arr2 = new int[num];
        System.out.println("Enter Array 1 : ");
        for(int i=0 ; i<num ; i++)
        {
            arr1[i] = scan.nextInt();
        }
        System.out.println("Enter Array 2 : ");
        for(int i=0 ; i<num ; i++)
        {
            arr2[i] = scan.nextInt();
        }
        for(int i=0 ;i<num ; i++)
        {
            int temp ;
            temp = arr1[i] ;
            arr1[i]=arr2[i];
            arr2[i] = temp ;
        }
        System.out.println("After Swapping Contents of Array 1 : ");
        for(int i=0 ; i<num ;i++)
        {
            System.out.print(" "+arr1[i]);
        }
        System.out.println("");
        System.out.println("After Swapping Contents of Array 2 : ");
        for(int i=0 ; i<num ;i++)
        {
            System.out.print(" "+arr2[i]);
        }
        System.out.println("");
    }
}











 