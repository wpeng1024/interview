package com.wp.pre.interview.algorithm.leetcode.solution2;

/**
 *   6->7->8
 *   3->3->2
 *
 *   9->0->1->1
 */
public class AddTwoNumbersSolution {

    public static ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode start = new ListNode(0);

        ListNode temp = start;

        int extra = 0;
        while(l1!=null || l2!=null || extra!=0){
            int x = l1==null?0:l1.val;
            int y = l2==null?0:l2.val;

            int sum = x + y + extra;
            extra = sum/10;

            temp.next = new ListNode(sum%10);
            if(l1!=null){
                l1 = l1.next;
            }
            if(l2!=null){
                l2 = l2.next;
            }
            temp = temp.next;
        }

        return start;
    }

    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    public static void main(String[] args){
        ListNode l1 = new ListNode(6);
        l1.next = new ListNode(7);
        l1.next.next = new ListNode(8);

        ListNode l2 = new ListNode(3);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(2);

        ListNode add = addTwoNumbers(l1,l2);
        add = add.next;
        while (add!=null){
            System.out.print(add.val+" ");
            add = add.next;
        }
    }
}
