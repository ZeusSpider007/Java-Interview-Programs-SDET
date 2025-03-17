package Java_Oops_Concepts;
//Hierarchical Inheritance - Multiple classes inherit from a single parent.

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

class C extends A {

    public void showC() {
        System.out.println("\nI am show C in Class C");

    }

}

public class HierarchicalInheritance {

    public static void main(String[] args) {

        C c = new C();
        c.showA();
        c.showC();

        // c does not have show B as it is not linked to the class C.

    }
}