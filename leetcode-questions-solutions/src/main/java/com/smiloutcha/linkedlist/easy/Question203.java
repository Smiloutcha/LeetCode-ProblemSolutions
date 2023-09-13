package com.smiloutcha.linkedlist.easy;

import com.smiloutcha.linkedlist.datastructures.ListNode;

public class Question203 {

    public ListNode removeElement(ListNode head , int val) {
        if(head == null) {
            return  null;
        }
        ListNode res = new ListNode(head.val);
        ListNode resTemp = res ;
        ListNode temp = head ;
        while (temp.next != null) {
            if (temp.next.val != val) {
                temp = temp.next ;
                resTemp.next = new ListNode(temp.val) ;
                resTemp = resTemp.next ;
            } else {
                temp = temp.next ;
            }
        }
        if(res.val == val) {
            res = res.next ;
        }
        return res ;
    }


}
