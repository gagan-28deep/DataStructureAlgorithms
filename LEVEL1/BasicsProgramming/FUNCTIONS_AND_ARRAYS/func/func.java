import java.util.*;
public class func
{
    public static void display(int n , int r , int npr)    // THE FUNCTIONS WHICH DONT RETURN ANYTHING ARE VOID FUNCTIONS.
    {
        System.out.print(n + "P" + r + "=" + npr);
    }
    public static int fact(int x)
    {
        int rv = 1;
        for (int i = 1 ; i<=x ; i++)
        {
            rv = rv *i;
        }
        return rv;   // RETURN WILL TERMINATE THE FUNCTION AND GIVE THE VALUE IN THE MAIN FUNCTION OF THE PROGRAM AND THE MEMORY STACK WILL BE EMPTY.
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();

        int nfact = fact(n);
        int nprfact = fact(n-r);

        int npr = nfact / nprfact;
        //System.out.print(n + "P" + r + "=" +  npr);
        display(n, r, npr);
    }
}