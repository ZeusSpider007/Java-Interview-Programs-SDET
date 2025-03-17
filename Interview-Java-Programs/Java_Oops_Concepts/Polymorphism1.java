package Java_Oops_Concepts;

/*Polymorphism means "many forms" and allows the same method or operator to perform different functions.

Types of Polymorphism:
1- Compile-time Polymorphism (Method Overloading)
2 - Runtime Polymorphism (Method Overriding) */

//1. Method Overloading (Compile-Time Polymorphism)
//When multiple methods in the same class have the same name but different parameters (different number or type of arguments).
//Method Overloading is a feature in Java that allows multiple methods with the same name but different parameters in the same class. The difference can be in:

//1.Number of parameters
//2.Type of parameters
//3.Order of parameters

class MathOperations {

    // function 1
    public int add(int a, int b) { // type of parameters
        return a + b;
    }

    // function 2
    public double add(double a, double b) { // type of parameters
        return a + b;
    }

    // function 3
    public int add(int a, int b, int c) { // number of parameters
        return a + b + c;
    }

    // function 4
    public double add(double a, int b) {// type of parameters

        return a + b;
    }

    // function 5
    public double add(int a, double b) {// order of parameters

        return a + b;
    }
}

public class Polymorphism1 {

    public static void main(String[] args) {

        MathOperations obj = new MathOperations();
        System.out.println(obj.add(5, 10)); // this will call the function 1
        System.out.println(obj.add(5.5, 10.5)); // this will call the function 2
        System.out.println(obj.add(1, 2, 3));// this will call the function 3
        System.out.println(obj.add(1.5, 1));// this will call the function 4
        System.out.println(obj.add(15, 1.2));// this will call the function 5
    }

}
