public class Factorical {

    public int findfactorical(int inputnumber) {

        int result = 1;

        for (int i = 1; i <= inputnumber; i++) {
            result = result * i;
        }

        return result;
    }

    public static void main(String[] args) {

        Factorical ff = new Factorical();
        System.out.println(ff.findfactorical(5));

    }

}
