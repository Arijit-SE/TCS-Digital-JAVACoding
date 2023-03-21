/* Write a program to find the minimum value of B for a given value of A. If we multiply the digits of B we get the exact
   value of A.

   Result B must be contains more than 1 digit.

 * Input : 10
 * Output : 25
 * Explanation : 2*5 = 10 and this is minimum value of B
 
 * Input : 100
 * Output : 455
 * Explanation : 4*5*5 = 100
*/

import java.util.*;
public class Minimum_Number 
{
    public static void main(String args[]) 
    { 
            Scanner sc = new Scanner(System.in);
            int A = sc.nextInt();
            int B = findMinB(A);
            if(B>0)
            {
                System.out.println(B);
            }
            else
            {
                System.out.println("No value found");
            }
    } 
    public static int findMinB(int A) 
    {
        int B = 10;
        while (true) {
            String b = Integer.toString(B);
            int product = 1;
            for (int i = 0; i < b.length(); i++) 
            {
                int c = Integer.parseInt(String.valueOf(b.charAt(i)));
                if (c!=0 && A % c == 0) 
                {
                    product = product * c;
                } 
                else 
                {
                    break;
                }
            }
            if (product == A) 
            {
                return B;
            } else if (product > A) {
                return 0;
            }
            B++;
        }
    }
}    
