package BitManipulation;

public class Binaryonescomplement {
    public static void main(String[] args) {
        System.out.println(~1);
        // after ones complement we get negative number as the msb bit is 1 indicating
        // negative
        // as modern computer follows 2's complement represenatation of binary numbers
        // 00000001 -> 11111110 MSB bit value is -128 and rest all add up to 126 so =128
        // + 126 = -2
        // hence the result of ~1 is -2 as it follow 2's complement representation

    }
}
