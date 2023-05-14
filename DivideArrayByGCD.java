/* Take input an array, then divide the whole array by there gcd.
 * Input-1
 * ----------
 * 5
 * 36 12 9 48 15
 * 
 * Output-1
 * ----------
 * 12 4 3 16 5
 * 
 * Input-2
 * ----------
 * 5
 * 31 51 47 63 24
 * 
 * Output-2
 * ----------
 * 31 51 47 63 24
 */

import java.util.*;

public class DivideArrayByGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

    // Take array 

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

    // Find minimum number

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }

    // Find GCD

        int gcd = 1;
        for (int i = 1; i <= min; i++) {
            boolean f = true;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] % i != 0)
                {
                    f = false;
                }
            }
            if(f == true)
            {
                gcd = i;
            }
        }

    // Find Solution

        for (int i = 0; i < arr.length; i++) {
            int sol = arr[i]/gcd;
            System.out.print(sol+" ");
        }
    }
}
