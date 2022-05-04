// 1. You are given a postfix expression.
// 2. You are required to evaluate it and print it's value.
// 3. You are required to convert it to infix and print it.
// 4. You are required to convert it to prefix and print it.

// Note -> Use brackets in infix expression for indicating precedence. Check sample input output for more details.

//Sample Input

//-+2/*6483

// Sample Output
// 2
// ((2+((6*4)/8))-3)
// 264*8/+3-

import java.io.*;
import java.util.*;

public class pec{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code

    Stack<Integer> vs = new Stack<>();
    Stack<String> infixStack = new Stack<>();
    Stack<String> postStack = new Stack<>();

    for(int i = exp.length() - 1 ; i>=0 ;  i--){
        char ch = exp.charAt(i);

        if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
            int v1 = vs.pop();
            int v2 = vs.pop();
            int val = operations(v1 , v2 , ch);
            vs.push(val);


            String iv1 = infixStack.pop();
            String iv2 = infixStack.pop();
            String ival = "(" + iv1 + ch + iv2 + ")";
            infixStack.push(ival);
            
            String pv1 = postStack.pop();
            String pv2 = postStack.pop();
            String pval = pv1 + pv2 + ch;
            postStack.push(pval);
        }
        else{
            vs.push(ch - '0');
            infixStack.push(ch + "");
            postStack.push(ch + "");
        }
    }

    System.out.println(vs.pop());
    System.out.println(infixStack.pop());
    System.out.println(postStack.pop());

 }

 public static int operations(int v1 , int v2 , char ch){
     if(ch == '+'){
         return v1 + v2;
     }
     else if(ch == '-'){
        return v1 - v2;
     }
     else if(ch == '*'){
        return v1 * v2;
     }
     else{
        return v1 / v2;
     }
 }
}