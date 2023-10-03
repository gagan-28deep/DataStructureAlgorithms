// e.g.'
// ((a + b) + (c + d)) -> false
// (a + b) + ((c + d)) -> true
// Input Format
// A string str
// Output Format
// true or false



import java.util.*;
import java.io.*;

public class duplicateBracket {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i <str.length() ; i++){
            char ch = str.charAt(i);
            if(ch == ')'){
                if(st.peek() == '('){
                    System.out.println(true);
                    return;
                }
                else{
                    while(st.peek() != '('){
                        st.pop();
                    }
                    st.pop();
                }
            }
            else{
                st.push(ch);
            }
            
        }   
        System.out.println(false); 
    }
}
