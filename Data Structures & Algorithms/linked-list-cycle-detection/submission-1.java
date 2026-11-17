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
    public boolean hasCycle(ListNode head) {
        // If list is empty, return null
        if (head == null) {
            return false;
        }

        // Create two pointers
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            // slow pointer moves by one step
            slow = slow.next;
            // fast pointer moves by two steps
            fast = fast.next.next;
            // If the list cycles, eventually fast will 'lap' slow and point to same node
            if (slow.equals(fast)) {
                return true;
            }
        }

        // If we exit the while loop, then tail points to null
        return false;
    }
}
