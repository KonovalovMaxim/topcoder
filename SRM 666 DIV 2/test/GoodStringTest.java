import org.junit.Test;
import static org.junit.Assert.*;

public class GoodStringTest {
	
	@Test(timeout=2000)
	public void test0() {
		String s = "ab";
		assertEquals("Good", new GoodString().isGood(s));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String s = "aab";
		assertEquals("Bad", new GoodString().isGood(s));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String s = "aabb";
		assertEquals("Good", new GoodString().isGood(s));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String s = "ababab";
		assertEquals("Good", new GoodString().isGood(s));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String s = "abaababababbaabbaaaabaababaabbabaaabbbbbbbb";
		assertEquals("Bad", new GoodString().isGood(s));
	}
	
	@Test(timeout=2000)
	public void test5() {
		String s = "aaaaaaaabbbaaabaaabbabababababaabbbbaabbabbbbbbabb";
		assertEquals("Good", new GoodString().isGood(s));
	}
}
