public class GenericClass {
    //----------------------- Generic Class -----------------------

        public static void main(String args[]) {

            //bounded types = 	you can create the objects of a generic class to have data
            //					of specific derived types ex.Number

            MyGenericClass<Integer,Integer> myInt = new MyGenericClass<>(1,9);
            MyGenericClass<Double,Double> myDouble = new MyGenericClass<>(3.14,1.01);
//            MyGenericClass<Character,Character> myChar = new MyGenericClass<>('@','$');
//            MyGenericClass<String,Character> myString = new MyGenericClass<>("Hello",'!');


            System.out.println(myInt.getValue());
            System.out.println(myDouble.getValue());
            //System.out.println(myChar.getValue());
            //System.out.println(myString.getValue());
        }
    }
    // ----------------------------------------------------------------
    class MyGenericClass <Thing extends Number, Thing2 extends Number>{

        Thing x;
        Thing2 y;

        MyGenericClass(Thing x, Thing2 y){
            this.x = x;
            this.y = y;
        }

        public Thing2 getValue() {
            return y;

        }
    }



