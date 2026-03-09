package com.sidhu.solutions;

/*
    Solution for https://leetcode.com/problems/add-two-numbers/description/
*/

public class AddListNodeTwoNumber implements Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode temp = result;
        int sum;
        int n = 0;
        while (l1 != null && l2 != null) {
            temp.next = new ListNode();
            temp = temp.next;
            sum = l1.val + l2.val + n;
            temp.val = sum % 10;
            n = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
        }
        l1 = l1 == null ? l2 : l1;
        while (l1 != null) {
            temp.next = new ListNode();
            temp = temp.next;
            sum = l1.val + n;
            temp.val = sum % 10;
            n = sum / 10;
            l1 = l1.next;
        }
        if (n == 1) {
            temp.next = new ListNode();
            temp = temp.next;
            temp.val = n;
        }
        return result.next;
    }

    public ListNode listNodeFromNumber(int n) {
        ListNode result = new ListNode();
        ListNode temp = result;
        if (n == 0) {
            temp.next = new ListNode();
            temp = temp.next;
            temp.val = 0;
            System.out.print(temp.val + ".");
        }
        while (n > 0) {
            temp.next = new ListNode();
            temp = temp.next;
            temp.val = n % 10;
            n = n / 10;
            System.out.print(temp.val + ".");
        }
        System.out.print("\n");
        return result.next;
    }
    
}


 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    boolean isEqual(ListNode other) {
        ListNode thisTemp = this;
        ListNode otherTemp = other;
        while (thisTemp != null && otherTemp!= null) {
            if (thisTemp.val != otherTemp.val) {
                return false;
            }
            thisTemp = thisTemp.next;
            otherTemp = otherTemp.next;
        }
        return true;
    }
}

