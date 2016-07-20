import org.junit.Test;
import static org.junit.Assert.*;

public class IsomorphicWordsTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] words = new String[] {"abca", "zbxz", "opqr"};
		assertEquals(1, new IsomorphicWords().countPairs(words));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] words = new String[] {"aa", "ab", "bb", "cc", "cd"};
		assertEquals(4, new IsomorphicWords().countPairs(words));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] words = new String[] { "cacccdaabc", "cdcccaddbc", "dcdddbccad", "bdbbbaddcb",
  "bdbcadbbdc", "abaadcbbda", "babcdabbac", "cacdbaccad",
  "dcddabccad", "cacccbaadb", "bbcdcbcbdd", "bcbadcbbca" };
		assertEquals(13, new IsomorphicWords().countPairs(words));
	}
}
