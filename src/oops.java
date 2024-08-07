public class oops {


        public static void main(String[] args) {

            Car7 myCar1 = new Car7();
            Car7 myCar2 = new Car7();

            System.out.println(myCar1.make);
            System.out.println(myCar1.model);

            myCar1.drive();
            myCar1.brake();
        }
    }
    //*******************************************
     class Car7 {

        String make = "Chevrolet";
        String model = "Corvette";
        int year = 2020;
        String color = "blue";
        double price = 50000.00;

        void drive() {
            System.out.println("You drive the car");
        }
        void brake() {
            System.out.println("You step on the brakes");
        }
    }
//*******************************************

