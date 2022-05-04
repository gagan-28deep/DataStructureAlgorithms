import java.io.*;
import java.util.*;
public class power_linear {
    public static void main(String[] args) throws Exception 
    {   
        // write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(x, n));
    }

    public static int power(int x, int n)
    {
        if(n==0)
        {
            return 1;
        }
        int xn1 = power(x, n-1);
        int xn = x * xn1;
        return xn;
        // return power(x, n-1) * x;
    }
    
    
}
