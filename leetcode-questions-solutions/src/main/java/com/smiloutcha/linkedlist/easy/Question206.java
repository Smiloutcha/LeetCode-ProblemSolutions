package com.smiloutcha.linkedlist.easy;

import com.smiloutcha.linkedlist.datastructures.ListNode;

public class Question206 {

    public static ListNode reverseList(ListNode head) {
       ListNode previousNode = null;
       ListNode currentNode = head ;
       ListNode nextNode = head ;
       while (nextNode != null) {
           nextNode = nextNode.next ;
           currentNode.next = previousNode;
           previousNode = currentNode;
           currentNode = nextNode ;
       }
       return  previousNode;


    }
}
