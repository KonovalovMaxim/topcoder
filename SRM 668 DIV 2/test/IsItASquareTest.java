import org.junit.Test;
import static org.junit.Assert.*;

public class IsItASquareTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] x = new int[] {0, 0, 2, 2};
		int[] y = new int[] {0, 2, 0, 2};
		assertEquals("It's a square", new IsItASquare().isSquare(x, y));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] x = new int[] {0, 1, 5, 6};
		int[] y = new int[] {1, 6, 0, 5};
		assertEquals("It's a square", new IsItASquare().isSquare(x, y));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] x = new int[] {0, 0, 7, 7};
		int[] y = new int[] {0, 3, 0, 3};
		assertEquals("Not a square", new IsItASquare().isSquare(x, y));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] x = new int[] {0, 5000, 5000, 10000};
		int[] y = new int[] {5000, 0, 10000, 5000};
		assertEquals("It's a square", new IsItASquare().isSquare(x, y));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] x = new int[] {1, 2, 3, 4};
		int[] y = new int[] {4, 3, 2, 1};
		assertEquals("Not a square", new IsItASquare().isSquare(x, y));
	}
	
	@Test(timeout=2000)
	public void test5() {
		int[] x = new int[] {0, 5, 3, 8};
		int[] y = new int[] {0, 0, 4, 4};
		assertEquals("Not a square", new IsItASquare().isSquare(x, y));
	}
}
