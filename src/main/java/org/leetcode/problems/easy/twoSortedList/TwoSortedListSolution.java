package org.leetcode.problems.easy.twoSortedList;


import org.leetcode.problems.common.ListNode;

class TwoSortedListSolution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0); // Dummy node to simplify edge cases
        ListNode current = dummy;

        // Traverse both lists and merge them
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // If there are remaining nodes in either list, append them
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next; // Return the merged list, skipping the dummy node
    }
}
