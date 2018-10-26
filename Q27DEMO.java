
import java.util.Scanner ;
/**
 *
 * @author SHREE
 Write a program to delete an element in an array
*/

public class Q27DEMO {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number of Elements in array : ");
        int no = scan.nextInt() ;
        int[] arr = new int[no] ;
        System.out.println("Enter Array : ");
        for(int i=0 ; i<no ; i++)
        {
            arr[i] = scan.nextInt();
        }
        System.out.println("Entered Array is : ");
        for(int i=0 ; i<no ; i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println("");
        System.out.println("Enter element to delete in array : ");
        int del = scan.nextInt();
        int index=0;
        for(int i=0 ;i<no ;i++)
        {
            if(del==arr[i])
            {
                index = i ;
            }
        }
        for(int i=index ; i<no-1 ; i++)
        {
            arr[i] = arr[i+1];
        }
        no--;
        System.out.println("After Deleting The Element The Array is : ");
        for(int i=0 ; i<no ; i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println("");
        
    }
}











