package com.smiloutcha.linkedlist.easy;

import com.smiloutcha.linkedlist.datastructures.ListNode;

public class Question1290 {

    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder() ;
        while (head != null) {
            sb.append(head.val);
            head = head.next;
        }
        return Integer.parseInt(sb.toString(),2);

    }
}
