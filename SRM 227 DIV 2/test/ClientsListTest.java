import org.junit.Test;
import static org.junit.Assert.*;

public class ClientsListTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] names = new String[] {"Joe Smith", "Brown, Sam", "Miller, Judi"};
		assertArrayEquals(new String[] { "Sam Brown",  "Judi Miller",  "Joe Smith" }, new ClientsList().dataCleanup(names));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] names = new String[] {"Campbell, Phil", "John Campbell", "Young, Warren"};
		assertArrayEquals(new String[] { "John Campbell",  "Phil Campbell",  "Warren Young" }, new ClientsList().dataCleanup(names));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] names = new String[] {"Kelly, Anthony", "Kelly Anthony", "Thompson, Jack"};
		assertArrayEquals(new String[] { "Kelly Anthony",  "Anthony Kelly",  "Jack Thompson" }, new ClientsList().dataCleanup(names));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] names = new String[] {"Trevor Alvarez", "Jackson, Walter", "Mandi Stuart",
 "Martin, Michael", "Peters, Tammy", "Richard Belmont",
 "Carl Thomas", "Ashton, Roger", "Jamie Martin"};
		assertArrayEquals(new String[] { "Trevor Alvarez",  "Roger Ashton",  "Richard Belmont",  "Walter Jackson",  "Jamie Martin",  "Michael Martin",  "Tammy Peters",  "Mandi Stuart",  "Carl Thomas" }, new ClientsList().dataCleanup(names));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String[] names = new String[] {"Banks, Cody", "Cody Banks", "Tod Wilson"};
		assertArrayEquals(new String[] { "Cody Banks",  "Cody Banks",  "Tod Wilson" }, new ClientsList().dataCleanup(names));
	}
	
	@Test(timeout=2000)
	public void test5() {
		String[] names = new String[] {"Mill, Steve", "Miller, Jane"};
		assertArrayEquals(new String[] { "Steve Mill",  "Jane Miller" }, new ClientsList().dataCleanup(names));
	}
}
