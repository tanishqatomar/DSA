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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head;
        ListNode q = head;
        for(int i = 1; i <= n; i++){
            p = p.next;
        }
        if(p == null){
            return head.next;
        }
        while(p.next != null){
            p = p.next;
            q = q.next;
        }
        q.next = q.next.next;
        return head;
    }
}