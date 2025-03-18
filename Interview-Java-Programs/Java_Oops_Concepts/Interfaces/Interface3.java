package Java_Oops_Concepts.Interfaces;

interface brake {

    void braking();
}

// clutch is extending the brake interface
interface clutch extends brake {

    void clutching();

}

// as car is implementing clutch and clutch is extending brake, we need to make
// sure that all the methods in the car class are presnet which are in both the
// iterfaces.

class car implements clutch {

    @Override
    public void braking() {

        System.out.println("Brake applied");
    }

    @Override
    public void clutching() {

        System.out.println("clutch working");
    }

}

public class Interface3 {

    public static void main(String[] args) {

        car c = new car();
        c.braking();
        c.clutching();

    }

}
