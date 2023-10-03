import java.util.*;
import java.io.*;
public class get_subsequence {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> res = gss(str);
        System.out.println(res); 

    }



    // bc -> [-- , -c, b- , bc]
    // abc -> [--- , --c , -b- , -bc , a-- , a-c , ab- , abc]
    public static ArrayList<String> gss(String str) {
        if(str.length() ==0)
        {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);   //a
        String ros = str.substring(1);  //bc
        ArrayList<String> rres = gss(ros);   //[-- , -c, b- , bc]

        ArrayList<String> mres = new ArrayList<>();
        for(String rsts: rres)
        {
            mres.add("" + rsts);
        }
        for(String rsts: rres)
        {
            mres.add(ch + rsts);
        }
        return mres;
    }

}