import org.junit.Test;
import static org.junit.Assert.*;

public class LargestSubsequenceTest {
	
	@Test(timeout=2000)
	public void test0() {
		String s = "test";
		assertEquals("tt", new LargestSubsequence().getLargest(s));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String s = "a";
		assertEquals("a", new LargestSubsequence().getLargest(s));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String s = "example";
		assertEquals("xple", new LargestSubsequence().getLargest(s));
	}
	
	@Test()
	public void test3() {
		String s = "aquickbrownfoxjumpsoverthelazydog";
		assertEquals("zyog", new LargestSubsequence().getLargest(s));
	}
}
