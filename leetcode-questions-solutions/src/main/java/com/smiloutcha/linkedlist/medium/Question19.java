package com.smiloutcha.linkedlist.medium;

import com.smiloutcha.linkedlist.datastructures.ListNode;

public class Question19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode reversedhead = reverse(head);
        ListNode temp  = reversedhead ;
        int index = 1 ;
        if (n == 1 && temp.next == null) {
            return null;
        } else if (n == 1) {
            return reverse(reversedhead.next);
        }
        while (temp != null && temp.next != null) {
            if(index + 1 == n) {
                temp.next = temp.next.next ;
                break ;
            }
            index ++ ;
            temp = temp.next ;
        }
        return reverse(reversedhead);


    }

    private ListNode reverse(ListNode head) {
        ListNode previousNode = null;
        ListNode currentNode = head ;
        ListNode nextNode = head ;
        while (nextNode != null) {
            nextNode = nextNode.next ;
            currentNode.next = previousNode ;
            previousNode = currentNode ;
            currentNode = nextNode ;
        }
        return previousNode ;
    }
}
