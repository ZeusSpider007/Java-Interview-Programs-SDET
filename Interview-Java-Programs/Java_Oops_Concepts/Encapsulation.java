package Java_Oops_Concepts;
/*Encapsulation is the process of wrapping data (fields) and methods (behaviors) into a single unit (class) 
while restricting direct access to some details. 
It is implemented using access modifiers (private, protected, public, default).*/

class Person {

    private String name;

    public String getPerson() {
        return name;
    }

    public void setPerson(String name) {
        this.name = name;
    }

}

public class Encapsulation {

    public static void main(String[] args) {

        Person p = new Person();
        p.setPerson("Nayan");
        String PersonName = p.getPerson();
        System.out.println();
        System.out.println(PersonName);
    }
}
