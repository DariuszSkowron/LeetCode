public class RemoveDuplicatesfromSortedList83 {

    public static void main(String[] args) {


//        [2,4,3]
//[5,6,4]
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        l1.val = 0;
        l2.val = 5;
        l1.next = new ListNode(0, new ListNode(0));
        l2.next = new ListNode(6, new ListNode(4));

        System.out.println(deleteDuplicates(l1).toString());
//        l2 = new ListNode(3);
//        System.out.println(l2.toString());   System.out.println(deleteDuplicates(l1).toString());
    }



    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }


    public static ListNode deleteDuplicates(ListNode head) {

        int lastValue = -101;
        ListNode l3 = null;
        ListNode last = null;

        while (head != null) {
            if (head.val != lastValue) {
                lastValue = head.val;
                if (l3 == null) {
                    l3 = new ListNode(lastValue);
                    last = l3;
                } else {
                    last.next = new ListNode(lastValue);
                    last = last.next;
                }

            }
            head = head.next;
        }


        return l3;
    }
}
