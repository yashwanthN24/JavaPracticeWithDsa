public class polymorphism {

        public static void main(String[] args) {

            // polymorphism = 	greek word for poly-"many", morph-"form"
            //					The ability of an object to identify as more than one type

            Car8 car = new Car8();
            Bicycle4 bicycle = new Bicycle4();
            Boat boat = new Boat();

            Vehicle2[] racers = {car,bicycle,boat};

            for(Vehicle2 x : racers) {
                x.go();
            }

        }
    }
    //**************************************
     class Vehicle2 {

        public void go() {
            // TODO Auto-generated method stub

        }
    }
    //**************************************
     class Car8 extends Vehicle2{


        @Override
        public void go() {
            System.out.println("*The car begins moving*");
        }
    }
    //**************************************
     class Bicycle4 extends Vehicle2{


        @Override
        public void go() {
            System.out.println("*The bicycle begins moving*");
        }
    }
    //**************************************
     class Boat extends Vehicle2{


        @Override
        public void go() {
            System.out.println("*The boat begins moving*");
        }
    }

