public class test4 {
    public static void main(String[] args) {
        Vehicle obj1 = new Car();
        ((Car) obj1).print1();
    }
}

// During compile time the reference type is only know and the method is present
// or not only this much is checked by compiler
// since here we have reference type of vehicle type and we dont have print1()
// method in vehicle class we get compile time error

// So we cast the reference to car type to tell that we want to call the print1 of car class 
// remember case only when ur sure that method exists in that class 


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