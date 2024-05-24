package Queues;

public class QueueUsingLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    Node head;
    Node Tail; 

    public boolean isEmpty() {
        return head == null && Tail == null;
    }
    
    // insertion - O(1)
    public void add(int item) {
        // insertion happens at rear end so its insertrear of linkedlist 
        Node newNode = new Node(item);
        if (isEmpty()) {
            head = Tail = newNode;
            return;
        }
        Tail.next = newNode;
        Tail = newNode;
    }


    // deletion - O(1)
    public int remove() {
        // deletefront 

        if (isEmpty()) {
            System.out.println("List empty ");
            return -1;
        }
        if (head == Tail) {
            int value = head.data;
            head = Tail = null;
            return value;
        }
        int value = head.data;
        head = head.next;
        return value;
    }

    // peek - O(1)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        
        return head.data;
    }
    public static void main(String[] args) {
        QueueUsingLinkedList q = new QueueUsingLinkedList();
        q.add(1);
        q.add(2);
        q.add(3);
        // q.remove();
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
