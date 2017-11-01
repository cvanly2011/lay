package com.lay.study.algorithm.leetcode;

/**
 * @Author yalei.chen
 * @Date 2017/10/13
 * @Since JDK 1.8
 */
public class No61 {

    public ListNode rotateRight(ListNode head, int k) {

        if(head == null){
            return head;
        }

        ListNode node = head;
        while (k > 0){
            node = node.next;
            k--;
        }

        if(null == node){
            throw new RuntimeException("k is too large");
        }

        ListNode last = head;
        while (last.next != null){
            last = last.next;
        }

        node.next = null;
        last.next = node;

        return head;
    }
}
