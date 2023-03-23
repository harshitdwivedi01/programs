public class JavaAtoZ {
    static int xq = 10; // static memeber variable

    public static void main(String[] args) {
        // Basic obj = new Basic(10, 12); // constructor overloading -> compile time
        // polymorphism
        // Basic obj1 = new Basic();
        // int result = obj.sum();
        // System.out.println(result);
        // System.out.println(JavaAtoZ.xq); // static memeber variable is called using
        // class followed by dot.
        // obj1.fun();
        // obj.fun();
        // A obj = new B(); // reference variable of parent class can hold the reference
        // of an object of his child.
        // obj.intro(); // reference var of A doesnt call the member fn of B.
        // obj.show();
        // A obj = new A();
        // System.out.println(obj.sum(1, 2));
        // System.out.println(obj.sum(1, 2, 3));
        // B obj = new B(); // When a subclass obj is created then its constructor will
        // call its parent constructor first and then call
        // its own constructor...

        // Student st1 = new Student(); // Normal class inheriting abstract class;
        // st1.setName("Harshit");
        // System.out.println(st1.getName());

        // Car c = new uniqueCar(); // we can create reference variable of interface
        // type and can access only those
        // // member fn which are defined inside the interface.
        // c.someFunction();
        // c.duplicateFunction(); gives error

    }
}

interface Father {
    public void skincolor();
}

interface Mother {
    public void skincolor();
}

class Child implements Father, Mother {
    
}
// interface Car {
// void someFunction(); // methods inside a interface are always public and
// abstract whereas fields
// // inside an interface are always
// // static, final and public ;
// // INterfaces dont have constructors bcoz there data memebers are static and
// // final by default. so we dont initialize since they
// // are like constants...

// void mainFunction();

// }

// class uniqueCar implements Car { // if a class implements an interface then
// it must implement its abstract
// // methods inside its body.
// public void someFunction() {
// System.out.println("Some Function here...");
// }

// public void mainFunction() {
// System.out.println("Main function from interface Car is here...");

// }

// public void duplicateFunction() {
// System.out.println("Duplicate function called");
// }
// }

// abstract class person { // abstract class cant be instantiated... // abstract
// class member
// fields are
// public nd abstract
// In an abstract class, there may or may be abstract methods. Abstract
// methods
// dont have their definition. If a class have abstract
// methods then that class must be abstract.
// Abstract classes do have constructors-> since we cannot create its objects
// but we can inherit them so when its subclass creates
// its objects so it will call its parent constructor as well.
// private int age;
// public String name;

// public void setAge(int age) {
// this.age = age;
// }

// public void setName(String name) {
// this.name = name;
// }

// int getAge() {
// return this.age;
// }

// String getName() {
// return this.name;
// }

// abstract void show(); // this is a abstract method followed by a comma. It

// // doesnt have body.

// }

// class Student extends person { // if a class inherits properties from an
// // abstract superclass then the subclass
// // must be abstract
// // or else it should specify the definition of abstract method of parent
// class.

// void show() {
// System.out.println("Show function called");
// }
// }

// class A {
// A() {
// System.out.println("A constructor called");
// }

// public void show() {
// System.out.print("Show function called");
// }

// public int sum(int a, int b) { // method overloading -> example of compile
// // time polymorphism
// return a + b;
// }

// public int sum(int a, int b, int c) {
// return a + b + c;
// }
// }

// class B extends A {
// B() {
// System.out.println("B constructor called");
// }

// @Override
// public void show() { // method overriding is example of runtime polymorphism
// System.out.println("B called show");
// }

// public void intro() {
// System.out.println("intro function called");
// }
// }

// class Basic {
// public int x;
// public int y;

// Basic(int x, int y) {
// this.x = x;
// this.y = y;
// }

// Basic() {

// }

// public int sum() { // instance member function
// return x + y;
// }

// public void fun() {
// System.out.println("Normal function called");
// }
// }