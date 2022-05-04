import java.io.*;
import java.util.*;

public class printpalendroome {
    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        char ch1 = str.charAt(i);
        char ch2 = str.charAt(j);

        while (i <= j) {
            if (ch1 != ch2) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }

    public static void solution(String str) {

        // write your code here
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String ss = str.substring(i, j);
                if (isPalindrome(ss) == true) {
                    System.out.println(ss);
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

}
