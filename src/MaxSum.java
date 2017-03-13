import java.util.*;


public class MaxSum {

    public int maxSubArray(final List<Integer> a) {
        int n = a.size();
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            sum = sum + a.get(i);

            if (sum > maxSum) {
                maxSum = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        return maxSum;
    }


    public static void main(String[] args) {
        List<Integer> myCoords = new ArrayList<Integer>();
        /*myCoords.add(-1);
        myCoords.add(0);
        myCoords.add(1);
        myCoords.add(2);
        myCoords.add(-4);
        myCoords.add(5);
        myCoords.add(-7);
        myCoords.add(8);
        myCoords.add(2);
        myCoords.add(-1);
        myCoords.add(4); */
        myCoords.add(-5);
        myCoords.add(-1);
        myCoords.add(-7);
        MaxSum max = new MaxSum();
        System.out.println(max.maxSubArray(myCoords));
    }

    /*if (maxSum < 0 && a.get(i) > maxSum) {
    maxSum = a.get(i);
    sum = maxSum;
    */
}


