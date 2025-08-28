import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Pre-increment on a
        int pre = ++a;

        // Post-increment on b
        int post = b++;

        System.out.println("Pre increment:" + pre);
        System.out.println("Post increment:" + post);
        System.out.println("Final values:" + a + " " + b);
    }
}
