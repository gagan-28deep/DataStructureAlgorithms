import java.util.*;
public class anybase_to_anybase 
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int  destBase= scn.nextInt();
        int dec = anybasetodecimal(n , sourceBase);
        int getv = decimaltoanybase(dec, destBase);
        
        System.out.println(getv);
    
        }
    
    
        public static int anybasetodecimal(int n, int b)
        {
            int rv = 0;
            int p = 1;
            while(n>0)
            {
                int digits = n %10;
                n = n/10;
                rv += digits *p;
                p = p*b;
            }
            return rv;
        }
    
        public static int decimaltoanybase(int n, int b)
        {
            int p = 1;
            int digits ;
            int rv = 0;
            while(n>0)
            {
                digits = n % b;
                n = n/b;
                rv += digits * p;
                p = p*10;
    
            } 
            return rv;
        }
    
    
}
