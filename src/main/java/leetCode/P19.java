package leetCode;

import leetCode.model.ListNode;

public class P19 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        ListNode result = removeNthFromEnd(listNode, 2);

        ListNode listNode2 = new ListNode(1);
        ListNode result2 = removeNthFromEnd(listNode2, 1);

        ListNode listNode3 = new ListNode(1);
        listNode3.next = new ListNode(2);
        ListNode result3 = removeNthFromEnd(listNode3, 1);
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int index = 0;
        ListNode alist = head;

        while(alist != null){
            alist = alist.next;
            index++;
        }

        if(index == 1 && n == 1){
            ListNode newNode = new ListNode();
            newNode = null;
            return newNode;
        }

        ListNode temp = head;

        if(index == n){
            temp = temp.next;
            return temp;
        }

        // [1,2] n = 2  | [2]
        // [1,2,3] n=3  | [2,3]
        // [1,2,3,4] n=4| [2,3,4]

        for(int i=1; i < index-n; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;

        return head;
    }
}
