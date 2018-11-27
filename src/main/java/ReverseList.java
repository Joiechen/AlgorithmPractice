
class ListNode
{
    int val;
    ListNode next;

    public ListNode(int x){
        val=x;
    }

}

public class ReverseList {

    //原地反转法
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy.next;
        ListNode pCur = prev.next;
        while (pCur != null) {
            prev.next = pCur.next;
            pCur.next = dummy.next;
            dummy.next = pCur;
            pCur = prev.next;
        }
        return dummy.next;

    }

    // 2.新建链表,头节点插入法
     public ListNode reverseList2(ListNode head) {
                 ListNode dummy = new ListNode(-1);
                 ListNode pCur = head;
                 while (pCur != null) {
                         ListNode pNex = pCur.next;
                         pCur.next = dummy.next;
                         dummy.next = pCur;
                         pCur = pNex;
                     }
                 return dummy.next;
             }
}
