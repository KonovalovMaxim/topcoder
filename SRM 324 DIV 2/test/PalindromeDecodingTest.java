import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeDecodingTest {
	
	@Test(timeout=2000)
	public void test0() {
		String code = "ab";
		int[] position = new int[] {0};
		int[] length = new int[] {2};
		assertEquals("abba", new PalindromeDecoding().decode(code, position, length));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String code = "Misip";
		int[] position = new int[] {2,3,1,7};
		int[] length = new int[] {1,1,2,2};
		assertEquals("Mississippi", new PalindromeDecoding().decode(code, position, length));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String code = "XY";
		int[] position = new int[] {0, 0, 0, 0};
		int[] length = new int[] {2, 4, 8, 16};
		assertEquals("XYYXXYYXXYYXXYYXXYYXXYYXXYYXXYYX", new PalindromeDecoding().decode(code, position, length));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String code = "TC206";
		int[] position = new int[] {1,2,5};
		int[] length = new int[] {1,1,1};
		assertEquals("TCCC2006", new PalindromeDecoding().decode(code, position, length));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String code = "nodecoding";
		int[] position = new int[] {};
		int[] length = new int[] {};
		assertEquals("nodecoding", new PalindromeDecoding().decode(code, position, length));
	}
}
