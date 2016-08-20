import org.junit.Test;
import static org.junit.Assert.*;

public class TheNewHouseDivTwoTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] x = new int[] {-1, 1, 0, 0};
		int[] y = new int[] {0, 0, -1, 1};
		assertEquals(1, new TheNewHouseDivTwo().count(x, y));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] x = new int[] {4, 5, 0, 8, -3, 5, 4, 7};
		int[] y = new int[] {9, -4, 2, 1, 1, 11, 0, 2};
		assertEquals(4, new TheNewHouseDivTwo().count(x, y));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] x = new int[] {4, 4, 4};
		int[] y = new int[] {7, 7, 7};
		assertEquals(0, new TheNewHouseDivTwo().count(x, y));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] x = new int[] {1, 7, 3, 4, 9, 3, 7, 1, 1, 6, 1, 6, 1, 9, 7, 9, 4, 9, 1, 4, 7, 1, 2, 5, 3, 8, 7, 7, 1};
		int[] y = new int[] {7, 2, 8, 9, 4, 3, 4, 1, 4, 1, 7, 8, 1, 1, 1, 4, 7, 1, 9, 4, 9, 1, 4, 1, 1, 1, 2, 4, 3};
		assertEquals(5, new TheNewHouseDivTwo().count(x, y));
	}
}
