package org.leetcode.problems.easy.removeDuplicatesFromList;

import org.leetcode.problems.common.ListNode;

public class RemoveDuplicatesSolution {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = head;
        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }

        return dummy;
    }

}
