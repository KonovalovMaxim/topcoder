import org.junit.Test;
import static org.junit.Assert.*;

public class PlaneGameTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] x = new int[] {0, 5};
		int[] y = new int[] {0, 5};
		assertEquals(2, new PlaneGame().bestShot(x, y));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] x = new int[] {0, -1, 1, 1, -1};
		int[] y = new int[] {0, -1, -1, 1, 1};
		assertEquals(5, new PlaneGame().bestShot(x, y));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] x = new int[] {0, 0, 0, 1, -1};
		int[] y = new int[] {0, 1, -1, 0, 0};
		assertEquals(5, new PlaneGame().bestShot(x, y));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] x = new int[] {0, -3, 3, 3, -3, 0, 0, 3, -3};
		int[] y = new int[] {0, -3, -3, 3, 3, 3, -3, 0, 0};
		assertEquals(5, new PlaneGame().bestShot(x, y));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] x = new int[] {0};
		int[] y = new int[] {0};
		assertEquals(1, new PlaneGame().bestShot(x, y));
	}
	
	@Test(timeout=2000)
	public void test5() {
		int[] x = new int[] {-1000000, -1, 999998, 1, -1001, 1000000, -999999, 999999, 0, 0};
		int[] y = new int[] {1000000, 1, 1000000, -1, -999, 1000000, 0, 0, -999999, 999999};
		assertEquals(5, new PlaneGame().bestShot(x, y));
	}
}
