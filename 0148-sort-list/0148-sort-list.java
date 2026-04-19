/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeSort(ListNode list1, ListNode list2 ){
        ListNode dummyNode = new ListNode(0);
        ListNode temp = dummyNode;
        while(list1 != null && list2 != null){
            if(list1.val > list2.val){
                temp.next = list2;
                temp=temp.next;
                list2=list2.next;
            }
            else{
                 temp.next = list1;
                temp=temp.next;
                list1=list1.next;
            }

        }
         if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }
        return dummyNode.next;
    }
    public ListNode findMiddle(ListNode head){
        ListNode temp= head;
        ListNode slow = head;
        ListNode fast=head.next;
        while(fast != null && fast.next != null){
            fast= fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public ListNode sortList(ListNode head) {
        if(head == null || head.next== null){
            return head;
        }
        ListNode Middle = findMiddle(head);
        ListNode right = Middle.next;
        Middle.next=null;
        ListNode left = head;
        left = sortList(left);
        right = sortList(right);
        return mergeSort(left,right);

    }
}