import org.junit.Test;
import static org.junit.Assert.*;

public class ArcheryTest {
	
	@Test(timeout=2000)
	public void test0() {
		int N = 1;
		int[] ringPoints = new int[] {10, 0};
		assertEquals(2.5, new Archery().expectedPoints(N, ringPoints), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test1() {
		int N = 3;
		int[] ringPoints = new int[] {1, 1, 1, 1};
		assertEquals(1.0, new Archery().expectedPoints(N, ringPoints), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test2() {
		int N = 4;
		int[] ringPoints = new int[] {100, 0, 100, 0, 100};
		assertEquals(60.0, new Archery().expectedPoints(N, ringPoints), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test3() {
		int N = 9;
		int[] ringPoints = new int[] {69, 50, 79, 16, 52, 71, 17, 96, 56, 32};
		assertEquals(51.96, new Archery().expectedPoints(N, ringPoints), 1e-9);
	}
}
