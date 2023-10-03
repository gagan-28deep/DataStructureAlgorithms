import java.io.*;
import java.util.*;
public class power_log 
{
    
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int ans = power(x, n);
        System.out.println(ans);
    }

    public static int power(int x, int n)
    {
        if(n==0)
        {
            return 1;
        }
        else if(n%2==0)
        {
            return power(x, n/2)*power(x, n/2);
        }
        else
        {
            return x*power(x, n/2)*power(x, n/2);
        }

        // // if(n ==0)
        // {
        //      return 1;
        // }
        // int xn1 = power(x, n/2);
        // int xn = xn1 * xn1;

        // if(n%2==1)
        // {
        //     xn = x * xn;
        // }
        // return xn;
    }

}
