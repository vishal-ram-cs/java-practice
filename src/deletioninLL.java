public class deletioninLL {
   static class ListNode {
            int val;
            ListNode next;

            ListNode(int x) {
                val = x;
            }
        }

        static class Solution {
            public void deleteNode(ListNode node) {
                node.val = node.next.val;
                node.next = node.next.next;



            }
        }

        public static void main(String[] args) {

            // Create Linked List: 4 -> 5 -> 1 -> 9
            ListNode head = new ListNode(4);
            head.next = new ListNode(5);
            head.next.next = new ListNode(1);
            head.next.next.next = new ListNode(9);

            // Print before deletion
            System.out.print("Before deletion: ");
            printList(head);

            // Delete node 5 (you only get reference to node 5)
            Solution sol = new Solution();
            sol.deleteNode(head.next);  // head.next is node with value 5

            // Print after deletion
            System.out.print("After deletion:  ");
            printList(head);
        }

        // Helper function to print the list
        public static void printList(ListNode node) {
            while (node != null) {
                System.out.print(node.val + " ");
                node = node.next;
            }
            System.out.println();
        }
    }


