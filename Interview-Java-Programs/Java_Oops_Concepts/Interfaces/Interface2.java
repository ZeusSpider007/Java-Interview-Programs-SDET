package Java_Oops_Concepts.Interfaces;
//Java does not support multiple inheritance with classes, but it does allow multiple inheritance through interfaces.

interface canFly {

    void fly();

}

interface canSwim {

    void swim();

}

class bird implements canFly, canSwim {

    @Override
    public void fly() {
        System.out.println(" I am flying");
    }

    @Override
    public void swim() {

        System.out.println(" I am Swimming");

    }

}

public class Interface2 {

    public static void main(String[] args) {
        bird bird = new bird();
        bird.fly();
        bird.swim();

    }

}
