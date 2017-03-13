import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplyTest {

    @Test
    public void test1() {
        assertEquals("1", Multiply.multiply("1", "1"));
        assertEquals("4", Multiply.multiply("2", "2"));
        assertEquals("12", Multiply.multiply("3", "4"));
        assertEquals("81", Multiply.multiply("9", "9"));
        assertEquals("120", Multiply.multiply("12", "10"));
    }

    @Test
    public void test2() {
        assertEquals("9801", Multiply.multiply("99", "99"));
    }

    @Test
    public void test3() {
        assertEquals("1522756", Multiply.multiply("1234", "1234"));
    }

    @Test
    public void test4() {
        assertEquals("290851027081985078955918627261751688832742312387314888842460711865148550965912482730570750031304678344564428861596637320", Multiply.multiply("5131848155574784703269632922904933776792735241197982102373370", "56675688419586288442134264892419611145485574406534291250836"));
    }
}