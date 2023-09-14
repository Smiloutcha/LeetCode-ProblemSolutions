package com.smiloutcha.linkedlist.easy;

import com.smiloutcha.linkedlist.datastructures.ListNode;

public class Question160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode a = headA;
        ListNode b = headB;
        while(a!=b) {
            a = a==null ? headB : a.next;
            b = b==null ? headA : b.next;
        }
        return a;


    }
}
