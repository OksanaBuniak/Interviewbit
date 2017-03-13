import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class RotatedSortedArraySearchTest {

    @Test
    public void test1() {
        List<Integer> test = new ArrayList<>();
        test.add(0);
        test.add(1);
        test.add(2);
        test.add(3);
        assertEquals(2, RotatedSortedArraySearch.search(test, 2));
    }

    @Test
    public void test2() {
        List<Integer> test = new ArrayList<>();
        test.add(5);
        test.add(10);
        test.add(0);
        test.add(1);
        test.add(2);
        test.add(3);
        assertEquals(1, RotatedSortedArraySearch.search(test, 10));
    }

    @Test
    public void test3() {
        List<Integer> test = new ArrayList<>();

        test.add(5);
        test.add(10);
        test.add(20);
        test.add(22);
        test.add(25);
        test.add(28);
        test.add(300);
        test.add(400);
        test.add(500);
        test.add(0);
        test.add(1);
        test.add(2);
        test.add(3);
        assertEquals(7, RotatedSortedArraySearch.search(test, 400));
    }

    @Test
    public void test4() {
        List<Integer> input = Arrays.asList(9, 10, 11, 12, 14, 15, 17, 19, 24, 25, 30, 39, 40, 44, 46, 48, 51, 53, 54, 56, 59, 60, 69, 70, 73, 75, 80, 87, 88, 89, 92, 93, 97, 99, 104, 107, 109, 110, 111, 117, 123, 124, 125, 126, 127, 128, 135, 136, 137, 141, 148, 153, 154, 161, 166, 167, 169, 175, 177, 180, 181, 182, 185, 186, 189, 193, 198, 202, 1, 2, 6, 7);
        assertEquals(66, RotatedSortedArraySearch.search(input, 198));
    }

    @Test
    public void test5() {
        List<Integer> input = Arrays.asList(180, 181, 182, 183, 184, 187, 188, 189, 191, 192, 193, 194, 195, 196, 201, 202, 203, 204, 3, 4, 5, 6, 7, 8, 9, 10, 14, 16, 17, 18, 19, 23, 26, 27, 28, 29, 32, 33, 36, 37, 38, 39, 41, 42, 43, 45, 48, 51, 52, 53, 54, 56, 62, 63, 64, 67, 69, 72, 73, 75, 77, 78, 79, 83, 85, 87, 90, 91, 92, 93, 96, 98, 99, 101, 102, 104, 105, 106, 107, 108, 109, 111, 113, 115, 116, 118, 119, 120, 122, 123, 124, 126, 127, 129, 130, 135, 137, 138, 139, 143, 144, 145, 147, 149, 152, 155, 156, 160, 162, 163, 164, 166, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177);
        assertEquals(43, RotatedSortedArraySearch.search(input, 42));
    }

    @Test
    public void test6() {
        List<Integer> input = Arrays.asList(5, 7, 10, 0, 1, 3);
        assertEquals(-1, RotatedSortedArraySearch.search(input, 42));
    }

    @Test
    public void test7() {
        List<Integer> input = Arrays.asList(1, 7, 67, 133, 178);
        assertEquals(0, RotatedSortedArraySearch.search(input, 1));
    }

}