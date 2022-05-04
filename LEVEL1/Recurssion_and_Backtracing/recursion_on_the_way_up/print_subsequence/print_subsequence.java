import java.io.*;
import java.util.*;

public class print_subsequence
{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printSS(str, "");
    }

    public static void printSS(String ques, String ans) {
        if(ques.length() == 0)
        {
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        String roq = ques.substring(1);

        printSS(roq, ans + "");
        printSS(roq, ans + ch);
        
    }

}