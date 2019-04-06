package Leetcode.Linkedlist;

import DataStructure.ListNode;

public class Test_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(-1);
        ListNode before=head;
        while (l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                before.next=l1;
                l1=l1.next;
            }
            else {
                before.next=l2;
                l2=l2.next;
            }
            before=before.next;
        }
        while (l1!=null){
            before.next=l1;
            l1=l1.next;
            before=before.next;
        }
        while (l2!=null){
            before.next=l2;
            l2=l2.next;
            before=before.next;
        }
        return head.next;
    }
}
