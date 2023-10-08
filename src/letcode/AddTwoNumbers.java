package letcode;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l3 = new ListNode(3);
        ListNode l2 = new ListNode(4, l3);
        ListNode head1 = new ListNode(2, l2);

        ListNode m3 = new ListNode(4);
        ListNode m2 = new ListNode(6, m3);
        ListNode head2 = new ListNode(5, m2);

        System.out.println(addTwoNumbers(head1, head2));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        int count = 0;

        while (l1.next != null || l2.next != null) {
            if (l1.next != null && l2.next != null) {
                listNode.next = new ListNode((l1.val+l2.val)%10+count);
                count = (l1.val + l2.val) / 10;
                l1 = l1.next;
                l2 = l2.next;
            }
        }
        return listNode;
    }
}
