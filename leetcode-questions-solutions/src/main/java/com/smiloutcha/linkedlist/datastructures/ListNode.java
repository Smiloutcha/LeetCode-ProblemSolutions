package com.smiloutcha.linkedlist.datastructures;

public class ListNode {

    // this class will contain public fields.
    // WARNING : never make your fields used in your current class only as public.
    // this is used only for test purpose.
    public int val;
    public ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}