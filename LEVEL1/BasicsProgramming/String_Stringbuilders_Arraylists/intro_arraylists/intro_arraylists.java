import java.util.*;
public class intro_arraylists 
{   
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<>();   // Can be of any data type
        System.out.println(arr + "->" + arr.size()); 

        // add value

        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println(arr + "->" + arr.size());

        // insert 
        arr.add(1 ,1000);
        System.out.println(arr + "->" + arr.size());

        // get and set value

        int get = arr.get(2);   // not arr[1]
        System.out.println(get);

        arr.set(1, 5000);   // not arr[1] = 5000
        System.out.println(arr + "->" + arr.size());

        arr.remove(1);
        System.out.println(arr + "->" + arr.size());

        // for(int i = 0 ; i<arr.size(); i++)
        // {
        //     int val1 = arr.get(i);
        //     System.out.println(val1);
        // }

        for (int val1 : arr)
        {
            System.out.println(val1);
        }
    }
    
}
