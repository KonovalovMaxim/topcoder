import org.junit.Test;
import static org.junit.Assert.*;

public class RecursiveFiguresTest {
	
	@Test(timeout=2000)
	public void test0() {
		int sideLength = 10;
		int K = 1;
		assertEquals(78.53981633974483, new RecursiveFigures().getArea(sideLength, K), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test1() {
		int sideLength = 10;
		int K = 2;
		assertEquals(67.80972450961724, new RecursiveFigures().getArea(sideLength, K), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test2() {
		int sideLength = 10;
		int K = 3;
		assertEquals(62.444678594553444, new RecursiveFigures().getArea(sideLength, K), 1e-9);
	}
}
