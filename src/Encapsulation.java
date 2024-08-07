public class Encapsulation {

        public static void main(String[] args) {

            // Encapsulation = 	attributes of a class will be hidden or private,
            //					Can be accessed only through methods (getters & setters)
            //					You should make attributes private if you don't have a reason to make them public/protected

            Car6 car = new Car6("Chevrolet","Camaro",2021);

            car.setYear(2022);

            System.out.println(car.getMake());
            System.out.println(car.getModel());
            System.out.println(car.getYear());

        }

    }
    //***********************************************
     class Car6 {


        private String make;
        private String model;
        private int year;

        Car6(String make,String model,int year){
            this.setMake(make);
            this.setModel(model);
            this.setYear(year);
        }

        public String getMake() {
            return this.make;
        }

        public String getModel() {
            return this.model;
        }

        public int getYear() {
            return this.year;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setYear(int year) {
            this.year = year;
        }

    }

