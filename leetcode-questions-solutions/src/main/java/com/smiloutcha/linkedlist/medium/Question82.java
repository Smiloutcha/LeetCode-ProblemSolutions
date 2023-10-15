package com.smiloutcha.linkedlist.medium;

import com.smiloutcha.linkedlist.datastructures.ListNode;

import java.util.HashMap;
import java.util.Map;

public class Question82 {

    public ListNode deleteDuplicates(ListNode head) {
        Map<Integer,Integer> elementsWithOccurs = computeElementsWithOccurence(head);
        ListNode temp = head ;
        while (temp != null && temp.next != null) {
            if (elementsWithOccurs.get(temp.next.val) > 1 ) {
                temp.next = temp.next.next  ;
            } else {
                temp = temp.next ;
            }

        }
        if( head != null && elementsWithOccurs.get(head.val) > 1 ) {
            head = head.next ;
        }
        return head;
    }

    private Map<Integer,Integer> computeElementsWithOccurence(ListNode head) {
        ListNode temp = head ;
        Map<Integer,Integer> map = new HashMap<>();
        while (temp != null) {
            map.put(temp.val,map.getOrDefault(temp.val,0)+1);
            temp = temp.next ;
        }
        return map ;
    }
}
