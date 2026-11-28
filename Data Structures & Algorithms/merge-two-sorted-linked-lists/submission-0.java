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

        if (list1 == null && list2 == null) {
            return null;
        }

        ListNode head = null;
        ListNode current1 = list1;
        ListNode current2 = list2;

        if (current1 == null) {
            head = current2;
            current2 = current2.next;
        } else if (current2 == null) {
            head = current1;
            current1 = current1.next;
        } else {
            if (current1.val <= current2.val) {
                head = current1;
                current1 = current1.next;
            } else {
                head = current2;
                current2 = current2.next;
            }
        }

        ListNode current = head;

        while (current1 != null || current2 != null) {

            if (current1 == null) {
                current.next = current2;
                current2 = current2.next;
            } else if (current2 == null) {
                current.next = current1;
                current1 = current1.next;
            } else {
                if (current1.val <= current2.val) {
                    current.next = current1;
                    current1 = current1.next;
                } else {
                    current.next = current2;
                    current2 = current2.next;
                }
            }
            
            current = current.next;
        }

        return head;
    }
}