package com.smiloutcha.linkedlist.easy;

import com.smiloutcha.linkedlist.datastructures.ListNode;

import java.util.List;

public class Question234 {

    public boolean isPalindrome(ListNode head) {
       ListNode copy = copyHead(head);
       ListNode reversedHead = reverseHead(head);
       return isEqualsListNodes(copy,reversedHead);
    }

    private boolean isEqualsListNodes(ListNode first , ListNode second) {
        while (first != null && second != null) {
            if (first.val != second.val) {
                return false ;
            }
            first = first.next ;
            second = second.next ;
        }
        return true ;
    }

    private ListNode reverseHead(ListNode head) {
        ListNode previousNode = null ;
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


    private ListNode copyHead(ListNode list) {
        if (list == null) {
            return null;
        }
        ListNode res = new ListNode(list.val);
        ListNode resTmp = res;
        ListNode listTmp = list;

        while (listTmp.next != null){
            listTmp = listTmp.next;
            resTmp.next = new ListNode(listTmp.val);
            resTmp = resTmp.next;
        }

        return res;
    }

}
