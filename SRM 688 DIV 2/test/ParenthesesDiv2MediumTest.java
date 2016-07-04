import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ParenthesesDiv2MediumTest {

    @Test(timeout = 2000)
    public void test0() {
        String s = ")(";
        int[] replacement = new ParenthesesDiv2Medium().correct(s);
        String result = getReplacedString(s, replacement);
        assertTrue(isValid(result));
        assertTrue(replacement.length <= (s.length() / 2) + 1);
    }

    @Test
    public void test1() {
        String s = ")))))(((((";
        int[] replacement = new ParenthesesDiv2Medium().correct(s);
        String result = getReplacedString(s, replacement);
        assertTrue(isValid(result));
        assertTrue(replacement.length <= (s.length() / 2) + 1);
    }

    @Test(timeout = 2000)
    public void test2() {
        String s = "((()";
        int[] replacement = new ParenthesesDiv2Medium().correct(s);
        String result = getReplacedString(s, replacement);
        assertTrue(isValid(result));
        assertTrue(replacement.length <= (s.length() / 2) + 1);
    }

    @Test(timeout = 2000)
    public void test3() {
        String s = ")))(()(())))))";
        int[] replacement = new ParenthesesDiv2Medium().correct(s);
        String result = getReplacedString(s, replacement);
        assertTrue(isValid(result));
        assertTrue(replacement.length <= (s.length() / 2) + 1);
    }

    @Test(timeout = 2000)
    public void test4() {
        String s = "()()()()()()()()()()()()()";
        int[] replacement = new ParenthesesDiv2Medium().correct(s);
        String result = getReplacedString(s, replacement);
        assertTrue(isValid(result));
        assertTrue(replacement.length <= (s.length() / 2) + 1);
    }

    @Test
    public void test5() {
        String s = "((((((";
        int[] replacement = new ParenthesesDiv2Medium().correct(s);
        String result = getReplacedString(s, replacement);
        assertTrue(isValid(result));
        assertTrue(replacement.length <= (s.length() / 2) + 1);
    }

    @Test
    public void test6() {
        String s = "(((()(";
        int[] replacement = new ParenthesesDiv2Medium().correct(s);
        String result = getReplacedString(s, replacement);
        assertTrue(isValid(result));
        assertTrue(replacement.length <= (s.length() / 2) + 1);
    }

    private boolean isValid(String s) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                a++;
            } else {
                b++;
            }
            if (b > a) {
                return false;
            }
        }
        return a == b;
    }

    private String getReplacedString(String original, int[] replacement) {
        char[] characters = original.toCharArray();
        for (int i = 0; i < replacement.length; i++) {
            if (characters[replacement[i]] == ')') {
                characters[replacement[i]] = '(';
            } else {
                characters[replacement[i]] = ')';
            }
        }
        return String.valueOf(characters);
    }
}
