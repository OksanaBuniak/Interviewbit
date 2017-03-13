import java.util.*;

public class RotatedSortedArraySearch {

    public static int search(final List<Integer> a, int b) {

        int low = 0;
        int high = a.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midval = a.get(mid);
            int lowval = a.get(low);
            int highval = a.get(high);

            if (b == a.get(mid)) return mid;
            if (b == a.get(low)) return low;
            if (b == a.get(high)) return high;

            if (canBeOnRange(lowval, midval, b)) {
                high = mid - 1;
            } else if (canBeOnRange(midval, highval, b)) {
                low = mid + 1;
            } else {
                return -1;
            }

        }
        return -1;
    }

    private static boolean canBeOnRange(int lowVal, int highVal, int searchVal) {
        return ((searchVal < highVal && searchVal > lowVal) ||
                (searchVal < highVal && lowVal > highVal) ||
                (lowVal > highVal && searchVal > lowVal));
    }


    public static void main(String[] args) {

    }
}




            /* if (a.get(low) < a.get(high)) {
                if (b < a.get(mid) && b >= a.get(low)) {
                    high = mid - 1;
                }
                else if (b > a.get(mid) && b <= a.get(high)) {
                    low = mid + 1;
                }
                else return -1;
            }
            else  if (a.get(low) >= a.get(high)) {

                if (a.get(mid) < a.get(high) && a.get(mid) < a.get(low)) {

                    if (b < a.get(mid) && b < a.get(low) && b < a.get(high)) {
                        high = mid - 1;
                    }
                    else if (b > a.get(mid) && b < a.get(low) && b < a.get(high)) {
                        low = mid + 1;
                    }
                    else if (b > a.get(mid) && b > a.get(low) && b > a.get(high)) {
                        high = mid - 1;
                    }
                    else if (b > a.get(mid) && b < a.get(low) && b < a.get(high)) {
                        low = mid + 1;
                    }

                }
                else {

                    if (b < a.get(mid) && b > a.get(low) && b > a.get(high)) {
                        high = mid - 1;
                    }
                    else if (b < a.get(mid) && b < a.get(low) && b < a.get(high)) {
                        low = mid + 1;
                    }
                    else if (b < a.get(mid) && b < a.get(low) && b > a.get(high)) {
                        high = mid - 1;
                    }
                    else if (b > a.get(mid) && b > a.get(low) && b > a.get(high)) {
                        low = mid + 1;
                    }

                }

            } */