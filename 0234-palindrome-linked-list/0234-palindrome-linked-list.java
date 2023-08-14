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
    public boolean isPalindrome(ListNode head) {
        if(head==null) return false;
        if(head.next == null) return true;
        if(head == head.next && head.next.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode prev = slow;
        ListNode curr = slow.next;
        prev.next = null;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        fast = head;
        while(prev!=null){
            if(fast.val != prev.val){
                return false;
            }
            fast = fast.next;
            prev = prev.next;
        }
        return true;
      
    }
}