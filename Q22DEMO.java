
import java.util.Scanner ;
/**
 *
 * @author SHREE
 *Write a program that sorts the array and returns minimum and maximum of the array
*/
class InsertionSort
{
    InsertionSort(int[] arr)
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
    }
    int min(int[] arr)
    {
     return arr[0];
    }
    int max(int[] arr)
    {
        return arr[arr.length-1];
    }
}
public class Q22DEMO {
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
        InsertionSort ins = new InsertionSort(arr);
        int min = ins.min(arr);
        int max = ins.max(arr);
        System.out.println("Sorted Array is : ");
        for(int i=0 ; i<n ; i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Maximum is "+max);
        System.out.println("Minimum is "+min);
    }
}











