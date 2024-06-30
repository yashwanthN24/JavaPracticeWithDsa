package BitManipulation;

public class Test {
    public static void main(String[] args) {

        /*
         * Sure! Let's break down the concept of shifting bits in Java using 33-bit left
         * shift as an example:
         * 
         * In Java, the << operator is used for left shift. It shifts the bits of a
         * number to the left by a specified number of positions. Each position shifted
         * to the left effectively doubles the value because it's like multiplying by 2.
         * 
         * However, when you try to shift bits by more than the number of bits available
         * for the data type, Java handles it differently depending on the data type:
         * 
         * For integers (int): Java considers only the least significant 5 bits (the
         * lower 5 bits) of the right operand (i.e., the number of bits to shift by). If
         * the right operand is greater than or equal to 32 (the number of bits in an
         * int),
         * 
         * then only the lower 5 bits (i.e., the remainder of the right operand when
         * divided by 32) are considered. This is known as modulo 32 operation.
         * Therefore, shifting an int by 33 bits is equivalent to shifting it by (33 %
         * 32) = 1 bit.
         * 
         * For long integers (long): Java considers only the least significant 6 bits
         * (the lower 6 bits) of the right operand (i.e., the number of bits to shift
         * by). If the right operand is greater than or equal to 64 (the number of bits
         * in a long),
         * 
         * then only the lower 6 bits (i.e., the remainder of the right operand when
         * divided by 64) are considered. This is known as modulo 64 operation.
         * 
         * So, in the case of 1 << 33, because 33 is greater than or equal to 32, Java
         * considers only the least significant 5 bits of 33, which is 1. Therefore, it
         * effectively becomes 1 << 1, which is 2.
         * 
         * This behavior is designed to prevent unintended consequences of shifting bits
         * by more than the available number of bits in the data type, ensuring
         * predictable and consistent results.
         * 
         * 
         */
        System.out.println(Integer.MAX_VALUE + 1);
        System.out.println(Integer.MIN_VALUE - 1);
        System.out.println((1 << 33));

        /*
         * 
         * The >>> operator in Java is known as the unsigned right shift operator. It
         * shifts the bits of the number to the right and fills the leftmost bits with
         * zeros, regardless of the sign of the original number.
         * 
         * This is different from the >> operator, which is the signed right shift
         * operator and fills the
         * leftmost bits with the sign bit (0 for positive numbers and 1 for negative
         * numbers).
         * 
         * Understanding >>> with Examples
         * Let's break down how >>> works with some examples:
         * 
         * Example 1: Positive Number
         * int number = 8; // Binary representation: 0000 1000
         * int shifted = number >>> 2; // Shift right by 2 positions
         * 
         * Original number in binary: 0000 1000 (which is 8 in decimal).
         * After shifting 2 positions to the right: 0000 0010.
         * Decimal value of 0000 0010 is 2.
         * So, shifted will have the value 2.
         * 
         * 
         * Example 2: Negative Number
         * int number = -8; // Binary representation: 1111 1000 (in 32-bit signed integer)
           int shifted = number >>> 2; // Shift right by 2 positions
        
         * Original number in binary: 1111 1000 (which represents -8 in a 32-bit signed
         * integer).
         * After shifting 2 positions to the right and filling leftmost bits with 0:
         * 0011 1110.
         * This results in a large positive number because the sign bit becomes 0, and
         * the leftmost bits are filled with 0s, not 1s.
         * The exact value depends on the remaining bits, but it's significantly larger
         * than the original negative number.
         * 
         * Example 3: Shifting a Large Number
         * int number = 1024; // Binary representation: 0000 0100 0000 0000
           int shifted = number >>> 10; // Shift right by 10 positions
        
         * Original number in binary: 0000 0100 0000 0000 (which is 1024 in decimal).
         * After shifting 10 positions to the right: 0000 0000 0000 0001.
         * Decimal value of 0000 0000 0000 0001 is 1.
         * So, shifted will have the value 1.
         * 
         * 
         * Key Points
         * The >>> operator is used for unsigned right shift operations.
         * 
         * It always fills the leftmost bits with 0s, making it useful for creating
         * unsigned numbers from a signed integer.
         * 
         * This operator does not consider the sign of the original number, making it
         * particularly useful for dealing with binary data or algorithms that require
         * unsigned arithmetic operations.
         * 
         * Understanding the >>> operator is crucial for manipulating bits in Java,
         * especially in contexts like cryptography, compression algorithms, or when
         * working directly with binary data.
         */
    }

}
