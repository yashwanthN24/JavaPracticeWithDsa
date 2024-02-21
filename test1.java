import  java.util.Arrays;

// import java.lang.reflect.Array;
public class test1 {

    private int[] array;

    public test1(int size) {
        array = new int[size];
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    public static void main(String[] args) {
        test1 customArray = new test1(5);
        System.out.println(customArray);
    }
}


