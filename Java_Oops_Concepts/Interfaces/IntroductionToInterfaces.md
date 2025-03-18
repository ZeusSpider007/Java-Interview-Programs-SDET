# **Java Interfaces**

## **Introduction**
An interface in Java is a **blueprint for a class** that defines a set of abstract methods but does not provide their implementations.

- Interfaces are used to achieve **100% abstraction** (before Java 8).
- Before Java 8, interfaces could only have abstract methods (methods without a body). However, starting from Java 8  interfaces can contain:
    Default Methods → Methods with a default implementation using the default keyword.
    Static Methods → Methods with a body that belong to the interface itself.
- A class **implements** an interface to define specific behavior.
- Interfaces allow **multiple inheritance**, which is not possible with classes.

---

## **Rules for Writing Interfaces in Java**

1. Interfaces are declared using the `interface` keyword.
2. All methods in an interface are **public** and **abstract** by default.
3. All variables in an interface are **public, static, and final** by default.
4. Interfaces **do not have constructors** since they cannot store state.
5. A class **implements** an interface using the `implements` keyword.
6. A class can **implement multiple interfaces**, allowing multiple inheritance.
7. An interface can **extend** another interface using the `extends` keyword.
8. Interfaces **cannot extend classes**, but an interface can extend multiple other interfaces.
9. From **Java 8** onward, interfaces can have **default and static methods** with concrete implementations.
10. A class that **implements an interface must override all its abstract methods**, unless the class itself is abstract.

---

## **How Classes and Interfaces Interact**

### **Class and Class Relationship (`extends`)**
- A class can **extend** another class using `extends`.
- A class can **only extend one class** (single inheritance).

### **Class and Interface Relationship (`implements`)**
- A class **implements** an interface using the `implements` keyword.
- A class can **implement multiple interfaces** to inherit multiple behaviors.

### **Interface and Interface Relationship (`extends`)**
- An interface can **extend** another interface using `extends`.
- Unlike classes, an **interface can extend multiple interfaces**.

---
