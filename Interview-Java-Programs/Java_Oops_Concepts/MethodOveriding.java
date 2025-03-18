package Java_Oops_Concepts;

/*Polymorphism means "many forms" and allows the same method or operator to perform different functions.

Types of Polymorphism:
1- Compile-time Polymorphism (Method Overloading)
2 - Runtime Polymorphism (Method Overriding) */

// 2- Runtime Polymorphism, also known as Method Overriding, occurs when a subclass provides a specific implementation of a method that is already defined in its superclass.
// The method in the child class must have the same name, return type, and parameters as in the parent class.
// The method that gets executed is determined at runtime, not at compile time.
// Achieved using Inheritance and Method Overriding.

class Alpha {


    public void show(){

        System.out.println("Show in Class A");
    }
}

class Beta extends Alpha {

    @Override   // Overriding the parent method
    public void show(){

        System.out.println("Show in Class B");
    }

}

public class MethodOveriding{

    public static void main(String[] args) {
        
       Beta B = new Beta();
        System.out.println("\n");
        B.show(); // Calls the overridden method in Child class

    }
}