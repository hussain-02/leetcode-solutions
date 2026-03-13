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
    public ListNode middleNode(ListNode head) {
        // ListNode slow = head;
        // ListNode fast = head;
        
        // while(fast != null && fast.next != null){
        //     slow = slow.next;
        //     fast = fast.next.next;
        // }

        // return slow;

        ListNode temp = head;
        int l =0;
        while(temp != null){
            temp = temp.next;
            l++;
        }

        if(l % 2 == 0){
            l = (l /2) ;
        }else{
            l = l /2;
        }

        for(int i = 0 ; i < l ;i++){
            head = head.next;
        }
        return head;

    }
}