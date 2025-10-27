class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(0);
        ListNode current = head;
        int carriedNumber = 0;
        while(l1 != null || l2 != null || carriedNumber != 0) {
            int x;
            int y;
            if(l1 == null) x = 0;
            else x = l1.val;
            if(l2 == null) y = 0;
            else y = l2.val;
            
            int sum = carriedNumber + x + y;
            carriedNumber = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2 = l2.next;
        }
        return head.next;
    }
}