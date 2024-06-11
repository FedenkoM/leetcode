package org.leetcode.problems.easy.removeDuplicatesFromList;

import org.junit.jupiter.api.Test;
import org.leetcode.problems.common.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesSolutionTest {

    @Test
    void testDeleteDuplicates() {
        RemoveDuplicatesSolution removeDuplicatesSolution = new RemoveDuplicatesSolution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(5);

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(3);
        expected.next.next.next = new ListNode(5);

        ListNode actualResult = removeDuplicatesSolution.deleteDuplicates(head);
        assertEquals(expected.val, actualResult.val);
        assertEquals(expected.next.val, actualResult.next.val);
        assertEquals(expected.next.next.val, actualResult.next.next.val);
        assertEquals(expected.next.next.next.val, actualResult.next.next.next.val);
        assertNull(actualResult.next.next.next.next);
    }
}