import java.util.*;
public class SubSumOfDiag2Matrix
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row/col :");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int sum1=0, sum2=0,sub;
        for (int r = 0; r < matrix.length; r++) 
        {
            for (int c = 0; c < matrix.length; c++) 
            {
                matrix[r][c]=sc.nextInt();
                if(r==c)
                {
                    sum1 = sum1+matrix[r][c];
                }
                if(r==(matrix.length-1-c))
                {
                    sum2 = sum2+matrix[r][c];
                }
            }
        }
        if(sum1>sum2)
        {
            sub = sum1-sum2;
        }
        else
        {
            sub = sum2-sum1;
        }
        System.out.println("The substraction of the sums of each diagonals : "+sub);
    }
}