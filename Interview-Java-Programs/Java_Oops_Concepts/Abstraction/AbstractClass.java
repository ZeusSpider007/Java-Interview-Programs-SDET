package Java_Oops_Concepts.Abstraction;

//abstract class
abstract class Calculator {

    // abstract method - any child class which is inherting the abstract class
    // calculator should implement this method Multiple or there will be error in compilation.
    abstract int Multiply(int a, int b);

    // concrete method
    public int Add(int a, int b) {

        return a + b;

    }

}

class AdvancedCalculator extends Calculator {

    public int Multiply(int a, int b) {
        return a * b;
    }
}

public class AbstractClass {

    public static void main(String[] args) {

        AdvancedCalculator ac = new AdvancedCalculator();
        System.out.println("\n Addition is => " + ac.Add(5, 5));
        System.out.println("\n Multiplication is => " + ac.Multiply(5, 5));
    }
}
