
public class Sqrt {

    public static int sqrt(int a) {

        if (a <= 1) {
            return a;
        }
        int low = 1;
        int high = Math.min(a/2, 65535);
        int sqrt = 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a < mid * mid) {
                high = mid - 1;
            }
            else if (a > mid * mid) {
                low = mid + 1;
                sqrt = mid;
            }
            else return mid;
        }

        return sqrt;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(930675566));
    }

}
