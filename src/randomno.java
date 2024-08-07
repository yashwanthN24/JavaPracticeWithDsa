import java.util.Random;
import static java.lang.Math.random;
public class randomno {
    public static void main(String[] args) {
        Random rd = new Random();
        int x = rd.nextInt(6) + 1 ;
        double y = rd.nextDouble()  ; // will generate a no between 0 and 1
        boolean z = rd.nextBoolean();// will generate either true or false
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        //another way to generate random numbers is using Math.random()
        //0.0 <= Math.random() < 1.0
        // + 1 add 1 to upper and lower bound
        //ex :  0 <= rnum < 11    on doing + 1
        // 1 <= rnum < 12 so 1 to 11 we get
        int rnum = (int) (random()* 11) + 1  ;
        System.out.println(rnum);

    }
}
