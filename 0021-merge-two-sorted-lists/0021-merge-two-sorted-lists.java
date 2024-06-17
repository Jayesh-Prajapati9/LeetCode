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
 import java.util.*;
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       Vector<Integer> v=new Vector<>();
       ListNode a=list1;
       ListNode b=list2;
       while(a!=null){
        v.add(a.val);
        a=a.next;
       }
       while(b!=null){
        v.add(b.val);
        b=b.next;
       }
       Collections.sort(v);
       ListNode t=new ListNode(0);
       ListNode temp=t;
       for(int i=0;i<v.size();i++){
        t.next=new ListNode(v.get(i));
        t=t.next;
       }
       temp=temp.next;
        return temp;
    }
}