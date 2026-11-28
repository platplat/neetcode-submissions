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

        // First we get the length of the list
        int length = 0;
        ListNode current = head;
        while (current != null) {
            current = current.next;
            length++;
        }

        // If length == n, then we just need to remove the first node and return head
        if (length == n) {
            head = head.next;
            return head;
        }

        // The index of the node we want to remove is length - n
        int indexToRemove = length - n;

        // We iterate through the list until we get to the node before the one we want to remove
        current = head;
        for (int i = 0; i < indexToRemove - 1; i++) {
            current = current.next;
        }

        // Then we set current.next to current.next.next bypassing the node we want removed
        current.next = current.next.next;
        
        return head;

    }
}
