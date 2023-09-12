package com.smiloutcha.linkedlist.easy;

import java.util.Arrays;

public class Question706 {


    class MyHashMap {

        private int[] arr ;
        private int capacity ;
        private int size ;

        public MyHashMap() {
            arr = new int[1000001];
            Arrays.fill(arr, -1);
        }

        public void put(int key, int value) {
            arr[key] = value ;
        }

        public int get(int key) {
            return arr[key] ;
        }

        public void remove(int key) {
            arr[key] = -1 ;
        }
    }

}
