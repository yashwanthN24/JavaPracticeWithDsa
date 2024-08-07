public class ImportantBasics {

    public static void hello1() {
        System.out.println("bebe");
    }

    public static void main(String[] a) {
        System.out.println("Hello world");
        int b = 0b101;// integer provided as binary number
        int a1 = 0xFF;// integer provided as hexadecimal number
        int b1 = 10_000_00; // _ can be added to check 0's ur adding better readability
        byte w = (byte) 129; // prints -127 overflow as datatypes are stored as a circle overflow causes to
                             // start again onto positive side

        char c = 'a';
        c++;
        System.out.println(c);
        System.out.println(b + " " + b1 + " " + w + " " + a1);

        // The c++ operation is a shorthand for c = (char) (c + 1) and ensures that the
        // result is properly cast back to char.
        int a2 = 256;
        byte k = (byte) a2; // modulus 256%256 = 0  
        // for larger values out of byte range it performs modulus with the max size of byte 1 byte = 8 bits = 2^8 = 256 
        // so k = a2%256;
        System.out.println(k);

        char c2 = 97;
        char c3 = '\u0100';

        // java char takes 16 bits so can store entire unicode 
        // unlike c/c++ which hold only 8 bits that accomodate only the ascii not the unicode 

        System.out.println(c2);
        System.out.println(c3);

        char ch[] = new char[20];
        for (char c1 : ch) {

            System.out.println(c1);
        }

        hello1();

        try {
            Class.forName("Demo");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
    
class Demo {
    int x;
    static int y;
    
    static {
        System.out.println("In static block");
        y = 10;
    }

    // static blocks are used to initialize static variables 
    
}
