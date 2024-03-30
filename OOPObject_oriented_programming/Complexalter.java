package OOPObject_oriented_programming;


public class Complexalter {
    int real;
    int imag;

    public Complexalter(int r, int i) {
        real = r;
        imag = i;
    }

    public static Complexalter add(Complexalter a, Complexalter b) {
        return new Complexalter((a.real + b.real), (a.imag + b.imag));
    }

    public static Complexalter diff(Complexalter a, Complexalter b) {
        return new Complexalter((a.real - b.real), (a.imag - b.imag));
    }

    public static Complexalter product(Complexalter a, Complexalter b) {
        return new Complexalter(((a.real * b.real) - (a.imag * b.imag)), ((a.real * b.imag) + (a.imag * b.real)));
    }

    public void printComplex() {
        if (real == 0 && imag != 0) {
            System.out.println(imag + "i");
        } else if (imag == 0 && real != 0) {
            System.out.println(real);
        } else {
            System.out.println(real + "+" + imag + "i");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Complexalter c = new Complexalter(4, 5);
        Complexalter d = new Complexalter(9, 4);
        Complexalter e = Complexalter.add(c, d);
        Complexalter f = Complexalter.diff(c, d);
        Complexalter g = Complexalter.product(c, d);
        e.printComplex();
        f.printComplex();
        g.printComplex();
    }
}