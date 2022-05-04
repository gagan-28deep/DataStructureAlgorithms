import java.util.*;
public class decimal_to_anybase 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int base = sc.nextInt();
        int dn = getValueinbase(n, base);
        System.out.println("The value in base " + base + " is " + dn);        
    }

    public static int getValueinbase(int n, int base) 
    {
        int rv = 0;
        int i = 1;
        int digits;
        while (n >0) 
        {
            digits = n %base;
            n = n/base;
            rv+=digits*i;
            i = i*10;
        }
        return rv;
    }
}
