public class FunctionOverloading {

    // Method that accepts a single int parameter
    public void display(int num) {
        System.out.println("Primitive int: " + num);
    }

    // Method that accepts a single Integer parameter
    public void display(Integer num) {
        System.out.println("Wrapper Integer: " + num);
    }

    // Method that accepts two int parameters
    public void display(int num1, int num2) {
        System.out.println("Two primitive ints: " + num1 + " and " + num2);
    }

    public static void main(String[] args) {
            FunctionOverloading example = new FunctionOverloading();
    
            int primitiveInt1 = 10;
            int primitiveInt2 = 20;
            Integer wrapperInteger = 29; // Explicitly creating an Integer object
    
            // Calling the method with a single int parameter
            example.display(primitiveInt1);  // Calls display(int num)
    
            // Calling the method with a single Integer parameter
            example.display(wrapperInteger);  // Calls display(Integer num)
    
            // Calling the method with two int parameters
            example.display(primitiveInt1, primitiveInt2);  // Calls display(int num1, int num2)
    
            // Calling the method with a new Integer object
            
            // example.display(new Integer(20));  // Calls display(Integer num)

            // use of new Integer() constructor is decrepted because of modern autoboxing and unboxing 

            // Autoboxing: Automatically converting a primitive type to its corresponding wrapper class. For example, converting an int to an Integer.
// Unboxing: Automatically converting a wrapper class to its corresponding primitive type. For example, converting an Integer to an int.
// Despite autoboxing, Java still resolves overloaded methods based on the exact parameter types provided in the method call. If both int and Integer versions 
// of a method are available, the compiler will choose the method based on the exact match of the parameter types without considering 
// autoboxing or unboxing.
       
}
}
