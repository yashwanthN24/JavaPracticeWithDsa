package Stack;

public class StackUsingLinkedList {
    private class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    Node head;

    public boolean isEmpty() {
        return head == null;
    }
    
    public void push(int item) {
        // insertfront is push 

        Node newNode = new Node(item);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }

        int val = head.data;
        head = head.next;
        return val;
    }
    
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        
        return head.data;
    }
    

    public static void main(String[] args) {
        StackUsingLinkedList st = new StackUsingLinkedList();
        st.push(1);
        st.push(2);
        st.push(3);

        while (!st.isEmpty()) {
            if(st.head.next != null )
                System.out.println(st.peek());
            else
                System.out.print(st.peek());
            st.pop();
        }
    }
}
