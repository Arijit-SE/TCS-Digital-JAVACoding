/*Question:

Numbers are everywhere around us. We deal with different types of numbers on a daily basis. There are real numbers, whole 
numbers, natural numbers, etc. Another kind of numbers is called strange numbers, which has the following properties:

• A strange number is an integer number 'N' which has factors that are prime numbers.

• The square root of the number 'N' should be less than the greatest prime factor of 'N'.

The task here is to find out if the given number 'N' is "Strange" Or "Not Strange"

Example 1:

Input: 
-------------------
15

Output:
-------------------
Strange
============================================

Example 2 :

Input:
------------------------
25

Output:
---------------------------
Not Strange

*/

import java.util.*;
public class Strange 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double root = Math.sqrt(N);
        int[] fac = new int[0];
        for (int i = 1; i < N; i++) {
            if(N % i == 0 && isPrime(i) == true)
            {
                fac = Arrays.copyOf(fac, fac.length+1);
                fac[fac.length-1] = i;
                Arrays.sort(fac);
            }
        }
        if(fac[fac.length-1] > root)
        {
            System.out.println("Strange");
        }
        else
        {
            System.out.println("Not Strange");
        }
    } 
    public static boolean isPrime(int n)
    {
        if(n > 2)
        {
            for (int i = 2; i < n; i++) {
                if(n % i == 0)
                {
                    return false;
                }
            }
            return true;
        }
        else if(n == 2)
        {
            return true;
        }
        return false;
    }   
}
