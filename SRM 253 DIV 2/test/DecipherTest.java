import org.junit.Test;

import static org.junit.Assert.*;

public class DecipherTest {

    @Test(timeout = 2000)
    public void test0() {
        String[] encoded = new String[]{"ABBBCC"};
        String frequencyOrder = "XYZ";
		assertArrayEquals(new String[] {"ZXXXYY" }, new Decipher().decipher(encoded, frequencyOrder));
    }

    @Test(timeout = 2000)
    public void test1() {
        String[] encoded = new String[]{"RZLW"};
        String frequencyOrder = "CEFD";
        assertArrayEquals(new String[]{"EDCF"}, new Decipher().decipher(encoded, frequencyOrder));
    }

    @Test(timeout = 2000)
    public void test2() {
        String[] encoded = new String[]{"XX YYY Z YYY XX",
                "WWWWWZWWWWW"};
        String frequencyOrder = "ETMQ";
        assertArrayEquals(new String[]{"MM TTT Q TTT MM", "EEEEEQEEEEE"}, new Decipher().decipher(encoded, frequencyOrder));
    }

    @Test(timeout = 2000)
    public void test3() {
        String[] encoded = new String[]{" X ",
                "",
                " ",
                "  ",
                "   "};
        String frequencyOrder = "B";
        assertArrayEquals(new String[]{" B ", "", " ", "  ", "   "}, new Decipher().decipher(encoded, frequencyOrder));
    }

    @Test()
    public void test4() {
        String[] encoded = new String[]{"RAZVLHAR KNW CNR",
                "HEA HNFMNSAR NFAK"};
        String frequencyOrder = "EORTPNFHSCDIWG";
        assertArrayEquals(new String[]{"REGISTER NOW FOR", "THE TOPCODER OPEN"}, new Decipher().decipher(encoded, frequencyOrder));
    }
}
