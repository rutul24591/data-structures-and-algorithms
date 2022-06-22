package Leetcode.Medium.AddTwoNumbers;
/*

    You are given two non-empty linked lists representing two non-negative integers.
    The digits are stored in reverse order, and each of their nodes contains a single digit.
    Add the two numbers and return the sum as a linked list.

    You may assume the two numbers do not contain any leading zero, except the number 0 itself.



    Example 1:

        Input: l1 = [2,4,3], l2 = [5,6,4]
        Output: [7,0,8]
        Explanation: 342 + 465 = 807.

    Example 2:

        Input: l1 = [0], l2 = [0]
        Output: [0]

    Example 3:

        Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        Output: [8,9,9,9,0,0,0,1]

    Constraints:

        The number of nodes in each linked list is in the range [1, 100].
        0 <= Node.val <= 9
        It is guaranteed that the list represents a number that does not have leading zeros.

    NOTES:
    Carry could be 0 or 1, as sum of 2 `single digit` numbers cannot exceed `9 + 9` = 18 without carry and  `9 + 9 + 1` = 19 including carry.
    9 is the highest single digit number.
    Take care of carry for last addition of nodes for l1 n l2, because a carry could be set if sum is > 10.

    For Eg
            [2,4,7]
            [5,6,4]

            Output should be
            [7,0,2,1]
            and not
            [7,0,2]

    Submission results on leetcode:

    Runtime: 2 ms, faster than 99.02% of Java online submissions for Add Two Numbers.
    Memory Usage: 42.6 MB, less than 82.37% of Java online submissions for Add Two Numbers.

*/

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode current = result;
        int carry = 0;

        while(l1 != null || l2 != null || carry > 0){
            int sum = 0;
            if(l1 != null){
                sum = sum + l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum = sum + l2.val;
                l2 = l2.next;
            }
            sum = sum + carry;
            carry = sum / 10;   //0
            ListNode node = new ListNode(sum % 10);
            current.next = node;
            current = current.next;

        }

        return result.next;
    }
}


