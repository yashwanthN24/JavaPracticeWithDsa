package BitManipulation;

public class SettingIthBit {
    public static int setIthBit(int n, int i) {
        // consider 10 as n , 10 in binary is 000001010 now we have to set 2 nd bit 
        // 000001010
        // 876543210
        // So we OR n with 1 << i to set the ith bit as well as retain all remaining set bits 
        return n  | (1<<i) ;

    }
    public static void main(String[] args) {
        System.out.println(setIthBit(10 , 2));
    }
}
