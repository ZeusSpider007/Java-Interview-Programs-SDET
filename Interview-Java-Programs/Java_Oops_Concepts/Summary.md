# **Detailed Summary of Java OOP (Object-Oriented Programming)**

Java is an **Object-Oriented Programming (OOP)** language, which means it is based on the concept of **objects** that encapsulate data and behavior. OOP promotes modularity, reusability, and scalability in software development.

---

## **1. Core Principles of OOP in Java**

Java follows four fundamental OOP principles:

### **1.1 Encapsulation**
Encapsulation is the process of **wrapping data (fields) and methods (behaviors) into a single unit (class)** while restricting direct access to some details. It is implemented using **access modifiers** (`private`, `protected`, `public`, `default`).

#### **Example of Encapsulation**
```java
class BankAccount {
    private double balance; // Private field, cannot be accessed directly

    // Constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Public method to access private data
    public double getBalance() {
        return balance;
    }

    // Public method to modify private data
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
```

### **1.2 Inheritance**
Inheritance allows a class (**child class**) to **inherit properties and behaviors** from another class (**parent class**). It promotes code reusability and logical hierarchy.

#### **Syntax:**
```java
class Parent {
    void display() {
        System.out.println("This is the parent class");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is the child class");
    }
}

public class Test {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display(); // Inherited method
        obj.show();
    }
}
```

### **1.3 Polymorphism**
Polymorphism means **"many forms"** and allows the same method or operator to perform different functions.

#### **Method Overloading (Compile-Time Polymorphism)**
```java
class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```

#### **Method Overriding (Runtime Polymorphism)**
```java
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
```

### **1.4 Abstraction**
Abstraction is the **hiding of implementation details** while exposing only necessary functionalities.

#### **Example of Abstract Class**
```java
abstract class Vehicle {
    abstract void start(); // Abstract method
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key");
    }
}
```

#### **Example of Interface**
```java
interface Engine {
    void start();
}

class Bike implements Engine {
    public void start() {
        System.out.println("Bike starts with a self-start mechanism");
    }
}
```

---

## **Conclusion**
Java OOP provides a strong foundation for building scalable and maintainable applications. By mastering **Encapsulation, Inheritance, Polymorphism, and Abstraction**, along with concepts like Association, Aggregation, and Composition, you can write modular, efficient, and reusable Java code.
