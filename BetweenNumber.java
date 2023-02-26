/* Count of Nonrepeat-digited number (10, 12, 13,.............) between a range
 * Note:
 * Repeat-Digit :- 11, 22, 33, .............
 * You should ignore the digit and count the other numbers
 * 
 * Input : 
 * ---------------------
    10
    25

    Output :
    -------------------
    14
*/

import java.util.*;
public class BetweenNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count=0;
        for (int i = a; i <=b; i++) {
            String s = Integer.toString(i);
            int num=0;
            for (int j = 0; j < s.length()-1; j++) 
            {
                for (int k = j+1; k < s.length(); k++) 
                {
                    if(s.charAt(j)==s.charAt(k))
                    {
                        num++;
                    }
                }
            }
            if(num==0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
