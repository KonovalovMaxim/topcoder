import org.junit.Test;
import static org.junit.Assert.*;

public class BiggestRectangleEasyTest {
	
	@Test(timeout=2000)
	public void test0() {
		int N = 11;
		assertEquals(6, new BiggestRectangleEasy().findArea(N));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int N = 5;
		assertEquals(1, new BiggestRectangleEasy().findArea(N));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int N = 64;
		assertEquals(256, new BiggestRectangleEasy().findArea(N));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int N = 753;
		assertEquals(35344, new BiggestRectangleEasy().findArea(N));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int N = 7254;
		assertEquals(3288782, new BiggestRectangleEasy().findArea(N));
	}
}
