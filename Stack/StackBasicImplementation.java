package Stack;


public class StackBasicImplementation {

    public int top;
    int stack[];
    int length; 
    int size;
    StackBasicImplementation(int N) {
        top = -1;
        stack = new int[N];
        length = stack.length;
        size = 0;
    }
    
    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int item) {
        size++;
        if (top == stack.length - 1) {
            // array doubling 
            int newstack[] = new int[stack.length * 2];

            for (int i = top; i >= 0; i--) {
                newstack[i] = stack[i];

            }
            stack = newstack;
            length = stack.length;
            top++;
            stack[top] = item;
            return;
        }

        top++;
        stack[top] = item;
    }
    
    public int pop() {
        size--;
        if (top == -1) {
            System.out.println("Stack is empty , Stack underflow occurs");
            return -1;
        }

        int val = stack[top];
        top--;
        return val;
    }
    
    public int peek() {
        return stack[top];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = top; i >= 0; i--){
            sb.append(stack[i]);
            if(!(i == 0))
                sb.append(" , ");
        }
        sb.append(" ]");
        return sb.toString();
    }
    


    public static void main(String[] args) {
        StackBasicImplementation st = new StackBasicImplementation(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);
        System.out.println(st.length);
        st.push(19);
        System.out.println(st);
        System.out.println(st.length);
        System.out.println(st.pop());
        System.out.println(st.length);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st);
        st.push(111);
        System.out.println(st.size);
        System.out.println(st);
        System.out.println(st.length);
        
    }
}
