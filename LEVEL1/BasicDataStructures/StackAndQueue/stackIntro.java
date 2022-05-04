import java.util.*;
import java.io.*;

public class stackIntro{
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();

        st.push(10);
        System.out.println(st + " -> " + st.peek() + " // " + st.size());
        st.push(20);
        System.out.println(st + " -> " + st.peek() + " // " + st.size());
        st.push(40);
        st.push(60);
        System.out.println(st + " -> " + st.peek() + " // " + st.size());
        st.pop();
        System.out.println(st + " -> " + st.peek() + " // " + st.size());
        st.pop();
        System.out.println(st + " -> " + st.peek() + " // " + st.size());
    }
}