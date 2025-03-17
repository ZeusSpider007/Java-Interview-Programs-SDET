package Java_Oops_Concepts;

//1️⃣ Multiple class inheritance is not allowed in Java because of method ambiguity (Diamond Problem).
//2️⃣ Multiple interface inheritance is allowed, as the implementing class must override conflicting methods to resolve ambiguity.
//3️⃣ Best practice: Use interfaces for multiple inheritance in Java.

class A {

    public void show(){
        System.out.println("I am show in A");
    }
}

class B {

    public void show(){
        System.out.println("I am show in B");
    }
}

/*class C extends A, B{ // ❌ Compilation Error: Java does not support multiple inheritance

}*/

//If C calls show(), should it call A's version or B's version?
//Java does not allow this ambiguity and does not support multiple inheritance with classes.

//To avoid ambiguity, use "interfaces" instead of classes:




public class MulitpleInheritance {
    
}
