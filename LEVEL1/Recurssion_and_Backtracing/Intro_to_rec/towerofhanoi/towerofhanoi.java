import java.io.*;
import java.util.*;
public class towerofhanoi 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int t3 = sc.nextInt();
        toh(n, t1 , t2 , t3);
        // write your code here
    }

    public static void toh(int n, int t1id, int t2id, int t3id)
    {
        if(n==0)
        {
            return;
        }
        else
        {
            toh(n-1, t1id, t3id, t2id);   // will print the instructions to move n-1 disks from t1 to t3 using t2 as a temporary storage and following the rules.
            System.out.println("Move disk " + n + " from tower " + t1id + " to tower " + t3id);
            toh(n-1, t3id, t2id, t1id);   // will print the instructions to move n-1 disks from t3 to t2 using t1 as a temporary storage and following the rules.
        }
    }
}
