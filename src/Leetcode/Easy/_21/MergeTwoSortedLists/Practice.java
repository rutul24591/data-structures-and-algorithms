package Leetcode.Easy._21.MergeTwoSortedLists;

import common.ListNode;

public class Practice {
    public ListNode MergeLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode node = head;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val) {
                node.next = list1;
                list1 = list1.next;
            }else{
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;
        }
        node.next = list1 == null ? list2 : list1;
        return head.next;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,4};
        int[] nums2 = {1,3,4};
        ListNode node1 = ListNode.constructLinkedList(nums1);
        ListNode node2 = ListNode.constructLinkedList(nums2);
        ListNode result = new Practice().MergeLists(node1, node2);
        System.out.println("Result: " + ListNode.toString(result));
    }
}
