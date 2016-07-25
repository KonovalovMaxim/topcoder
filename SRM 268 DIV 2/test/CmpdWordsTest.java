import org.junit.Test;
import static org.junit.Assert.*;

public class CmpdWordsTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] dictionary = new String[] {"am","eat","a", "meat", "hook","meathook"};
		assertEquals(2, new CmpdWords().ambiguous(dictionary));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] dictionary = new String[] {"a","b","c"};
		assertEquals(0, new CmpdWords().ambiguous(dictionary));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] dictionary = new String[] {"a","aa","aaa"};
		assertEquals(3, new CmpdWords().ambiguous(dictionary));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] dictionary = new String[] {"abc","bca","bab","a"};
		assertEquals(1, new CmpdWords().ambiguous(dictionary));
	}
}
