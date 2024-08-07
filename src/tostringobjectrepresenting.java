public class tostringobjectrepresenting {

        public static void main(String[] args) {

            // toString() = special method that all objects inherit,
            //    that returns a string that "textually represents" an object.
            //    can be used both implicitly and explicitly

            Car1 car = new Car1();


//            System.out.println(car.toString());

            // or

            System.out.println(car);


        }
    }
    //***************************************
     class Car1 {


        String make = "Ford";
        String model = "Mustang";
        String color = "red";
        int year = 2021;

        public String toString() {

            return make +"\n"+model+"\n"+color+"\n"+year;

        }
    }

