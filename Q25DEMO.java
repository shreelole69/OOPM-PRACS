

import java.util.Scanner ;
/**
 *
 * @author SHREE
 *Write a program that reads an array of numbers ,calculates and displays 
 * the row and column total and displays grand total
*/

public class Q25DEMO{
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number of Rows and Colums : ");
        int row = scan.nextInt();
        int col = scan.nextInt();
        int[][] arr = new int[row][col] ;
        System.out.println("Enter The Matrix : ");
        for(int i=0 ;i<row ; i++)
        {
            for(int j=0 ; j<col ; j++)
            {
                arr[i][j] = scan.nextInt() ;
            }
        }
        System.out.println("Entered Matrix is : ");
        for(int i=0 ;i<row ; i++)
        {
            for(int j=0 ; j<col ; j++)
            {
                System.out.println("At row: "+(i+1)+" col: "+(j+1)+" element: "+arr[i][j]);
            }
        }
        int sum = 0 ;
        for(int i=0 ;i<row ; i++)
        {
            for(int j=0 ; j<col ; j++)
            {
              sum = sum + arr[i][j];
            }
        }
        System.out.println("Grand Total Of Matrix is : "+sum);
    }
}











