import java.util.*;
import java.io .*;
public class print_KPC {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        pRintKPC(str , "");
        
    }
    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx","yz"};                  
    public static void pRintKPC(String ques , String ans)
    {
        if(ques.length() == 0)
        {
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        String roq = ques.substring(1);

        String codeforch = codes[ch - '0'];
        for(int i = 0 ; i<codeforch.length(); i++)
        {
            char cho = codeforch.charAt(i);
            pRintKPC(roq, ans + cho);
        }
    }
}
