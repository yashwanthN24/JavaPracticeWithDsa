package LinkedList;

public class LinkedList {
    private class Node {

        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;
            this.next = null;
        }

        public String toString() {
            return "[" + this.data + "]" ;
        }

    }

    /*
     * When an inner class constructor is marked as private, instances of that inner
     * class cannot be directly created from outside the outer class, as this would
     * violate the access control rules.
     * 
     * However, within the outer class, the private constructor of the inner class
     * is still accessible. This allows the outer class to control the creation of
     * instances of the inner class, ensuring that instances are only created within
     * the appropriate context.
     *
     */

    // outer class can access all private members of inner class even if the inner
    // class constructor is private

    /*
     * Yes, it might seem like an exception, but it's actually a feature of Java's
     * inner classes.
     * 
     * When an inner class constructor is marked as private, instances of that inner
     * class cannot be directly created from outside the outer class, as this would
     * violate the access control rules.
     * 
     * 
     */

    /*
     * within the LinkedList class, private members data and next of the Node class
     * are accessed directly. This is allowed because the access to private members
     * of inner classes is permitted from within the outer class.
     * 
     * However, outside of the LinkedList class(outer class), attempts to access the
     * private
     * members of the Node class directly would result in compilation errors, as the
     * access would be restricted by the private access modifier.
     * 
     * 
     */
    private Node head;

    private Node Tail;

    private int length; // java intiliazes to 0 bydefault

    public LinkedList() {
        System.out.println("LinkedList created with head and tail as " + head + " " + Tail + " with length :" + length);
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        Tail = newNode;
        length++;
    }

    public int getLength() {
        return length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node curNode = head;
        while (curNode != null) {
            sb.append("[").append(curNode.data).append("]").append(" --> ");
            curNode = curNode.next;
        }
        sb.append(" NULL ");
        return sb.toString();
    }

    public void addFirst(int value) {

        // Create a new Node
        Node newNode = new Node(value);
        length++; // increment the length each time u create a new node to insert

        // if LinkedList is empty then make the head and tail point to this newNode
        if (head == null) {
            head = Tail = newNode;
            return;
        }

        // Make the newNode's next point to head
        newNode.next = head;

        // make newNode as the head
        head = newNode;

        // Take O(1) constant time complexity
    }

    public void addLast(int value) {

        // create a new Node
        Node newNode = new Node(value);
        length++;
        // if LinkedList is empty then make the head and tail point to this newNode
        if (head == null) {
            head = Tail = newNode;

            return;
        }
        // make the tail.next point to newNode
        Tail.next = newNode;

        // make tail as the newNode
        Tail = newNode;

        // Takes O(1) constant time
    }

    public void add(int idx, int data) {

        if (idx == 0) {
            addFirst(data);
            return;
        }

        if (idx == length) {
            addLast(data);
            return;
        }

        if (idx > length) {
            System.out.println("Index greater than the length of list invalid index ");
            return;
        }

        // create a node to add
        Node newNode = new Node(data);
        length++;

        // temp pointer to head
        Node temp = head;
        // index iterator to iterate through the indexes of linkedlist
        int i = 0;

        // to place a node at ith index we go till i-1 index to find its prev node i,e
        // temp in this case
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // newNode.next = prev.next
        newNode.next = temp.next;
        // prev.next = newNode
        temp.next = newNode;

    }

    public int removeFirst() {
        if (length == 0) {
            System.out.println("LL is empty nothing to delete ");
            return Integer.MIN_VALUE; // invalid value
        }

        if (length == 1) {
            int val = head.data;
            head = Tail = null;
            length--;
            return val;
        }

        int val = head.data;
        head = head.next;
        length--;
        return val;
    }

    public int removeLast() {
        if (length == 0) {
            System.out.println("LinkedList empty ntg to delete");
            return Integer.MIN_VALUE;
        }

        if (length == 1) {
            int value = head.data;
            head = Tail = null;
            length--;
            return value;
        }

        Node prev = head;
        for (int i = 0; i < length - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        Tail = prev;
        length--;
        return val;

        // or

        // Node temp = head;
        // Node prev = null;
        // while (temp.next != null) {
        // prev = temp;
        // temp = temp.next;
        // }
        // int val = temp.data;
        // prev.next = null;
        // length--;
        // Tail = prev;
        // return val;

    }

    public int iterSearch(int key) {
        // TC : O(n)
        // SC : O(1)
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key)
                return i;
            temp = temp.next;
            i++;
        }

        // when not found return -1
        return -1;
    }

    public int recurSearch(Node head, int i, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return i;
        }
        return recurSearch(head.next, i + 1, key);
    }

    public int helper(Node head, int key) {
        if (head == null)
            return -1;

        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx == -1)
            return -1;
        
        // after the return from call add 1 to index to find the distance from the key node 
        return idx + 1;
        
    }

    public int recuSearch(int key) {
        // Space Complexity : O(n)
        // time complexity : O(n) as we traverse the whole list
        return helper(head, key);
    }

    public void reverseList() {
        // Time complexity O(n) as we traverse entire list to reverse it
        
        // 3 variables
        Node prev = null;
        Node cur = head;
        Node next;


        // 4 steps inside while loop
        while (cur != null) {
            next = cur.next;
            cur.next = prev; // reversing step
            prev = cur;
            cur = next;
        }
        Tail = head; // making tail as head 
        head = prev; // head is the end node now i.e prev 
    }


    public void deleteNthNodeFromEnd(int N) {
        // find the size 
        int size = 0 ; 
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        // Actually use length as it track the size of the the linkedlist 
        // the variable size is local is shown only to show how to calculate size of linkedlist using iteration
        // replace size with length 
        

        // this is the case that has to be handled when n == size of list then its deletefirst steps 

        if (N == size) {
            head = head.next; // removeFirst
            length--;
            return; 
        }
        

        // Nth node from end is (size - N +1)th node from Head (start)
        int i = 1; // tracks the node number 
        Node prev = head; 
        // so to find the prev node iterate till i < size - N this will find the prev node 

        while (i < size - N) {
            prev = prev.next;
            i++;
        }
        // now i == size-N meaning the prev node 
        //  the prev node is found change its next to point to next to next node 
        // As the next node (remember size - N + 1 th node ) itself is the node to be deleted 

        prev.next = prev.next.next;
        length--;
    }
    
    
    public Node findMiddleNode() {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }
    

    public boolean checkPalindrome() {
        // corner cases when empty linkedlist or single element in linkedlist 
        if (head == null || head.next == null) {
            return true;
        }
        // step 1 : find midnode of linkedlist  using slow and fast pointer approach
        Node minNode = findMiddleNode(); // findMiddleNode is helper function here
        // step 2 : reverse the 2ndhalf starting from midnode 3 variable 4 statments code 
        Node prev = null;
        Node cur = minNode;
        Node next;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        // make the reverse2nd half head as the last node 
        Node reverseHead = prev;

        // step 3 : compare 1st half and the 2nd half using left and right pointers
        Node left = head;
        Node right = reverseHead;
        while (right != null) {
            if (left.data != right.data)
                return false;
            left = left.next;
            right = right.next;
        }
        return true;
    }
    

    public boolean hasCycle() {
        // Floyds Cycle finding algorithm 
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // slow increments by 1 
            fast = fast.next.next; // fast increments by 2
            if (slow == fast) // cycle exists
                return true;
        }
        return false; // no cycle exists
    }
    

    public void removeCycle() {

        // for head linked cycles case
        if (Tail.next == head) {
            Tail.next = null;
            return;
        }

        // or

        // Node temp = head;
        // while (temp.next != head) {
        //     temp = temp.next;
        // }
        // temp.next = null;

        // check is cycle exist 
        Node slow = head;
        Node fast = head;
        boolean hascycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                hascycle = true;
                break;
            }
        }

        if (!hascycle) {
            return;
        }

        // find meeting point 
        // intialize slow to head  and prev = null 
        slow = head;
        Node prev = null;
        // when the slow and fast meet again the fast previous node is our last node 
        while (slow != fast) {
            slow = slow.next;
            prev = fast;
            fast = fast.next;
            // increment slow by 1 , prev = fast and fast by 1 node  and  until both slow and fast point to the same node 

        }

        // remove cycle 
        // make prevnode next to null to remove the cycle / loop 

        prev.next = null;
    }

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    
    private Node merge(Node left , Node right){

        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(left != null && right != null){
            if(left.data < right.data){
                temp.next = left ;
                left = left.next;
                temp = temp.next;
            }else{
                temp.next = right;
                right = right.next;
                temp = temp.next;
            }
        }

        while(left != null){
            temp.next = left ; 
            left = left.next;
            temp = temp.next;
        }

        while(right != null){
            temp.next = right; 
            right = right.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public Node mergesort(Node head) {
        
        if (head == null || head.next == null) {
            return head; 
        }

        // find mid 
        Node mid = getMid(head);

        // left and right half mergesort 
        Node rightHead = mid.next;
        mid.next = null;
        
        Node newLeft = mergesort(head);
        Node newRight = mergesort(rightHead);

        // merge 
        return merge(newLeft, newRight);

        // O(nlogn)
    }
    
    


    public void print() {
        Node temp = head;
        if (temp == null) {
            System.out.println("LinkedList is empty ");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        System.out.println(ll);
        ll.addFirst(1);
        System.out.println(ll);
        ll.addFirst(2);
        System.out.println(ll);
        ll.addLast(3);
        System.out.println(ll);
        ll.addLast(4);
        System.out.println(ll);
        ll.print();
        ll.add(0, 12);
        ll.print();
        ll.add(5, 10);
        ll.print();
        System.out.println(ll.length);
        ll.add(6, 300);

        ll.print();

        // System.out.println(ll.length);
        // for (int i = 1; i <= 8; i++) {
        // ll.removeFirst();
        // ll.print();
        // System.out.println(ll.length);
        // }

        System.out.println(ll.length);
        System.out.println(ll.removeLast());
        ll.print();
        System.out.println(ll.length);

        System.out.println(ll.iterSearch(15));
        System.out.println(ll.recurSearch(ll.head, 0, 10));

        System.out.println(ll.recuSearch(10));

        System.out.println(ll.length);
        ll.reverseList();

        ll.print();
        
        System.out.println(ll.head.data + " " + ll.Tail.data);
        
        ll.deleteNthNodeFromEnd(3);
        System.out.println(ll.length);
        ll.print();

        ll.deleteNthNodeFromEnd(5);
        System.out.println(ll.length);
        ll.print();

        System.out.println(ll.findMiddleNode());
        System.out.println(ll.checkPalindrome());

        LinkedList ll2 = new LinkedList();
        ll2.addLast(1);
        ll2.addLast(2);
        ll2.addLast(2);
        ll2.addLast(1);
        System.out.println(ll2.checkPalindrome());

        System.out.println(ll.hasCycle());

        LinkedList ll3 = new LinkedList(1);
        ll3.addLast(1);
        ll3.addLast(2);
        ll3.head.next.next.next = ll3.head;
        
        System.out.println(" yash");
        System.out.println(ll3.head + "  " +  ll3.Tail + ll3.Tail.next);
        System.out.println(ll3.hasCycle());
        ll3.removeCycle();
        System.out.println(ll3.hasCycle());


        System.out.println("--------------");

        LinkedList ll4 = new LinkedList();
        ll4.addFirst(1);
        ll4.addFirst(2);
        ll4.addFirst(3);
        ll4.addFirst(4);
        ll4.addFirst(5);
        System.out.println(ll4);
        ll4.head = ll4.mergesort(ll4.head);
        System.out.println(ll4);
    }
}

// this class is show how to use the LinkedList class
class Test {
    public static void main(String[] args) {
        // create node
        LinkedList ll2 = new LinkedList(122);
        System.out.println(ll2);
        ll2.addFirst(12);
        ll2.addLast(10);
        System.out.println(ll2.getLength());
        ll2.print();
        
    }
}
