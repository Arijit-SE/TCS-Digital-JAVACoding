/*You are given an array of integers. Write a program to find the maximum difference between any two numbers in the array.

For example, given the array [2, 9, 5, 1, 7, 4], the maximum difference between any two numbers is 9 - 1 = 8.

Write a program that takes an array as input and returns the maximum difference between any two numbers in the array. */

import java.util.*;
public class MaximumDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length-1];
        System.out.println("The maximum difference: "+(max-min));
    }
}
