public class test4 {
    public static void main(String[] args) {
        Vehicle obj1 = new Car();
        ((Car)obj1).print1();
    }
}

class Vehicle {
    void print() {
        System.out.println("Base class vehicle");
    }
}

class Car extends Vehicle {
    void print1() {
        System.out.println("Derieved class (Car)");
    }
}