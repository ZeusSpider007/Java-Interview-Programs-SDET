package Java_Oops_Concepts.Inheritance;

//Inheritance allows a class (child/subclass) to acquire the properties and behavior of another class (parent/superclass). This promotes code reusability.
//In single inheritance, a child class inherits from a single parent class.

class A {

    public void showA() {
        System.out.println("\nI am show A in Class A");
    }

}

class B extends A {

    public void showB() {
        System.out.println("\nI am show b in Class B");

    }

}

public class SingleInheritance {


    public static void main(String[] args) {
        
        B b = new B();
        b.showA();
        b.showB();
    }
}
