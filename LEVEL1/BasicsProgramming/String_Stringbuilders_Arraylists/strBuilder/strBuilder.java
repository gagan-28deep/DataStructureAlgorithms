import java.util.*;
public class strBuilder 
{
    public static void main(String[] args)
    {
        // StringBuilder sb = new StringBuilder("hello");
        // System.out.println(sb);

        // char ch = sb.charAt(1);  // get
        // System.out.println(ch); 

        // sb.setCharAt(0, 'g');
        // System.out.println(sb); // update

        // sb.insert(2, 's'); // add or insert
        // System.out.println(sb); 

        // sb.deleteCharAt(4);
        // System.out.println(sb); // remove

        // sb.append('t');
        // System.out.println(sb); // append



        // For Loop

        // Using  String

        // int n = 10000;

        // long start = System.currentTimeMillis();

        // String s = "";
        // for(int i = 0 ; i<n ; i++)
        // {
        //     s+=i;
        // }
        // long end = System.currentTimeMillis();

        // long duration = end - start;

        // System.out.println(duration); 

        // Using StrBuilder
    
        int n1 = 10000000;

        long start = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<n1 ; i++)
        {
            sb.append(i);
        }
        long end = System.currentTimeMillis();

        long duration = end - start;

        System.out.println(duration);


    }   
}
