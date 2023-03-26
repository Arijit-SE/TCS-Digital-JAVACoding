/* Find how many characters must be removed in a string of a character series to get a common difference of the count 
of different characters. If no characters need to remove then print "NA".

Input
----------------
aaaaabbc
1

Output
----------------
2

Process
----------------
Number of a : 5
Number of b : 2
Number of c : 1
Common difference : 1

5(a) - 2(b) = 3(extra 3 a are there), so we should remove 3-1= 2(a)
2(b) - 1(c) = 1, no charactres should remove
Hence the output = 2.

*/

import java.util.*;
public class Count_Elimination_Character 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i=0, j = 0;
        int[] arr = new int[0];
        while(i == j) {
            int count = 0;
            while(j < s.length()) {
                if(s.charAt(i) == s.charAt(j))
                {
                    count++;
                }
                else
                {
                    arr = Arrays.copyOf(arr, arr.length+1);
                    arr[arr.length-1] = count;
                    i = j;
                    break;
                }
                j++;
            }
            if(j==s.length())
            {
                arr = Arrays.copyOf(arr, arr.length+1);
                arr[arr.length-1] = count;
                break;
            }
        }
        int diff = sc.nextInt();
        int c = 0;
        for (int k = arr.length-1; k >0; k--) {
            if(arr[k-1] - arr[k] != diff)
            {
                c += arr[k-1] - arr[k] - diff;
                arr[k - 1] = arr[k] + diff;
            }
        }
        System.out.println(c);
    }    
}
