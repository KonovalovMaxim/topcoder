import org.junit.Test;
import static org.junit.Assert.*;

public class HockeyFaultTest {
	
	@Test(timeout=2000)
	public void test0() {
		int width = 20;
		int height = 10;
		int x = 5;
		int y = 0;
		int[] px = new int[] {15, 1, 1};
		int[] py = new int[] {5, 5, 1};
		assertEquals(2, new HockeyFault().numPlayers(width, height, x, y, px, py));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int width = 20;
		int height = 10;
		int x = 0;
		int y = 0;
		int[] px = new int[] {-5, -4, -4, -3, -3, 0, 0, 20, 20, 23, 23, 24, 24, 25};
		int[] py = new int[] {5, 2, 8, 1, 9, 0, 10, 0, 10, 1, 9, 2, 8, 5};
		assertEquals(14, new HockeyFault().numPlayers(width, height, x, y, px, py));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int width = 52;
		int height = 84;
		int x = -44;
		int y = 66;
		int[] px = new int[] {26, -33, -49, 40, -10, 47, 25, -16, -82, 7};
		int[] py = new int[] {118, 106, 128, 114, 101, 85, 142, 140, 126, 145};
		assertEquals(8, new HockeyFault().numPlayers(width, height, x, y, px, py));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int width = 24;
		int height = 100;
		int x = -61;
		int y = 71;
		int[] px = new int[] {-63, -26, -9, -113, -124, -95, -89, -55};
		int[] py = new int[] {109, 164, 91, 80, 75, 140, 116, 113};
		assertEquals(6, new HockeyFault().numPlayers(width, height, x, y, px, py));
	}
}
