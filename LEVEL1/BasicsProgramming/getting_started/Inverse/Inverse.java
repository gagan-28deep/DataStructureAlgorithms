import java.util.*;

public class Inverse 
{
public static void main(String[] args)
{

    // INVERSE OF A NUMBER

    // Scanner scn = new Scanner(System.in);
    // int n = scn.nextInt();
    // int op=1;
    // int inv = 0;
    // while(n!=0)
    // {
    //    int od=n%10;
    //    int id = op;
    //    int ip = od;

    //    // MAKE CHANGE TO INVERSE USING IP AND ID

    //    inv = inv + id*(int)Math.pow(10, ip-1);

    //    n/=10;
    //    op++;
        
    // }
    // System.out.println(inv);



    // ROTATE A NUMBER

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int k = scn.nextInt();
    int temp = n;
    int nod=0;
    while(temp > 0)     // TO CALCULATE NUMBER OF DIGITS
    {
        temp = temp/10;
        nod++;
    }

    k = k%nod;   // FOR LARGE NUMBERS eg : 353

    if (k<0)
    {
        k = k + nod;   // FOR NEGATIVE NUMBERS
    }

    int div = 1;
    int mul = 1;
    for (int i =1 ; i <= nod ; i++)
    {
        if (i <=k)
        {
            div = div *10;
        }
        else 
        {
            mul = mul *10;

        }
    }

    int q = n / div ; 
    int r = n % div ; 
    
    int rot  = r * mul + q ; 
    System.out.println(rot);

}
}

