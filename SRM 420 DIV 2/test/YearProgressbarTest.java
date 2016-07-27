import org.junit.Test;
import static org.junit.Assert.*;

public class YearProgressbarTest {
	
	@Test(timeout=2000)
	public void test0() {
		String currentDate = "January 01, 2008 00:00";
		assertEquals(0.0, new YearProgressbar().percentage(currentDate), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test1() {
		String currentDate = "December 31, 2007 23:59";
		assertEquals(99.99980974124807, new YearProgressbar().percentage(currentDate), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test2() {
		String currentDate = "July 02, 2007 12:00";
 		assertEquals(50.0, new YearProgressbar().percentage(currentDate), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test3() {
		String currentDate = "July 02, 2008 00:00";
		assertEquals(50.0, new YearProgressbar().percentage(currentDate), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test4() {
		String currentDate = "May 10, 1981 00:31";
		assertEquals(35.348363774733635, new YearProgressbar().percentage(currentDate), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test5() {
		String currentDate = "January 31, 1900 00:47";
		assertEquals(8.228120243531203, new YearProgressbar().percentage(currentDate), 1e-9);
	}
}
