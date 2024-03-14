package Strings;

public class StringBuffer12 {
    
        public static void main(String[] args) {
            StringBuffer buffer = new StringBuffer("Hello");
            System.out.println("Original: " + buffer);
            
            buffer.append(" World");
            System.out.println("After appending: " + buffer);
            
            buffer.insert(5, " Awesome");
            System.out.println("After insertion: " + buffer);
            
            buffer.replace(6, 13, "Java");
            System.out.println("After replacement: " + buffer);
            
            buffer.delete(5, 12);
            System.out.println("After deletion: " + buffer);
        }
    }
    // string Buffers are thread safe that is no two threads can execute the String buffer methods simulatnously 
    // whereas String Builders are not thread safe 
    // String buffers are not efficient in time 
    // String Builders are most efficient in time for creating mutable Strings 