import org.junit.Test;

import static org.junit.Assert.*;

public class OrderOfOperationsDiv2Test {

    @Test(timeout = 2000)
    public void test0() {
        String[] s = new String[]{
                "111",
                "001",
                "010"
        };
        assertEquals(3, new OrderOfOperationsDiv2().minTime(s));
    }

    @Test(timeout = 2000)
    public void test1() {
        String[] s = new String[]{
                "11101",
                "00111",
                "10101",
                "00000",
                "11000"
        };
        assertEquals(9, new OrderOfOperationsDiv2().minTime(s));
    }

    @Test(timeout = 2000)
    public void test2() {
        String[] s = new String[]{
                "11111111111111111111"
        };
        assertEquals(400, new OrderOfOperationsDiv2().minTime(s));
    }

    @Test(timeout = 2000)
    public void test3() {
        String[] s = new String[]{
                "1000",
                "1100",
                "1110"
        };
        assertEquals(3, new OrderOfOperationsDiv2().minTime(s));
    }

    @Test(timeout = 2000)
    public void test4() {
        String[] s = new String[]{
                "111",
                "111",
                "110",
                "100"
        };
        assertEquals(3, new OrderOfOperationsDiv2().minTime(s));
    }

    @Test(timeout = 2000)
    public void test5() {
        String[] s = new String[]{
                "10111111001000000001",
                "10000000000000000001",
                "10000000010000000001",
                "10110010000000000001",
                "10000000000000000001",
                "10001101000000000001",
                "10000000010000000001",
                "10000000000101100001",
                "10000000000000000001",
                "10000000001100000001",
                "10000000000000000001",
                "10000000000000000001",
                "10000000000001110001",
                "10000000000000000001",
                "10000000000000000001",
                "10000000010000001001",
                "10000000000000001001",
                "10000000000000000001",
                "10000000000000000011",
                "00000000000000000010"
        };
        assertEquals(32, new OrderOfOperationsDiv2().minTime(s));
    }
}
