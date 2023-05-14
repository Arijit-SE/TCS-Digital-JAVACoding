/* Find the even number in an array which is minimum. If not found then print -1.
 * 
 * Input: 
 * ---------------
 * 5
 * 5 4 7 3 9 12
 * 
 * Output:
 * ---------------
 * 4
 */

import java.util.*;
public class MinimumEvenInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        boolean f = true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0)
            {
                System.out.println(arr[i]);
                f = false;
                break;
            }
        }
        if(f==true)
        {
            System.out.println(-1);
        }
    }
}
