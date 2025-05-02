public class SwappingNumbers {
    public static void main(String[] args) {
        // Swap numbers using 3rd variable

        int a = 10;
        int b = 5;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap: a = " + a + ", b = " + b);

        // swappning without using 3rd variable - Arthematic method

        int x = 10;
        int y = 7;

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println(x);
        System.out.println(y);

    }
}
