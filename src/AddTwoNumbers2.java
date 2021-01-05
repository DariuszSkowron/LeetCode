import java.util.List;

public class AddTwoNumbers2 {

    public static void main(String[] args) {


//        [2,4,3]
//[5,6,4]
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        l1.val = 2;
        l2.val = 5;
        l1.next = new ListNode(4, new ListNode(3));
        l2.next = new ListNode(6, new ListNode(4));

        System.out.println(l2.toString());
//        l2 = new ListNode(3);
//        System.out.println(l2.toString());

        System.out.println(addTwoNumbers(l1,l2).toString());
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


        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            int carryBit = 0;
            int sum;
            ListNode l3 = null;
            ListNode last = null;

            while (l1 != null || l2 != null) {
                sum = 0;

                if (l1 != null) {
                    sum += l1.val;
                    l1 = l1.next;
                }

                if (l2 != null) {
                    sum += l2.val;
                    l2 = l2.next;
                }

                sum += carryBit;
                carryBit = 0;


                if (sum >= 10) {
                    sum %= 10;
                    carryBit = 1;
                }

                if (l3 == null) {
                    l3 = new ListNode(sum);
                    last = l3;
                } else {
                    last.next = new ListNode(sum);
                    last = last.next;
                }
            }

            if (carryBit == 1){
                last.next = new ListNode(1);
            }

            return l3;

        }
    }

