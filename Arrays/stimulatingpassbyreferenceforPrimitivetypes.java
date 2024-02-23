package Arrays;

public class stimulatingpassbyreferenceforPrimitivetypes {
    public static void update(IntWrapper change) {
        change.value = 3;
    }

    public static void main(String[] args) {
        IntWrapper unchangeable = new IntWrapper(5);
        // because Integer wrapper classes also are immutable so we create our own mutable Wrapper class
        // To stimulate call by reference for primitive types 
        //IntWrapper is a user defined class not the one given by java 
        update(unchangeable);
        System.out.println(unchangeable.value);
    }
}




class IntWrapper {
    int value;

    IntWrapper(int value) {
        this.value = value;
    }
}

    