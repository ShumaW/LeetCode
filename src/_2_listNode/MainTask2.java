package _2_listNode;

import java.util.LinkedList;

public class MainTask2 {
    /*
    2. Add Two Numbers
    You are given two non-empty linked lists representing two non-negative integers.
    The digits are stored in reverse order, and each of their nodes contains a single
    digit. Add the two numbers and return the sum as a linked list.
    You may assume the two numbers do not contain any leading zero, except the number 0 itself.
    Example 1:
    Input: l1 = [2,4,3], l2 = [5,6,4]
    Output: [7,0,8]
    Explanation: 342 + 465 = 807.
    Example 2:
    Input: l1 = [0], l2 = [0]
    Output: [0]
    Example 3:
    Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
    Output: [8,9,9,9,0,0,0,1]
     */
    public static void main(String[] args) {
        LinkedList l1 =new LinkedList<>();
        l1.add(2);
        l1.add(4);
        l1.add(3);

        System.out.println(l1);




        LinkedList l2 =new LinkedList<>();
        l2.add(5);
        l2.add(6);
        l2.add(4);

        System.out.println(l2);

    }

    public ListNode addTwoNumbers(LinkedList l1, LinkedList l2) {


        return null;
    }


}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        return "_2_listNode.ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
