package Queues;

public class CircularQueuesUsingArrays {

    int arr[];
    int size;
    int front;
    int rear;
    
    CircularQueuesUsingArrays(int n) {
        arr = new int[n];
        size = n;
        front = -1;
        rear = -1;
    }
    
    public boolean isEmpty() {
        return rear == -1 && front == -1;
    }
    
    public boolean isFull() {
        return (rear + 1) % size == front;
    }
    
    // insertion - O(1)
    public void add(int item) {
        if (isFull()) {
            System.out.println("Queue is full ");
            return;
        }

        // adding 1st element 
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % size;
        arr[rear] = item;
    }

    // deletion - O(1)
    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue empty !! ");
            return -1;
        }

        int res = arr[front];

        // last element delete case 
        if (rear == front) {
            rear = front = -1;
        } else {
            front = (front + 1) % size;
        }
        return res;
    }
    
    // peek O(1)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Empty queue ");
            return -1;
        }
        return arr[front];
    }

    public static void main(String[] args) {
        CircularQueuesUsingArrays q = new CircularQueuesUsingArrays(3);
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
