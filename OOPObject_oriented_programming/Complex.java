package OOPObject_oriented_programming;

public class Complex {
    int real;
    int img;

    Complex(int real, int img) {
        this.real = real;
        this.img = img;
    }

    public String toString() {
        return this.real +   " + " + this.img + "i" ;
    }

    Complex add(Complex s) {
        int real = this.real + s.real;
        int img = this.img + s.img;
        return new Complex(real, img);
    }

    Complex sub(Complex s) {
        int real = Math.max(this.real, s.real) - Math.min(this.real, s.real);
        int img = Math.max(this.img, s.img) - Math.min(this.img, s.img);
        return new Complex(real, img);
    }
    
    Complex product(Complex s) {
        int real = (this.real * s.real) - (this.img * s.img);
        int img = (this.img * s.real) + (this.real * s.img);
        return new Complex(real, img);
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(12, 5);
        System.out.println(c1);
        Complex c2 = new Complex(10, 5);
        System.out.println(c2);
        Complex c3 = c1.add(c2);
        System.out.println(c3);

        Complex c4 = c3.sub(c2);
        System.out.println(c4);

        Complex c0 = c2.product(c4);
        System.out.println(c0);
    }
}
