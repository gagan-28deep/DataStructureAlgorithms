import java.util.*;

public class Pythagorean {
public static void main (String[] args)
{

    // PYTHAGOREAN TRIPLET

    // Scanner scn = new Scanner(System.in);
    // int a = scn.nextInt();
    // int b = scn.nextInt();
    // int c = scn.nextInt();

    // int max = a;
    // if (b>=max)
    // {
    //      max = b;
    // }
    // if(c>=max)
    // {
    //     max=c;
    // }

    // if (max==a)
    // {
    //     boolean flag = ((b*b + c*c) == (a*a));
    //     System.out.println(flag);
    // }
    // else if (max == b)
    // {
    //     boolean flag = ((a*a + c*c) == (b*b));
    //     System.out.println(flag);
    // }
    // else
    // {
    //     boolean flag = ((b*b + a*a) == (c*c));
    //     System.out.println(flag);
    // }

    

    // BENJAMIN BULBS

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    for (int div = 1 ; div * div <=n ; div++)
    {
        System.out.println(div * div);
    }

}   
}
