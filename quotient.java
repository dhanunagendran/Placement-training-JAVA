import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        float d = (float)a/b;
        int e = a%b;
        System.out.printf("%d / %d = %.6f%n", a, b, d);
        System.out.printf("%d %% %d = %d%n", a, b, e);
    }
}
