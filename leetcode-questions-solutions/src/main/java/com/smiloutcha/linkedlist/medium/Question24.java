package com.smiloutcha.linkedlist.medium;

import com.smiloutcha.linkedlist.datastructures.ListNode;

import java.util.List;

public class Question24 {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        ListNode reuslt =  swapPairs_first_solution(listNode);
        while (reuslt != null) {
            System.out.println(reuslt.val);
            reuslt = reuslt.next ;
        }
    }



    public static ListNode swapPairs_first_solution(ListNode head) {
        int index = 0 ;
        ListNode result = new ListNode(0,head);
        ListNode temp = result ;
        ListNode previousNode = null;
        ListNode currentNode = head ;
        ListNode nextNode = head ;
        while (nextNode != null) {
            nextNode = nextNode.next ;
            if (index % 2 == 1) {
                currentNode.next = previousNode ;
                previousNode.next = nextNode ;
                temp.next = currentNode ;
                temp = previousNode ;
            } else {
                previousNode = currentNode ;
            }
            currentNode = nextNode ;
            index ++ ;
        }
        return result.next ;
    }


    public ListNode swapPairs_second_solution(ListNode head) {
        ListNode result = new ListNode(0,head) ;
        ListNode previousNode = result ;
        ListNode currentNode = head;
        while (currentNode != null && currentNode.next != null) {
            ListNode nextPairs = currentNode.next.next ;
            ListNode second = currentNode.next ;
            second.next = currentNode ;
            currentNode.next = nextPairs;
            previousNode.next = second ;
            previousNode = currentNode ;
            currentNode = nextPairs ;
        }
        return result.next ;
    }
}
