import java.util.*;
import java.io.*;
public class outp 
{
    public static void main(String[] args) throws Exception
    {    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pzz(n);
    }
    public static void pzz(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println("Pre" + n);   //1
        pzz(n-1);        //2
        System.out.println("In" + n);   //3
        pzz(n-1);    //4
        System.out.println("Post" + n);    //5
    }
}
