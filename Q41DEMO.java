
import java.util.Scanner ;
/**
 *
 * @author SHREE
Write a program to check whether the matrix is symmetric or not.
*/

public class Q41DEMO {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Row and Column of Matrix : ");
        int row = scan.nextInt();
        int col = scan.nextInt();
       int[][] arr = new int[row][col];
        System.out.println("Enter Matrix : ");
        for(int i=0 ; i<row ; i++)
        {
            for(int j=0 ; j<col ; j++)
            {
                arr[i][j] = scan.nextInt();
            }
        }
        int flag=0;
        for(int i=0 ; i<row ; i++)
        {
            for(int j=0 ; j<col ; j++)
            {
             if(arr[i][j]!=arr[j][i])
             {
                 flag=1 ;
             }
             
            }
        }   
        if(flag==1)
        {
            System.out.println("Entered Matrix is not Symmetric");
        }
        else
        {
            System.out.println("Entered Matrix is Symmetric");
        }
                  
    }
}











 