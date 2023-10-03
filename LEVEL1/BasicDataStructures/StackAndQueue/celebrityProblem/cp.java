// 4. A celebrity is defined as somebody who knows no other person than himself but everybody else knows him.

// Sample Input

// 4
// 0000
// 1011
// 1101
// 1110

// Sample Output
// 0

import java.io.*;
import java.util.*;

public class cp {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);
    }

    // public static void findCelebrity(int[][] arr) {
    // if a celebrity is there print it''s index (not position), if there is not
    // then print "none"
    // Stack < Integer > st = new Stack < > ();
    // for (int i = 0; i < arr.length; i++) {
    // st.push(i);
    // }

    // while (st.size() > 1) {
    // int i = st.pop();
    // int j = st.pop();

    // if (arr[i][j] == 1) {
    // st.push(j);
    // } else {
    // st.push(i);
    // }
    // }

    // int pot = st.pop();
    // boolean flag = true;
    // for (int i = 0; i < arr.length; i++) {
    // if (i != pot) {
    // if (arr[i][pot] == 0 || arr[pot][i] == 1) {
    // flag = false;
    // break;
    // }
    // }
    // }

    // if (flag) {
    // System.out.println(pot);
    // } else {
    // System.out.println("none");
    // }
    // }

    public static void findCelebrity(int[][] arr) {
        // if a celebrity is there print it''s index (not position), if there is not
        // then print "none"
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            st.push(i);
        }
        while (st.size() >=2) {
            int i = st.pop();
            int j = st.pop();

            if (arr[i][j] == 1) {
                // If i knows j -> i is not celebrity -> j is pushed back
                st.push(j);
            } else {
                // if i does'nt know j -> j is not celebrity -> i is pushed back
                st.push(i);
            }
        }

        int potCeleb = st.pop();
        for(int i = 0 ; i<arr.length ; i++){
            if(i != potCeleb){
                if(arr[i][potCeleb] ==0 || arr[potCeleb][i] == 1){
                    System.out.println("none");
                    return;
                }
            }
        }

        System.out.println(potCeleb);

    }

}