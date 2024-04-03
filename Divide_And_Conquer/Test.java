package Divide_And_Conquer;

public class Test {
    public static void main(String[] args) {

        /*
         * Sure! Let's break down the concept of shifting bits in Java using 33-bit left shift as an example:
        
        In Java, the << operator is used for left shift. It shifts the bits of a number to the left by a specified number of positions. Each position shifted to the left effectively doubles the value because it's like multiplying by 2.
        
        However, when you try to shift bits by more than the number of bits available for the data type, Java handles it differently depending on the data type:
        
        For integers (int): Java considers only the least significant 5 bits (the lower 5 bits) of the right operand (i.e., the number of bits to shift by). If the right operand is greater than or equal to 32 (the number of bits in an int),
        
        then only the lower 5 bits (i.e., the remainder of the right operand when divided by 32) are considered. This is known as modulo 32 operation. Therefore, shifting an int by 33 bits is equivalent to shifting it by (33 % 32) = 1 bit.
        
        For long integers (long): Java considers only the least significant 6 bits (the lower 6 bits) of the right operand (i.e., the number of bits to shift by). If the right operand is greater than or equal to 64 (the number of bits in a long), 
        
        then only the lower 6 bits (i.e., the remainder of the right operand when divided by 64) are considered. This is known as modulo 64 operation.
        
        So, in the case of 1 << 33, because 33 is greater than or equal to 32, Java considers only the least significant 5 bits of 33, which is 1. Therefore, it effectively becomes 1 << 1, which is 2.
        
        This behavior is designed to prevent unintended consequences of shifting bits by more than the available number of bits in the data type, ensuring predictable and consistent results.
         * 
         * 
         */
        System.out.println(Integer.MAX_VALUE + 1 );
        System.out.println(Integer.MIN_VALUE -1 );
        System.out.println((1 << 33)  );  
    }
}
