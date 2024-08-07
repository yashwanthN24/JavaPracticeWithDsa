public class javainterface {


        public static void main(String[] args) {

            Fish fish = new Fish();

            fish.hunt();
            fish.flee();

        }
    }
    //********************************************
     interface Prey {

        void flee();
    }
    //********************************************
     interface Predator {

        void hunt();
    }
    //********************************************
     class Rabbit implements Prey{


        @Override
        public void flee() {
            System.out.println("*The rabbit is fleeing*");

        }
    }
    //********************************************
     class Hawk implements Predator{


        @Override
        public void hunt() {
            System.out.println("*The hawk is hunting*");

        }
    }
    //********************************************
     class Fish implements Prey,Predator{


        @Override
        public void hunt() {
            System.out.println("*The fish is hunting*");

        }

        @Override
        public void flee() {
            System.out.println("*The fish is fleeing*");

        }
    }
//********************************************

