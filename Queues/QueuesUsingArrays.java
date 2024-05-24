package Queues;

public class QueuesUsingArrays {


    int arr[];
    int size;
    
    int rear;
    
    QueuesUsingArrays(int n) {
        arr = new int[n];
        size = n;
        rear = -1;
    }

    public boolean isEmpty() {
        return rear == -1;
    }
    
    // insertion - O(1)
    public void add(int item) {
        if (rear == size - 1) {
            System.out.println("Queue is full enqueue not possible ");
            return;
        }

        rear = rear + 1;
        arr[rear] = item;

    }
    

    // deletion - O(n)
    public int remove() {
        if (isEmpty()) {
            System.out.println("deletion not possible empty queue ");
            return -1;
        }

        int front = arr[0];
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear = rear - 1;
        return front;
    }
    
    // peek - O(1)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Empty queue");
            return -1;
        }
        
        return arr[0];
    }
    

    public static void main(String[] args) {
        QueuesUsingArrays q = new QueuesUsingArrays(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
