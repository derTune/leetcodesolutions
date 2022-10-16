package addTwoNumbers_medium;

/**
 * @author AZZhalilov
 * @since 16.10.2022
 */
public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = l1.val + l2.val;
        int remain = sum % 10;
        if (l1.next != null) {
            if (sum >= 10) l1.next.val++;
            if (l2.next != null) {
                return new ListNode(remain, addTwoNumbers(l1.next, l2.next));
            } else {
                return new ListNode(remain, addTwoNumbers(l1.next, new ListNode(0)));
            }
        } else {
            if (l2.next != null) {
                if (sum >= 10) {
                    l2.next.val++;
                    return new ListNode(remain, addTwoNumbers(new ListNode(0), l2.next));
                }
                return new ListNode(remain, addTwoNumbers(new ListNode(0), l2.next));
            } else {
                if (sum >= 10) {
                    return new ListNode(remain, new ListNode(1));
                } else {
                    return new ListNode(remain);
                }
            }
        }
    }

    public static String printListNodesList(ListNode node, StringBuilder print) {
        if (node.next != null) {
            print.append(node.val).append(",").append(node.next.val);
            return printListNodesList(node.next, print);
        }
        return print.toString();
    }
}
