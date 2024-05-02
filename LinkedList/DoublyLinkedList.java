package LinkedList;

public class DoublyLinkedList {

    private class Node {
        private int data;
        private Node prev;
        private Node next;

        private Node(int value) {
            this.data = value;
            this.next = null;
            this.prev = null;
        }

        

    }
    
    public static Node head; 
    public static Node Tail;
    public static int length;

    // add 
    
    // addfirst
    public void addFirst(int value) {
        Node newNode = new Node(value);
        length++;
        if (head == null) {
            head = Tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;

        head = newNode;
    }
    
    public void addLast(int value) {
        Node newNode = new Node(value);
        length++;
        if (head == null) {
            head = Tail = newNode;
            return;
        }

        Tail.next = newNode;
        newNode.prev = Tail;
        Tail = newNode;
    }

    
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // remove 
    // removeFirst
    public int removeFirst() {
        length--;
        if (head == null) {
            head = null;
            return Integer.MIN_VALUE;
        }
        if (head.next == null) {
            int val = head.data;
            head = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        return val;
    }
    
    // removeLast 
    public int removeLast() {
        if (head != null) {
            length--;
        }
        if (head == null) {
            head = null;
            return Integer.MIN_VALUE;
        }
        if (head.next == null) {
            int val = head.data;
            head = null;
            return val;
        }

        Node temp = head;
        Node prev = null;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        int val = temp.data;
        prev.next = null;
        Tail = prev;
        temp = null;
        return val;

    }

    public void reverse() {
        Node prev = null;
        Node cur = head;
        Node next;
        
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            cur.prev = next;
            prev = cur;
            cur = next;
        }
        Tail = head;
        head = prev; 
    }
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.addFirst(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addFirst(4);
        dll.print();
        // System.out.println(dll);

        // System.out.println(length);

        // System.out.println(dll.removeFirst());        
        // dll.print();
        // System.out.println(dll.removeFirst());
        // dll.print();        
        // System.out.println(dll.removeFirst());
        // dll.print();      
        // System.out.println(dll.removeFirst());        
        // dll.print();
        // System.out.println(dll.removeLast());
        // System.out.println(dll.removeLast());
        // System.out.println(dll.removeLast());
        // System.out.println(dll.removeLast());
        // System.out.println(dll.removeLast());
        dll.reverse();
        dll.print();

        System.out.println(length);
        // System.out.println(head.data);
        // System.out.println(Tail.data);
    }
}
