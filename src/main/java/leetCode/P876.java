package leetCode;

import leetCode.model.ListNode;

public class P876 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        ListNode result = middleNode(listNode);
    }

    public static ListNode middleNode(ListNode head) {
        int index = 0;

        ListNode alist = head;
        while(alist != null){
            index++;
            alist = alist.next;
        }

        int mid = index/2+1;
        alist = head;
        for(int i=1; i < mid; i++){
            alist = alist.next;
        }

        return alist;
    }
}
