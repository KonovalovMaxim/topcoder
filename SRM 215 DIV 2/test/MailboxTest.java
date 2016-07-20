import org.junit.Test;
import static org.junit.Assert.*;

public class MailboxTest {
	
	@Test(timeout=2000)
	public void test0() {
		String collection = "AAAAAAABBCCCCCDDDEEE123456789";
		String[] address = new String[] {"123C","123A","123 ADA"};
		assertEquals(0, new Mailbox().impossible(collection, address));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String collection = "ABCDEFGHIJKLMNOPRSTUVWXYZ1234567890";
		String[] address = new String[] {"2 FIRST ST"," 31 QUINCE ST", "606 BAKER"};
		assertEquals(3, new Mailbox().impossible(collection, address));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String collection = "ABCDAAST";
		String[] address = new String[] {"111 A ST", "A BAD ST", "B BAD ST"};
		assertEquals(2, new Mailbox().impossible(collection, address));
	}
}
