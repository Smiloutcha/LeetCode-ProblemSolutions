package com.smiloutcha.linkedlist.medium;

import com.smiloutcha.linkedlist.datastructures.ListNode;

import java.util.ArrayList;
import java.util.Arrays;

public class Question1019 {

    public int[] nextLargerNodes(ListNode head) {
        var temp = head ;
        var result = new ArrayList<Integer>();
        while (temp != null) {
            int element = temp.val ;
            ListNode newTemp = temp ;
            while (newTemp != null) {
                if (newTemp.val > element) {
                    result.add(newTemp.val);
                    break ;
                }
                if (newTemp.next == null) {
                    result.add(0);
                }
                newTemp = newTemp.next ;
            }
            temp = temp.next ;
        }
        int[] res = new int[result.size()];
        int index = 0 ;
        for (int element : result) {
            res[index++] = element ;
        }
        return res ;

    }

}
