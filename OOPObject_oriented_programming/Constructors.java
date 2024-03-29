package OOPObject_oriented_programming;

public class Constructors {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "yash";
        System.out.println(s.name);
        s.rollno = 12;
        System.out.println(s.rollno);
        Student s1 = new Student("Virat", 18);
        System.out.println(s1.name +  " " + s1.rollno);
    }
}

class Student {
    String name;
    int rollno;

    Student() {
        System.out.println("Constructor called is default consitructor");
    }

    Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno; 
    }
}

// By default if you dont provide any constructor java provide a default constructor 
// If you provide a parameterized constructor then java doesn't provide you default constructor you must create it 
