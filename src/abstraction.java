public class abstraction {



        public static void main(String[] args) {

            // abstract =  	abstract classes cannot be instantiated, but they can have a subclass
            //				abstract methods are declared without an implementation

            //Vehicle vehicle = new Vehicle();
            Car5 car = new Car5();

            car.go();
        }
    }
    //****************************************
    abstract class Vehicle1 {

        abstract void go();
    }
    //****************************************
     class Car5 extends Vehicle1{

        @Override
        void go() {
            System.out.println("The driver is driving the car");

        }
    }

