package com.lay.study.algorithm.leetcode;

/**
 * 合并两个有序链表
 * @author yalei.chen
 * @date 2018/4/26
 * @since JDK 1.8
 */
public class No21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(-1);

        ListNode cur = result;

        while (l1 != null && l2 != null){

            if(l1.val < l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        cur.next = (l1 == null)? l2 : l1;

        return result.next;

    }
}
