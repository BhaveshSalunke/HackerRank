/*
    Problem: https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        try{
            int a = scan.nextInt();
            int b = scan.nextInt();
            int div = a/b;
            System.out.println(div);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
    }
}
