import java.util.*;
import java.io.*;
/**
 Author: Challa Saraswathi Lalith
 Contact at:lalithcspersonal@gmail.com
 Date:18-11-2023
 Project: Advanced Coding
 */
/*
Problem Description:
Given two integers A and B, the task is to check whether the given numbers are anagrams of each other or not. Just like strings, a number is said to be an anagram of some other number if it can be made equal to the other number by just shuffling the digits in it. //DO THIS WITHOUT USING STRINGS

Input Format

Read input as an integer

Constraints

NIL

Output Format

Print Yes if an Anagram otherwise Print No if not an Anagram.

Sample Input 0

123
321
Sample Output 0

YES
*/
public class Anagram {
    static int getLength(int n) {
        int l = 0;
        while (n > 0) {
            l++;
            n = n / 10;
        }
        return l;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int l1, l2;
        l1 = getLength(a);
        l2 = getLength(b);
        int c, d, num1 = a, num2 = b, count = 0;
        if (l1 == l2) {
            while (num1 > 0) {
                c = num1 % 10;
                boolean found = false; // Flag to track if digit 'c' is found in num2
                int tempNum2 = num2; // Create a temporary variable to preserve num2's original value
                while (tempNum2 > 0) {
                    d = tempNum2 % 10;
                    if (c == d) {
                        found = true;
                        break; // Found the digit 'c' in num2, break the inner loop
                    }
                    tempNum2 /= 10;
                }
                if (!found) {
                    break; // If 'c' is not found in num2, break the outer loop
                }
                num1 /= 10;
            }
            if(num1==0)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
        else
            System.out.println("NO");
        double i=in
    }
}
