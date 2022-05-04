// 1. Expression is balanced
// 2. The only operators used are +, -, *, /
// 3. Opening and closing brackets - () - are used to impact precedence of operations
// 4. + and - have equal precedence which is less than * and /. * and / also have equal precedence.
// 5. In two operators of equal precedence give preference to the one on left.
// 6. All operands are single digit numbers.

// Sample Input

// a*(b-c+d)/e

// Sample Output
// abc-d+*e/
// /*a+-bcde

import java.io.*;
import java.util.*;

public class ic {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        // code

        Stack<String> pre = new Stack<>();
        Stack<String> post = new Stack<>();
        Stack<Character> ops = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(') {
                ops.push(ch);
            } else if ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                post.push(ch + "");
                pre.push(ch + "");
            } else if (ch == ')') {
                while (ops.peek() != '(') {
                    process(ops, post, pre);
                }
                ops.pop(); // popping (
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (ops.size() > 0 && ops.peek() != '(' && precedence(ch) <= precedence(ops.peek())) {
                    process(ops, post, pre);
                }
                ops.push(ch); // pushing current ch
            }
        }

        while (ops.size() > 0) {
            process(ops, post, pre);
        }

        System.out.println(post.pop());
        System.out.println(pre.pop());
    }

    public static void process(Stack<Character> ops , Stack<String> post , Stack<String> pre){
            char op = ops.pop();

            String postv2 = post.pop();
            String postv1 = post.pop();
            String postv = postv1 + postv2 + op;
            post.push(postv);

            String pre2 = pre.pop();
            String pre1 = pre.pop();
            String prev = op+ pre1 + pre2;
            pre.push(prev);
    }

    public static int precedence(char op) {
        if (op == '+' || op == '-') {
            return 1;
        } else if (op == '*' || op == '/') {
            return 2;
        } else {
            return 0;
        }

    }
}