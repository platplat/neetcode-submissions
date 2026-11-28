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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Create dummyNode as dummy head of merged list
        ListNode dummyNode = new ListNode(-1);
        ListNode current = dummyNode;

        ListNode current1 = list1;
        ListNode current2 = list2;

        while (current1 != null && current2 != null) {

            // Set current.next to the list pointer that stores the lower value and advance list pointer
            if (current1.val <= current2.val) {
                current.next = current1;
                current1 = current1.next;
            } else {
                current.next = current2;
                current2 = current2.next;
            }
            // Then advance our current pointer
            current = current.next;
        }

        /* While loop exits when we get to the end of one of the lists
           so we set current.next to head of the non-null head
         */
        current.next = (current1 == null) ? current2 : current1;

        // Return dummyNode.next to return head of merged list
        return dummyNode.next;
    }
}