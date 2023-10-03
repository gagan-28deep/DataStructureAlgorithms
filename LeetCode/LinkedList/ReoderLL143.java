/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    //     Mid 
        public ListNode middleNode(ListNode head) {
            if(head == null){
                return null;
            }
            ListNode slow = head;
            ListNode fast = head;
            while(fast.next != null && fast.next.next !=null){
                slow = slow.next;
                fast = fast.next.next;
            }
            
            return slow;
        }
        
        
    //  Reverse
        
         public ListNode reverseList(ListNode head) {
            if(head == null){
                return null;
            }
            else{
                ListNode prev = null;
                ListNode curr = head;
                
                while(curr != null){
    //                 Link Reverse
                    ListNode forw = curr.next;
                    curr.next = prev;
                    
    //                 Update
                    prev = curr;
                    curr = forw;
                    
                }
                return prev;
            }
        }
        public void reorderList(ListNode head) {
            if(head == null || head.next == null){
                return;
            }
    //         Step 1 
            ListNode mid = middleNode(head);
            ListNode nh = mid.next;
            mid.next = null;
            
    //         Step 2 
            
            nh = reverseList(nh);
            
    //         Step 3 
            ListNode c1 = head;
            ListNode c2 = nh;
            
            while(c1!=null && c2!=null){
                ListNode s1 = c1.next;
                ListNode s2 = c2.next;
                c1.next = c2;
                c2.next = s1;
                c1 = s1;
                c2 = s2;
                
            }
            
        }
    }