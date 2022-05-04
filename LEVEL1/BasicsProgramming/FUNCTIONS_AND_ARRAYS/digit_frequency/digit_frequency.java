// Input
// 994543234
// 4
// Output
// 3

import java.util.*;
public class digit_frequency 
{
    public static void main(String[] args)
    {

        //DIGITS FREQUENCY

    // Scanner scn = new Scanner(System.in);
    // int n = scn.nextInt();
    // int d = scn.nextInt();
    // int count = 0;

    // while(n!=0)
    // {
    //     int dig = n%10;
    //     n = n/10;
    //     if (dig == d)
    //     {
    //         count++;
    //     }
    // }
    // System.out.print(count);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }
    public static int getDigitFrequency(int n, int d)
    {
        int count = 0;
        while(n > 0)
        {
            int digit = n % 10;
            n = n / 10;
            if(digit == d)
            {
                count++;
            }
        }
        return count;
    }
}
