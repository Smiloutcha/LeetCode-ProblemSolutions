package com.smiloutcha.linkedlist.medium;

import com.smiloutcha.linkedlist.datastructures.ListNode;

import java.rmi.dgc.Lease;
import java.util.List;

public class Question92 {



    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode toBeReversedList = fetchToBeReversedList(head,left,right);
        ListNode reversedList = reverse(toBeReversedList);
        return fillResult(head,left,right,reversedList);
    }

    private ListNode fillResult(ListNode head, int left,int right, ListNode reversedList) {
        ListNode temp = head ;
        ListNode result = new ListNode(0);
        ListNode resultTemp = result ;
        int index = 1 ;
        while (temp != null) {
            if (index >= left && index <= right) {
                resultTemp.next = new ListNode(reversedList.val);
                reversedList = reversedList.next ;
            } else {
                resultTemp.next =  new ListNode(temp.val);
            }
            temp = temp.next ;
            resultTemp = resultTemp.next ;
            index ++ ;
        }
        return result.next ;
    }

    private ListNode reverse(ListNode head) {
        ListNode previousNode = null;
        ListNode currentNode = head ;
        ListNode nextNode = head;
        while (nextNode != null) {
            nextNode = nextNode.next ;
            currentNode.next = previousNode;
            previousNode = currentNode ;
            currentNode = nextNode ;
        }
        return  previousNode;
    }

    private ListNode fetchToBeReversedList(ListNode head, int left, int right) {
        ListNode toBeReversedList = new ListNode(0);
        ListNode toBeReversedTemp = toBeReversedList ;
        ListNode temp = head;
        int index = 1 ;
        while (temp != null) {
            if (index >= left && index <= right) {
                toBeReversedTemp.next = new ListNode(temp.val);
                toBeReversedTemp = toBeReversedTemp.next ;
            }
            if(index > right) {
                break;
            }
            temp = temp.next ;
            index ++ ;
        }
        return toBeReversedList.next ;
    }


}

