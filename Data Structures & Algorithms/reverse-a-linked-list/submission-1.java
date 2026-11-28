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
    public ListNode reverseList(ListNode head) {

        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            // Create variable next and store current.next
            ListNode next = current.next;
            
            // Set current.next to prev (reverse the order)
            current.next = prev;
            
            // Set prev to point to current node which will be the new previous
            prev = current;
            
            // Then move pointer to next node using the stored next node
            current = next;
        }

        // Return prev as current will be null after we exit the while loop
        return prev;
    }
}
