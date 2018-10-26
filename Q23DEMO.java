
import java.util.Scanner ;
/**
 *
 * @author SHREE
 *Write a program to sort the array in ascending and descending order
*/
class InsertionSort
{
    
    void asscending(int[] arr)
    {
        for(int i=0 ; i<arr.length ; i++)
        {
            int temp = arr[i];
            int j ;
            for(j=i ; j>0&&arr[j-1]>temp ; j--)
            {
                arr[j] = arr[j-1];
            }
            arr[j] = temp ;
        }
        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
    }
    void descending(int[] arr)
    {
         for(int i=0 ; i<arr.length ; i++)
        {
            int temp = arr[i];
            int j ;
            for(j=i ; j>0&&arr[j-1]>temp ; j--)
            {
                arr[j] = arr[j-1];
            }
            arr[j] = temp ;
        }
        int[] temp = new int[arr.length];
        for(int i=0 , j=arr.length-1 ; i<arr.length ; i++ , j--)
        {
            temp[j] = arr[i];
        }
        for(int i=0 ; i<arr.length ; i++)
        {
            arr[i] = temp[i];
        }
        for(int i=0 ;i<arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
    }
    
    
}
public class Q23DEMO {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number of Terms : ");
        int n = scan.nextInt();
        int[] arr = new int[n] ;
        System.out.println("Enter Element : ");
        for(int i=0 ; i<n ; i++)
        {
            arr[i] = scan.nextInt();
        }
        InsertionSort ins = new InsertionSort();
        System.out.println("Sorting in Ascending Order");
        ins.asscending(arr);
        System.out.println("Sorting in Decesding Order");
        ins.descending(arr);
    
    }
}











