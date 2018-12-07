import java.util.HashMap;

public class HasCycle {

    public boolean hasCycle(ListNode head) {
        if(head == null||head.next==null){
            return false;
        }
        ListNode temp1 = head;
        HashMap<ListNode,ListNode> ns = new HashMap<ListNode,ListNode>();
        while(head!=null){
            if(ns.get(temp1)!=null)
                return true;
            else ns.put(temp1, temp1);
            temp1 = temp1.next;
            if(temp1 == null)
                return false;
        }
        return true;
    }

}
