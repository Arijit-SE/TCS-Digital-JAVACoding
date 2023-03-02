/* Take last digit of an array and placed it at front. 
 * The process run upto n times by user input
 * 
 * Input :
 * ----------------
 * 5
 * 1 2 3 4 5
 * 3
 * 
 * Output :
 * ----------------
 * 3 4 5 1 2
 */

import java.util.*;
public class Arrays_Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt(); // [1,2,3,4,5]
        }
        int k = sc.nextInt();      // k = 2
        for (int i = 0; i < k; i++) 
        {
            int num = arr[n-1]; // num = 5,4
            for (int j = n-1; j>0; j--) {
                arr[j] = arr[j-1];
            }
            arr[0] = num;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" "); // [4,5,1,2,3]
        }

    }
    
}
