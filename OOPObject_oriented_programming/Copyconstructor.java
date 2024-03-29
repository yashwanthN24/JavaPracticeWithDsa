package OOPObject_oriented_programming;

public class Copyconstructor {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s);
        s.name = "yash";
        s.rollno = 12;
        s.password = "Xys";
        s.marks[0] = 11;
        s.marks[1] = 12;
        s.marks[2] = 22;
        // s.marks[3] = 23;
        Student s1 = new Student(s);
        System.out.println(s1);
        s.marks[1] = 25;
        System.out.println("length : " + s1.marks.length);
        for (int i : s1.marks) {
            System.out.println(i);
        }
        System.out.println(s.name);
    }
}

class Student {
    String name;
    int rollno;
    String password;
    protected int marks[];

    Student() {
        marks = new int[3];
        System.out.println("constructor called");

    }

    // java doesn't provide copy constructor by default we have to create it
    // copy constructor is used to create a new object by copying properties of
    // other created object that is passed to copy constructor

    // Shallow Copy
    // Student(Student s1) {
    // this.name = s1.name;
    // this.rollno = s1.rollno;
    // this.marks = s1.marks;
    // }

    // Deep Copy
    Student(Student s1) {
        this.name = s1.name;
        this.rollno = s1.rollno;
        marks = new int[3];
        for (int i = 0; i < marks.length; i++)
            this.marks[i] = s1.marks[i];
    }
}

// Destructors are not present in java instead java uses garbage collector
// which unallocated space for objects that are not references or not used
