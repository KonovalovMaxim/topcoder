import org.junit.Test;
import static org.junit.Assert.*;

public class DistinguishableSetDiv2Test {
	
	@Test(timeout=2000)
	public void test0() {
		String[] answer = new String[] {"AA","AB","CC"};
		assertEquals(2, new DistinguishableSetDiv2().count(answer));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] answer = new String[] {"XYZ","XYZ","XYZ"};
		assertEquals(0, new DistinguishableSetDiv2().count(answer));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] answer = new String[] {"AAAA","BACA","CDCE"};
		assertEquals(11, new DistinguishableSetDiv2().count(answer));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] answer = new String[] {"HGHHGUHUHI","BQHJWOSZMM","NDKSKCNXND","QOEOEIWIDS","IIQIWUNNZM"};
		assertEquals(1017, new DistinguishableSetDiv2().count(answer));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String[] answer = new String[] {"XYZ","XAB","YAC"};
		assertEquals(5, new DistinguishableSetDiv2().count(answer));
	}
}
