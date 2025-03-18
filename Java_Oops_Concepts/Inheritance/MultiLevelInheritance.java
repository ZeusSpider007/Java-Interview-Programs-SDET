package Java_Oops_Concepts.Inheritance;
//Multilevel Inheritance - A class inherits from a derived class.

class Grandparent {
    void grandparentMethod() {
        System.out.println("Grandparent method");
    }
}

class Parent extends Grandparent {
    void parentMethod() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    void childMethod() {
        System.out.println("Child method");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.grandparentMethod();
        obj.parentMethod();
        obj.childMethod();
    }
}