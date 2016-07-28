import org.junit.Test;

import static org.junit.Assert.*;

public class DrivingDirectionsTest {

    @Test(timeout = 2000)
    public void test0() {
        String[] directions = new String[]{"Start on Pirate Street",
                "Turn LEFT on Viking Avenue",
                "Turn RIGHT on Ninja Court"};
        String[] result = new DrivingDirections().reverse(directions);
        assertArrayEquals(new String[]{"Start on Ninja Court", "Turn LEFT on Viking Avenue", "Turn RIGHT on Pirate Street"}, result);
    }

    @Test(timeout = 2000)
    public void test1() {
        String[] directions = new String[]{"Start on planet Earth"};
        assertArrayEquals(new String[]{"Start on planet Earth"}, new DrivingDirections().reverse(directions));
    }

    @Test(timeout = 2000)
    public void test2() {
        String[] directions = new String[]{"Start on Hebron Ave",
                "Turn RIGHT on CT-2",
                "Turn LEFT on I-84",
                "Turn LEFT on I-81",
                "Turn RIGHT on I-80",
                "Turn LEFT on I-680",
                "Turn RIGHT on Mission Blvd",
                "Turn LEFT on I-880",
                "Turn RIGHT on Montague Expressway",
                "Turn RIGHT on Mission College Blvd"};
        String[] result = new DrivingDirections().reverse(directions);
        assertArrayEquals(new String[]{"Start on Mission College Blvd", "Turn LEFT on Montague Expressway", "Turn LEFT on I-880",
                        "Turn RIGHT on Mission Blvd", "Turn LEFT on I-680", "Turn RIGHT on I-80", "Turn LEFT on I-81",
                        "Turn RIGHT on I-84", "Turn RIGHT on CT-2", "Turn LEFT on Hebron Ave"},
                result);
    }

    @Test(timeout = 2000)
    public void test3() {
        String[] directions = new String[]{"Start on  ",
                "Turn LEFT on  0123456789 - ",
                "Turn RIGHT on  0123456789 - ",
                "Turn LEFT on                                      ",
                "Turn RIGHT on                                     ",
                "Turn LEFT on -a0b1c2d3e4f5g6h7i8j9k ",
                "Turn RIGHT on -A0B1C2D3E4F5G6H7I8J9K ",
                "Turn LEFT on -",
                "Turn RIGHT on -"};
        assertArrayEquals(new String[]{"Start on -", "Turn LEFT on -", "Turn RIGHT on -A0B1C2D3E4F5G6H7I8J9K ", "Turn LEFT on -a0b1c2d3e4f5g6h7i8j9k ", "Turn RIGHT on                                     ", "Turn LEFT on                                      ", "Turn RIGHT on  0123456789 - ", "Turn LEFT on  0123456789 - ", "Turn RIGHT on  "}, new DrivingDirections().reverse(directions));
    }

    @Test(timeout = 2000)
    public void test4() {
        String[] directions = new String[]{"Start on Duke University Rd",
                "Turn RIGHT on Swift Ave",
                "Turn LEFT on NC-147",
                "Turn LEFT on I-85",
                "Turn RIGHT on I-40",
                "Turn RIGHT on US-52",
                "Turn LEFT on I-74",
                "Turn RIGHT on I-77",
                "Turn LEFT on I-64",
                "Turn RIGHT on Martin Luther King Memorial Bridge",
                "Turn RIGHT on N 3rd St",
                "Turn LEFT on Cole St",
                "Turn LEFT on N Broadway",
                "Turn RIGHT on Convention Plz"};
        assertArrayEquals(new String[]{"Start on Convention Plz", "Turn LEFT on N Broadway", "Turn RIGHT on Cole St", "Turn RIGHT on N 3rd St", "Turn LEFT on Martin Luther King Memorial Bridge", "Turn LEFT on I-64", "Turn RIGHT on I-77", "Turn LEFT on I-74", "Turn RIGHT on US-52", "Turn LEFT on I-40", "Turn LEFT on I-85", "Turn RIGHT on NC-147", "Turn RIGHT on Swift Ave", "Turn LEFT on Duke University Rd"}, new DrivingDirections().reverse(directions));
    }

    @Test(timeout = 2000)
    public void test5() {
        String[] directions = new String[]{"Start on aaa", "Turn LEFT on Turn RIGHT on"};
        String[] result = new DrivingDirections().reverse(directions);
        assertArrayEquals(new String[]{"Start on Turn RIGHT on", "Turn RIGHT on aaa"}, result);
    }
}
