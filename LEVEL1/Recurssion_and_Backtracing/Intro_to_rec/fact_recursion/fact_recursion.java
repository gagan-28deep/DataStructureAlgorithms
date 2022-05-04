import java.util.*;
import java.io.*;
public class fact_recursion 
{
    
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);

        // int fact = 1;
        // int fn = n*factorial(n-1);
        // return fn;
    }
}
