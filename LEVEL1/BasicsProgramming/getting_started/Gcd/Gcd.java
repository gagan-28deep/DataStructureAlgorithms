import java.util.*;

public class Gcd 
{
public static void main(String[] args)
{

    // GCD AND LCM

    // Scanner scn = new Scanner(System.in);
    // int n1 = scn.nextInt();
    // int n2 = scn.nextInt();

    // int on1 = n1;
    // int on2 = n2;

    // while(n1 % n2 != 0)
    // {
    //     int rem = n1 %n2;
    //     n1 = n2 ; 
    //     n2 = rem;
    // }

    // int gcd = n2;
    // System.out.println(gcd);
    // int lcm = (on1*on2)/gcd;
    // System.out.println(lcm);

    

    // PRIME FACTORIZATION


    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    for (int div =2 ; div *div <= n; div++)
    {
        while ( n%div == 0)
        {
            n = n / div;
            System.out.print(div + " ");
        }
    }
    if(n!=1)
    {
        System.out.print(n);
    }
}       
}
