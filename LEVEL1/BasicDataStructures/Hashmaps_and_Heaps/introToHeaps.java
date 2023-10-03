import java.util.*;
import java.io.*;

public class introToHeaps {
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // this will make pq to have larger value as higher priority.

        // This is also known as heap sort
        int [] ranks = {10,2,3,56,67,78,98,103};

        for(int val : ranks){
            pq.add(val);
        }

        while(pq.size() > 0){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
