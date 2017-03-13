import java.util.*;

public  class Multiply {

    public static String multiply(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
        if (len1 == 0 || len2 == 0 || a == "0" || b == "0") {
            return "0";
        }

        int mult = 0;
        int buff = 0;
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = len2 - 1; i >= 0; i--) {

            for (int j = len1 - 1; j >=0; j--) {
                mult = Character.getNumericValue(b.charAt(i)) * Character.getNumericValue(a.charAt(j));
                if (mult > 9) {
                    res.add(0, (mult + buff) % 10);
                    buff = (mult + buff) / 10;
                } else {
                    mult = buff + mult;
                    buff = adder(mult, res);
                }
            }
            if (buff !=0) {
                res.add(0, buff);
                buff = 0;
            }

            int offset = len2 - 1 - i;
            if (i == len2 - 1) {
                result = res;
                res = new ArrayList<>();
            } else {
                int k = res.size() - 1;
                int l = 0;
                int size = result.size() - 1;
                int sum;
                while (k >= 0 && size - l - offset >= 0) {
                    sum = res.get(k) + result.get(size - l - offset) + buff;
                    if (sum > 9) {
                        result.set(size - l - offset, sum % 10);
                        buff = sum / 10;
                    } else {
                        result.set(size - l - offset, sum);
                        buff = 0;
                    }
                    k--;
                    l++;
                }
                while (k >= 0) {
                    sum = res.get(k) + buff;
                    buff = adder(sum, result);
                    k--;
                }
                if (buff != 0) {
                    result.add(0, buff);
                    buff = 0;
                }
                res = new ArrayList<>();
            }
        }
        String final_res = "";
        for (int i = 0; i < result.size(); i++) {
            final_res = final_res + result.get(i);
        }
        return final_res.replaceFirst("^0+(?!$)", "");
    }

    public static int adder(int compValue, ArrayList<Integer> arr) {
        int buff = 0;
        if (compValue > 9) {
            arr.add(0, compValue % 10);
            buff = compValue / 10;
        } else {
            arr.add(0, compValue);
            buff = 0;
        }
        return buff;
    }

    public static void main(String[] args) {
        String one = "99";
        String two = "99";
        System.out.println(multiply(one, two));
    }
}



// removed later

    /*if (buff > 9) {
        res.add(0, buff % 10);
        buff = buff / 10;
    } else {
        res.add(0, buff);
        buff = 0;
    } */


    /*if (sum > 9) {
        result.add(0, sum % 10);
        buff = sum / 10;
    } else {
        result.add(0, sum);
        buff = 0;
    } */


