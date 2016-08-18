import org.junit.Test;
import static org.junit.Assert.*;

public class BusSeatingTest {
	
	@Test(timeout=2000)
	public void test0() {
		String leftRow = "----------";
		String rightRow = "----------";
		assertEquals(4.0, new BusSeating().getArrangement(leftRow, rightRow), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test1() {
		String leftRow = "XXX-X-XX-X";
		String rightRow = "-XXXX---XX";
		assertEquals(4.0, new BusSeating().getArrangement(leftRow, rightRow), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test2() {
		String leftRow = "XXXXXXXXXX";
		String rightRow = "-XX-XX-X--";
		assertEquals(6.0, new BusSeating().getArrangement(leftRow, rightRow), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test3() {
		String leftRow =  "XXX-X-XX-X";
		String rightRow = "XXX-X-XX-X";
		assertEquals(6.82842712474619, new BusSeating().getArrangement(leftRow, rightRow), 1e-9);
	}
}
