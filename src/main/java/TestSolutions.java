import addTwoNumbers_medium.ListNode;
import addTwoNumbers_medium.Solution;

/**
 * @author AZZhalilov
 * @since 16.10.2022
 */
public class TestSolutions {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(4, l1);
        ListNode l3 = new ListNode(2, l2);

        ListNode r1 = new ListNode(4);
        ListNode r2 = new ListNode(6, r1);
        ListNode r3 = new ListNode(5, r2);

        ListNode res = Solution.addTwoNumbers(l3, r3);
        String stringResult = Solution.printListNodesList(res, new StringBuilder());
        System.out.println(stringResult);
    }
}
