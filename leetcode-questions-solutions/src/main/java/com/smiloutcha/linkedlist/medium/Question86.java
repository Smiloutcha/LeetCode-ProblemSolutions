package com.smiloutcha.linkedlist.medium;

import com.smiloutcha.linkedlist.datastructures.ListNode;

public class Question86 {

    public ListNode partition(ListNode head, int x) {
        ListNode result = new ListNode(-1);
        ListNode resultTemp = result ;
        ListNode temp = head ;
        ListNode tempHead = head ;
        while (temp != null) {
            if (temp.val < x ) {
                resultTemp.next = new ListNode(temp.val);
                resultTemp = resultTemp.next ;
            }
            temp = temp.next ;
        }
        while (tempHead != null) {
            if (tempHead.val >= x) {
                resultTemp.next = new ListNode(tempHead.val);
                resultTemp = resultTemp.next ;
            }
            tempHead = tempHead.next ;
        }
        return result.next ;

    }
}
