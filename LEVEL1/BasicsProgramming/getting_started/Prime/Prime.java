import java.util.*;

public class Prime
{
public static void main (String[] args)
{
    //Scanner scn = new Scanner(System.in);

    //int t = scn.nextInt();


    // for(int i =0;i<t;i++)      // TIME COMPLEXITY  = 10**4 (ACCORDING TO QUESTION)
    // {
    //     int n = scn.nextInt();
        
    //     int count = 0;
    //     for (int div = 1 ; div<=n; div++)     // TIME COMPLEXITY = 10**9(ACCORDING TO QUESTION)
    //     {   
    //         if (n%div==0)            // TIME COMPLEXITY = (10** 4) * (10**9) = 10**13      t*n
    //         {

    //             count ++ ; 
            
    //         }

    //     }


    //     if (count == 2)
    //     {
    //         System.out.println("prime");
    //     }
    //     else
    //     {

    //         System.out.println("not prime");
    //     }

    //}




    // MORE OPTIMIZED CODE  

    // p*q = n   ;  p > n**0.5   or q > ** 0.5  


    // for(int i =0;i<t;i++)      // TIME COMPLEXITY  = 10**4 (ACCORDING TO QUESTION)
    // {
    //     int n = scn.nextInt();
        
    //     int count = 0;
    //     for (int div = 2 ; div * div<=n; div++)     // TIME COMPLEXITY = 10**5(ACCORDING TO QUESTION)
    //     {   
    //         if (n%div==0)            // TIME COMPLEXITY = (10** 4) * (10**5) = 10**9
    //         {

    //             count ++ ; 

    //             break               // BECAUSE ONCE WE ARE ABLE TO DIVIDE A NUMBER , ITS NOT PRIME , WE DONT NEED TO DIVIDE AGAIN
            
    //         }

    //     }


    //     if (count == 0)
    //     {
    //         System.out.println("prime");
    //     }
    //     else
    //     {

    //         System.out.println("not prime");
    //     }
    // }




    //PRINT ALL TILL N

    Scanner scn = new Scanner(System.in);

    int low = scn.nextInt();

    int high = scn.nextInt();

    for (int i = low ; i<=high ; i++)
    {
        int count = 0 ;
        for (int div = 2 ; div*div <= i ; div ++)
        {

            if ( i % div==0)
            {
                count ++ ;
                break;
            }
        }
        
        if (count == 0)
        {
            System.out.println(i);
        }

    }
    
}
}

