
import java.util.Scanner ;
/**
 *
 * @author SHREE
 Write a program to add and subtract two matrices.
*/

public class Q26DEMO {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Row and Colum of Matrix :  ");
        int row = scan.nextInt();
        int col = scan.nextInt();
        int[][] arr1 = new int[row][col] ;
        System.out.println("Enter matrix 1  : ");
        for(int i=0 ;i<row ; i++)
        {
            for(int j=0 ; j<col ; j++)
            {
                arr1[i][j] = scan.nextInt();
            }
        }
        int[][] arr2 = new int[row][col] ;
        System.out.println("Enter matrix 2  : ");
        for(int i=0 ;i<row ; i++)
        {
            for(int j=0 ; j<col ; j++)
            {
                arr2[i][j] = scan.nextInt();
            }
        }
     
        System.out.println("Addition of Two Matrices : ");
        for(int i=0 ;i<row ; i++)
        {
            for(int j=0 ; j<col ; j++)
            {
                System.out.print(" "+(arr1[i][j]+arr2[i][j]));
            }
            System.out.println("");
        }
        System.out.println("Subtraction of Two Matrices : ");
        for(int i=0 ;i<row ; i++)
        {
            for(int j=0 ; j<col ; j++)
            {
                System.out.print(" "+(arr1[i][j]-arr2[i][j]));
            }
            System.out.println("");
        }
    }
}











