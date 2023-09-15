package com.smiloutcha.linkedlist.medium;

import com.smiloutcha.linkedlist.datastructures.ListNode;

public class Question2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode tempResult = result ;
        int carry  = 0 ;
        while (l1 != null || l2 != null) {
            int sum = carry ;
            if (l1 != null) {
                sum+= l1.val ;
                l1 = l1.next ;
            }
            if (l2 != null) {
                sum += l2.val ;
                l2 = l2.next ;
            }
            if (sum < 10) {
                tempResult.next = new ListNode(sum);
                carry = 0 ;
            } else {
                tempResult.next = new ListNode(sum%10);
                carry = 1 ;
            }
            tempResult = tempResult.next ;
        }
        if (carry == 1) {
            tempResult.next = new ListNode(1);
        }
        return result.next ;
    }
}
