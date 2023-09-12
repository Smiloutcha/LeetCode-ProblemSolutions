package com.smiloutcha.linkedlist.easy;

import java.util.Arrays;

public class Question705 {

    class MyHashSet {

        int[] arr ;
        int capacity ;
        int size ;

        public MyHashSet() {
            capacity = 10 ;
            arr = new int[capacity];
            Arrays.fill(arr,-1);
        }

        public void add(int key) {
            if(alreadyExists(key)) {
                return ;
            } else {
                resizeArrayIfToBeResized();
                addElement(key);
            }
        }

        private boolean alreadyExists(int key) {
            for (int i = 0 ; i < size ;  i++) {
                if (arr[i] == key) {
                    return true ;
                }
            }
            return false ;
        }

        private void addElement(int key) {
            arr[size++] = key ;
        }

        private void resizeArrayIfToBeResized() {
            if(needResize()) {
                resizeArray();
            }
        }

        private boolean needResize() {
            return size + 1 >= capacity ;
        }

        private void resizeArray() {
            capacity *= 2 ;
            int[] temp = new int[capacity];
            for (int i = 0 ; i < size ; i ++) {
                temp[i] = arr[i];
            }
            arr = temp ;
        }


        public void remove(int key) {
            for (int i = 0 ; i < size ; i ++) {
                if (key == arr[i]) {
                    removeAt(i);
                }
            }
        }

        private void removeAt(int index ) {
            int[] temp = new int[size-1];
            for (int i = 0 , j = 0 ; i < size ; i ++ , j ++) {
                if(index == i) {
                    j -- ;
                } else {
                    temp[j] = arr[i];
                }
            }
            arr = temp;
            capacity = --size ;
        }

        public boolean contains(int key) {
            return alreadyExists(key);
        }
    }
}
