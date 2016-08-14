import org.junit.Test;
import static org.junit.Assert.*;

public class BestTriangulationTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] vertices = new String[] {"1 1", "2 3", "3 2"};
		assertEquals(1.5, new BestTriangulation().maxArea(vertices), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] vertices = new String[] {"1 1", "1 2", "3 3", "2 1"};
		assertEquals(1.5, new BestTriangulation().maxArea(vertices), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] vertices = new String[] {"1 2", "1 3", "2 4", "3 4", "4 3", "4 2", "3 1", "2 1"};
		assertEquals(3.0, new BestTriangulation().maxArea(vertices), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] vertices = new String[] {"6 2", "2 1", "1 2", "1 4", "2 6", "5 6", "6 5"};
		assertEquals(10.0, new BestTriangulation().maxArea(vertices), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test4() {
		String[] vertices = new String[] {"10000 3469", "9963 712", "9957 634", "9834 271", "9700 165",
 "9516 46", "8836 4", "1332 57", "229 628", "171 749",
 "52 1269", "30 1412", "7 4937", "35 8676", "121 9917",
 "2247 9960", "3581 9986", "6759 9995", "9486 9998", "9888 9890",
 "9914 9318", "9957 8206", "9998 6402"} ;
		assertEquals(4.8292483E7, new BestTriangulation().maxArea(vertices), 1e-9);
	}
}
