package Java_Oops_Concepts.Inheritance;

//1️⃣ Multiple class inheritance is not allowed in Java because of method ambiguity (Diamond Problem).
//2️⃣ Multiple interface inheritance is allowed, as the implementing class must override conflicting methods to resolve ambiguity.
//3️⃣ Best practice: Use interfaces for multiple inheritance in Java.

class AX {

    public void show(){
        System.out.println("I am show in A");
    }
}

class BX {

    public void show(){
        System.out.println("I am show in B");
    }
}

/*class C extends AX, BX{ // ❌ Compilation Error: Java does not support multiple inheritance

}*/

//If C calls show(), should it call A's version or B's version?
//Java does not allow this ambiguity and does not support multiple inheritance with classes.

//To avoid ambiguity, use "interfaces" instead of classes:




public class MulitpleInheritance {
    
}
