package OOPObject_oriented_programming;

public class classdemo {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("red");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());
        // System.out.println(p1.color);
        // The field Pen.color is not visible
    }
}

class Pen {
    private String color;
    private int tip;

    // getter
    String getColor() {
        return color;
    }

    int getTip() {
        return tip;
    }

    // setters
    void setColor(String color) {
        this.color = color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
    // this keyword - refers to the current calling object 
}
