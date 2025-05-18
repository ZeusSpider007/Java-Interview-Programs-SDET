import java.util.HashSet;

public class Findthepairwithagivensum {

    public void findingThegivenSum(int target, int[] array) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : array) {

            int complement = target - num;

            if (set.contains(complement)) {
                System.out.println("The Pair elements are -> " + complement + " And " + num);
                return;
            }

            set.add(num);

        }

        System.out.println("No pair found with sum " + target);

    }

    public static void main(String[] args) {

        Findthepairwithagivensum fs = new Findthepairwithagivensum();
        int target = 40;
        int[] arrayinput = { -20, 2, 60, 15, 300 };
        fs.findingThegivenSum(target, arrayinput);

    }
}
