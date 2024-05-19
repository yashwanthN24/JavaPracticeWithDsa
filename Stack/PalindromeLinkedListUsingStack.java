package Stack;

import java.util.Stack;
public class PalindromeLinkedListUsingStack {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean ispalindrome(Node head) {
        Stack<Integer> st = new Stack<>();

        Node slow = head;
        while (slow != null) {
            st.push(slow.data);
            slow = slow.next;
        }

        while (head != null) {
            if (head.data != st.pop()) {
                return false;
            }
            head = head.next;
        }
        return true;
    }
    
    public static void display(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " --> ");
            cur = cur.next;
        }
        System.out.println("Null ");
    }
    
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(3);
        Node n5 = new Node(2);
        Node n6 = new Node(1);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        display(head);
        System.out.println(ispalindrome(head));

    }
}
