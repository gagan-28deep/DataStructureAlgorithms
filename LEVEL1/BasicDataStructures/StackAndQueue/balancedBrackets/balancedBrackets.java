// e.g.
// [(a + b) + {(c + d) * (e / f)}] -> true
// [(a + b) + {(c + d) * (e / f)]} -> false
// [(a + b) + {(c + d) * (e / f)} -> false
// ([(a + b) + {(c + d) * (e / f)}] -> false

// Constraints
// 0 <= str.length <= 100

// Format
// Input
// A string str

// Output
// true or false

// Example
// Sample Input

// [(a + b) + {(c + d) * (e / f)}]

// Sample Output
// true



// import java.util.*;
// import java.io.*;

// public class balancedBrackets {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         String str = scn.nextLine();

//         Stack<Character> st = new Stack<>();
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if (ch == '(' || ch == '{' || ch == '[') {
//                 st.push(ch);
//             } else if (ch == ')') {
//                 boolean val = handleClosing(st, '(');
//                 if (val == false) {
//                     System.out.println(val);
//                     return;
//                 }
//             } else if (ch == '}') {
//                 boolean val = handleClosing(st, '{');
//                 if (val == false) {
//                     System.out.println(val);
//                     return;
//                 }
//             } else if (ch == ']') {
//                 boolean val = handleClosing(st, '[');
//                 if (val == false) {
//                     System.out.println(val);
//                     return;
//                 }
//             }
//         }

//         if (st.size() == 0) {
//             System.out.println(true);
//         } else {
//             System.out.println(false);
//         }
//     }

//     public static boolean handleClosing(Stack<Character> st, char corresoch) {
//         if (st.size() == 0) {
//             return false;
//         } else if (st.peek() != corresoch) {
//             return false;
//         } else {
//             st.pop();
//             return true;
//         }
//     }
// }


// Alter Approach
import java.util.*;
import java.io.*;
public class balancedBrackets{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i <str.length() ; i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else{
                if(st.size() == 0){
                    System.out.println(false);
                }
                if(ch == '}' && st.peek() != '{'){
                    System.out.println(false);
                }
                else if(ch == ')' && st.peek() != '('){
                    System.out.println(false);
                }
                else if(ch == ']' && st.peek() != '['){
                    System.out.println(false);
                }
                else{
                    st.pop();
                }
            }
        }
        if(st.size() == 0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}

