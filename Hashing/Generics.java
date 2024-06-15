// Generics in Java are a feature that allows you to write code that can operate
// on objects of various types while providing compile-time type safety. It's
// like creating a template for a class, method, or interface where the exact
// type of the class (or the type of the parameters to a method) can be
// specified later, at the time of use. This concept helps in reusing the same
// code with different inputs types, ensuring type safety and reducing bugs
// without causing any performance overhead at runtime.

// Why Use Generics?
// Type Safety: Generics make errors easier to detect at compile time, rather
// than at runtime.
// Elimination of Casts: Without generics, you often have to cast objects from a
// collection, which can cause runtime errors if the object is not of the
// expected type.
// Code Reuse: You can write a method/class/interface once and use it for any
// type of objects.
// Basic Concepts of Generics
// Generic Classes
// A class that can work with any type of data is called a generic class. You
// define generic classes by adding <T> after the class name, where T is a type
// parameter that will be replaced by a real type when the class is used.

// public class Box<T> {
// private T t;

// public void set(T t) { this.t = t; }
// public T get() { return t; }
// }

// You can use this Box class with any type:

// Box<Integer> integerBox = new Box<>();
// Box<String> stringBox = new Box<>();

// Generic Methods
// Methods that can operate on objects of various types are called generic
// methods. Like generic classes, you define the type parameter within angle
// brackets.

// public class Util {
// public static <T> void print(T t) {
// System.out.println(t.toString());
// }
// }

// You can call this method with any type of argument:

// Util.print("Hello");
// Util.print(10);

// Bounded Type Parameters
// You can restrict the types that can be used as type arguments in a
// parameterized type. For example, you can specify that a type parameter must
// extend a certain class, or implement a certain interface.

// public class Box<T extends Number> {
// private T t;

// public void set(T t) { this.t = t; }
// public T get() { return t; }
// }

// Now, Box can only be instantiated with classes that extend Number (like
// Integer, Double, etc.).

// Wildcards
// Wildcards are used in generic programming as a type argument to specify that
// any type is acceptable. The wildcard is represented by the question mark (?).

// Unbounded Wildcard: ? Used when any type is acceptable.
// Bounded Wildcard: ? extends Type Used when you want to restrict to any
// subtype of a particular type.
// Lower Bounded Wildcard: ? super Type Used when you want to restrict to any
// supertype of a particular type.
// Generics and Inheritance
// Generic types do not have the same inheritance rules as their raw types. For
// example, Box<Integer> is not a subtype of Box<Number>, even though Integer is
// a subtype of Number.

// Type Erasure
// Generics were introduced to Java in a way that allows existing non-generic
// code to continue to work. This is achieved through a process called type
// erasure, where the generic type information is removed during compilation,
// and type checks are inserted where necessary. This means that generics are
// mostly a compile-time feature and have no impact on runtime performance.

// Conclusion
// Generics add to the power of Java by allowing type-safe operations on objects
// of various types while providing compile-time safety and avoiding the need
// for casts. They are a fundamental concept that helps in writing flexible,
// reusable, and error-free code.
