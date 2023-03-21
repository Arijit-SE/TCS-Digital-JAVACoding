/*You are given an square 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
  You have to rotate the image in place, which means you have to modify the input 2D matrix directly. 
  DO NOT allocate another 2D matrix and do the rotation.
 
  Input :
  ----------------
  1 2 3
  4 5 6
  7 8 9

  Output :
  --------------
  7 4 1
  8 5 2
  9 6 3
 */
import java.util.*;
public class Rotate_Matrix 
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("Row : ");
      int row = sc.nextInt();sc.nextLine();
      System.out.print("Column :");
      int col = sc.nextInt();sc.nextLine();
      int[][] arr = new int[row][col];
      int[][] ans = new int[col][row];
      int[][] ans2 = new int[col][row];
      for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) 
        {
          arr[i][j] = sc.nextInt();
        }
      }
      System.out.println("-------------------------");
      System.out.println("Transpose Matrix : ");
      for (int i = 0; i < col; i++) {
        for (int j = 0; j < row; j++) 
        {
          ans[i][j] = arr[j][i];
          System.out.print(ans[i][j]+" ");
        }
        System.out.println(); 
      }
      System.out.println("----------------------------");
      for (int i = 0; i < col; i++) {
        for (int j = 0; j < row; j++) 
        {
          ans2[i][j] = ans[i][row-j-1];
          System.out.print(ans2[i][j]+" ");
        }
        System.out.println();  
      }
      
    }
}
