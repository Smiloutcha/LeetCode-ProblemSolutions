package com.smiloutcha.linkedlist.medium;

import com.smiloutcha.linkedlist.datastructures.ListNode;

public class Question237 {

    public void deleteNode(ListNode node) {
        ListNode temp = node ;
        while (temp != null && temp.next != null) {
            temp.val = temp.next.val ;
            if (temp.next.next == null) {
                temp.next = temp.next.next ;
            }
            temp = temp.next ;
        }
    }
}
