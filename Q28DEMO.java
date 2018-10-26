

import static java.lang.System.exit;
import java.util.Scanner ;
/**
 *
 * @author SHREE
 Write a program to transpose a matrix
*/

public class Q28DEMO {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Row and Col : ");
        int row = scan.nextInt() ;
        int col = scan.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter The Matrix : ");
        for(int i=0 ; i<row ; i++)
        {
            for(int j=0 ; j<col ; j++)
            {
                arr[i][j] = scan.nextInt() ;
            }
        }
        if(row!=col)
        {
            System.out.println("As Row n Col is not equal Transporse cannot be done");
            exit(0);
        }
        for(int i=0 ; i<row ; i++)
        {
            for(int j=0 ; j<col ; j++)
            {
              if(i<j)
              {  
                  int temp  = arr[i][j];
                  arr[i][j] = arr[j][i] ;
                  arr[j][i] = temp ;
              }
            }
        }
        System.out.println("Transporse of Matrix is : ");
          for(int i=0 ; i<row ; i++)
        {
            for(int j=0 ; j<col ; j++)
            {
                System.out.print(" "+arr[i][j]);
            }
            System.out.println("");
        }
    }
}











 