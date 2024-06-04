package org.leetcode.problems.easy.twoSortedList;

import org.junit.jupiter.api.Test;
import org.leetcode.problems.common.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class TwoSortedListSolutionTest {

    @Test
    void testMergeTwoLists() {
        TwoSortedListSolution twoSortedListSolution = new TwoSortedListSolution();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode actualListNode = twoSortedListSolution.mergeTwoLists(l1, l2);
        assertEquals(l1.val, actualListNode.val);
        assertEquals(l2.val, actualListNode.next.val);
    }

    @Test
    void testMergeTwoLists2() {
        TwoSortedListSolution twoSortedListSolution = new TwoSortedListSolution();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        l1.next = new ListNode(4);
        l2.next = new ListNode(3);
        ListNode actualListNode = twoSortedListSolution.mergeTwoLists(l1, l2);
        assertEquals(l1.val, actualListNode.val);
        assertEquals(l2.val, actualListNode.next.val);
        assertEquals(l2.next.val, actualListNode.next.next.val);
        assertEquals(l1.next.val, actualListNode.next.next.next.val);
    }
}