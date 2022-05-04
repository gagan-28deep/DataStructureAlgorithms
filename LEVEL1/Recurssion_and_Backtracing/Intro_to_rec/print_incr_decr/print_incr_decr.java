import java.io.*;
import java.util.*;

public class print_incr_decr
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pd1(n);

    }

    public static void pd1(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        pd1(n-1);
        System.out.println(n);
    }
}
