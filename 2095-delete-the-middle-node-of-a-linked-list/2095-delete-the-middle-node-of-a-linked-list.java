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
    public ListNode deleteMiddle(ListNode head) {
    ListNode ptr=head;
    ListNode ptr2=head.next;
    if(ptr==null)return null;
    if(ptr.next==null){head=null;return head;}
	
	//when ptr2 reach end ptr reaches mid;
	
    while(ptr2.next!=null&&ptr2.next.next!=null){
        ptr=ptr.next;
        ptr2=ptr2.next.next;
    }
    ptr.next=ptr.next.next;
    return head;
    }
}