import java.util.*;

public class Add1 {
    public ArrayList<Integer> plusOne() {

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        int n = reader.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(reader.nextInt());
        }

        int sum = 0;

        for (int i = n-1; i >= 0; i--) {
            sum = list.get(i) + 1;
            if (sum > 9) {
                list.set(i, 0);
            } else {
                list.set(i, sum);
                break;
            }

            if (i == 0 && sum > 9) {
                list.set(i, 0);
                list.add(0, 1);
            }
        }

        Iterator<Integer> it = list.iterator();
        int i = 0;
        while (it.hasNext() && it.next() == 0) {
            ++i;
        }
        list.subList(0, i).clear();
        return list;

    }

    public static void main(String[] args) {
        /* YOUR CODE HERE */
        // read the n points from a file
        Add1 test = new Add1();
        test.plusOne();
    }

}

