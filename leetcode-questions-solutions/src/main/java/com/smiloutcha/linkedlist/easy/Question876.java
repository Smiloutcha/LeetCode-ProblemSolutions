package com.smiloutcha.linkedlist.easy;

import com.smiloutcha.linkedlist.datastructures.ListNode;

public class Question876 {

    public static void main(String[] args) {

    }

    public ListNode middleNode(ListNode head) {
        int middleIndex = findMiddleIndex(head);
        int index = 0 ;
        while (head != null) {
            if (index == middleIndex) {
                return head ;
            } else {
                head = head.next ;
                index++;
            }
        }
        return null;
    }

    private int findMiddleIndex(ListNode head) {
        ListNode temp = head;
        int middleIndex = 0 ;
        while (temp != null) {
            temp = temp.next;
            middleIndex ++ ;
        }
        return  middleIndex / 2 ;

    }

}
