import org.junit.Test;
import static org.junit.Assert.*;
j
public class LibraryTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] records = new String[] {"diary computers editor","fairytale gardening editor","comix cars author","comix cars librarian"};
		String[] userGroups = new String[] {"employee","editor","author"};
		String[] roomRights = new String[] {"history","cars","computers"};
		assertEquals(2, new Library().documentAccess(records, userGroups, roomRights));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] records = new String[] {"diary computers editor","fairytale gardening editor","comix cars author","comix cars librarian"};
		String[] userGroups = new String[] {"employee","editor","author","librarian"};
		String[] roomRights = new String[] {"history","cars","computers"};
		assertEquals(2, new Library().documentAccess(records, userGroups, roomRights));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] records = new String[] {"diary computers editor","fairytale gardening editor","comix cars author","comix cars librarian"};
		String[] userGroups = new String[] {"employee","editor","author","librarian"};
		String[] roomRights = new String[] {};
		assertEquals(0, new Library().documentAccess(records, userGroups, roomRights));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] records = new String[] {"a b c","a b d","b b c","b b d","e c d","e c b","e c c","t d e"};
		String[] userGroups = new String[] {"c","d","x"};
		String[] roomRights = new String[] {"a","b","c"};
		assertEquals(3, new Library().documentAccess(records, userGroups, roomRights));
	}
}
