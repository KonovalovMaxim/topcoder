import org.junit.Test;

import static org.junit.Assert.*;

public class HangmanTest {

    @Test(timeout = 2000)
    public void test0() {
        String feedback = "N-N-A";
        String[] words = new String[]{"NINJA", "NINJAS", "FLIPS", "OUT", "FRISBEE"};
        assertEquals("NINJA", new Hangman().guessWord(feedback, words));
    }

    @Test(timeout = 2000)
    public void test1() {
        String feedback = "B--B--";
        String[] words = new String[]{"BRINGS", "BARBED", "BUBBLE"};
        assertEquals("BARBED", new Hangman().guessWord(feedback, words));
    }

    @Test(timeout = 2000)
    public void test2() {
        String feedback = "---------";
        String[] words = new String[]{"MONKEY", "FORCE", "IS", "GAINING", "STRENGTH"};
        assertEquals("", new Hangman().guessWord(feedback, words));
    }

    @Test(timeout = 2000)
    public void test3() {
        String feedback = "-AAA--";
        String[] words = new String[]{"CAAABB", "BAAACC"};
        assertEquals("", new Hangman().guessWord(feedback, words));
    }

    @Test(timeout = 2000)
    public void test4() {
        String feedback = "---H-O-H-B-OPHOB--";
        String[] words = new String[]{"ROSACEA", "GYROVAGUE", "SHACONIAN", "ALTITONANT",
                "BRACHIATION", "CERCOPITHECAN", "SCOLECOPHAGOUS",
                "RESISTENTIALISM", "SLUBBERDEGULLION",
                "AICHMORHABDOPHOBIA", "SPECTOCLOACAPHOBIA",
                "ULTRACREPIDARIANISM", "HIPPOPOTOMONSTROSESQUIPEDALIAN",
                "CHARGOGGAGOGGMANCHAUGGAGOGGCHAUBUNAGUNGAMAUGG"};
        assertEquals("AICHMORHABDOPHOBIA", new Hangman().guessWord(feedback, words));
    }

    @Test
    public void test5() {
        assertFalse(new Hangman().check("BUBBLE", "B--B--"));
    }

    @Test(timeout = 2000)
    public void test6() {
        String feedback = "-B";
        String[] words = new String[]{"BB"};
        assertEquals("", new Hangman().guessWord(feedback, words));
    }
}
