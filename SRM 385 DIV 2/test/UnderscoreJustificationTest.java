import org.junit.Test;

import static org.junit.Assert.*;

public class UnderscoreJustificationTest {

    @Test(timeout = 2000)
    public void test0() {
        String[] words = new String[]{"A", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        int width = 50;
        assertEquals("A___quick__brown__fox__jumps__over__the__lazy__dog", new UnderscoreJustification().justifyLine(words, width));
    }

    @Test(timeout = 2000)
    public void test1() {
        String[] words = new String[]{"Alpha", "Beta", "Gamma", "Delta", "Epsilon"};
        int width = 32;
        assertEquals("Alpha_Beta_Gamma__Delta__Epsilon", new UnderscoreJustification().justifyLine(words, width));
    }

    @Test(timeout = 2000)
    public void test2() {
        String[] words = new String[]{"Hello", "world", "John", "said"};
        int width = 29;
        assertEquals("Hello____world___John____said", new UnderscoreJustification().justifyLine(words, width));
    }
}
