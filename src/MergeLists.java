import java.util.Arrays;
import java.util.List;

/**
 * Definition for singly-linked list.

 */

public class MergeLists {

    public static class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }

    public static ListNode mergeTwoLists(ListNode a, ListNode b) {
        ListNode head;
        if (a.val < b.val) {
            head = a;
            a = a.next;
        } else {
            head = b;
            b = b.next;
        }

        ListNode tail = head;
        while (a != null && b != null) {
            if (a.val < b.val) {
                tail.next = a;
                tail = a;
                a = a.next;
            } else {
                tail.next = b;
                tail = b;
                b = b.next;
            }
        }

        if (a == null) {
            tail.next = b;
        } else {
            tail.next = a;
        }

        return head;
    }

    // Dima showing recursion to me
    public static long factorial(int n) {
        if (n < 3) {
            return n;
        }
        return n * factorial(n - 1);
    }

    // Dima's recursive implementation - another way
    public static ListNode mergeTwoLists(ListNode a, ListNode b, ListNode tail) {
        ListNode currentElement;
        if (a == null && b == null) {
            return tail;
        } else if (b == null || a.val < b.val) {
            currentElement = a;
            a = a.next;
        } else {
            currentElement = b;
            b = b.next;
        }

        if (tail == null) {
            tail = currentElement;
        } else {
            tail.next = currentElement;
        }
        mergeTwoLists(a, b, currentElement);

        return tail;
    }

    public static ListNode create(int... items) {
        ListNode head = null;
        ListNode tail = null;

        for (int i = 0; i < items.length; i++) {
            ListNode element = new ListNode(items[i]);
            if (i == 0) {
                head = element;
            } else {
                tail.next = element;

            }
            tail = element;
        }
        return head;
    }

    public static void main(String[] args) {

        System.out.print(factorial(5));

        ListNode res = mergeTwoLists(create(1, 3, 5), create(2, 6, 8));

        List expectedResult = Arrays.asList(1, 2, 3, 5, 6, 8);

        for (int i = 0; i < expectedResult.size(); i++) {
            //assertEquals(res.val, expectedResult.get(i));
            res = res.next;
        }

    }
}
