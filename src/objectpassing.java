public class objectpassing {

        public static void main(String[] args) {

            Garage garage = new Garage();

            Car2 car1 = new Car2("BMW");
            Car2 car2 = new Car2("Tesla");

            garage.park(car1);
            garage.park(car2);

        }
    }
    //********************************************
     class Garage {


        void park(Car2 car) {
            System.out.println("The "+car.name+" is parked in the garage");
        }
    }//********************************************
     class Car2 {


        String name;

        Car2 (String name){
            this.name = name;
        }

    }

