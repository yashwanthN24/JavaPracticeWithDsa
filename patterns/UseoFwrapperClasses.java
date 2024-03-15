package patterns;

public class UseoFwrapperClasses {

    public static void main(String[] args) {
        Integer x = 10; // Create an Integer object with value 10
        Integer y = x; // Assign a reference to the same object

        // Attempting to modify the value of x
        x = 20; // This doesn't modify the original object, but creates a new Integer object with value 20

        System.out.println("x: " + x); // Output: 20
        System.out.println("y: " + y); // Output: 10 (y still refers to the original Integer object with value 10)
    }
    }
    
