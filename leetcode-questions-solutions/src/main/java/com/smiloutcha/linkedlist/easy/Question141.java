package com.smiloutcha.linkedlist.easy;

import com.smiloutcha.linkedlist.datastructures.ListNode;

public class Question141 {

    public boolean hasCycle(ListNode head) {
        ListNode slow = head ;
        ListNode fast = head ;
        while (fast != null && fast.next != null) {
            slow = slow.next ;
            fast = fast.next.next ;
            if (fast == slow) {
                return true ;
            }
        }
        return false ;

    }
}
