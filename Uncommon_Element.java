/* Take two set of numbers of two specific lengths A and B.
 * Find those numbers of set A which are not in set B.
 * 
 * Input 
 * ----------------------
 * 8                  <-------------- Lenght of set A
 * 5                  <-------------- Length of set B
 * 2 5 8 9 4 6 1 7    <-------------- set A
 * 1 5 3 8 4          <-------------- set B
 * 
 * Output
 * ----------------------
 * 2 9 6 7            <-------------- elements of A not in B
 */

import java.util.*;
public class Uncommon_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] A = new int[m];
        int[] B = new int[n];
        for (int i = 0; i < m; i++) 
        {
            A[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }
        int c=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < B.length; j++) {
                if(A[i]!=B[j])
                {
                    c++;
                }
            }
            if(c == n)
            {
                System.out.print(A[i]+" ");
            }
            c = 0;
        }   
    }
}
