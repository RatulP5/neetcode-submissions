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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode cur1=list1, cur2=list2;
        ListNode dum=new ListNode(0), cur=dum;

        while(cur1!=null && cur2!=null){
            if(cur1.val<=cur2.val){
                cur.next=cur1;
                cur1=cur1.next;
            }
            else{
                cur.next=cur2;
                cur2=cur2.next;
            }
            cur=cur.next;
        }
        cur.next=cur1==null ? cur2 : cur1;
        return dum.next;
    }
}