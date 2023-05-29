/*Write a program to find the longest common prefix among an array of strings. The longest common prefix is the string that 
all strings in the array have in common as a prefix.

For example, given the array of strings ["flower", "flow", "flight"], the program should return the string "fl" as it is the 
longest common prefix among all the strings.

Write a program that takes an array of strings as input and returns the longest common prefix among them. */

import java.util.*;
public class Common_Prefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of words: ");
        int n = sc.nextInt();sc.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextLine();
        }

        String ans = "";
        int min = arr[0].length();
        for (int i = 1; i < arr.length; i++) {
            if(arr[i].length()<min)
            {
                min = arr[i].length();
            }
        }

        for (int i = 0; i < min; i++) {
            boolean check = true;
            for (int j = 1; j < arr.length; j++) {
                if(arr[j-1].charAt(i) != arr[j].charAt(i))
                {
                    check = false;
                    break;
                }
            }
            if(check == true)
            {
                ans += arr[0].charAt(i);
            }
            else
            {
                break;
            }
        }
        System.out.println(ans);
    }
}
