import org.junit.Test;
import static org.junit.Assert.*;

public class ColoredStrokesTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] picture = new String[] {"...",
 "..."};
		assertEquals(0, new ColoredStrokes().getLeast(picture));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] picture = new String[] {"..B.",
 "..B."};
		assertEquals(1, new ColoredStrokes().getLeast(picture));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] picture = new String[] {".BB."};
		assertEquals(2, new ColoredStrokes().getLeast(picture));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] picture = new String[] {"...B..",
										 ".BRGRR",
										 ".B.B.."};
		assertEquals(3, new ColoredStrokes().getLeast(picture));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String[] picture = new String[] {"...B..",
 ".BRBRR",
 ".B.B.."};
		assertEquals(4, new ColoredStrokes().getLeast(picture));
	}
	
	@Test(timeout=2000)
	public void test5() {
		String[] picture = new String[] {"GR",
 "BG"};
		assertEquals(4, new ColoredStrokes().getLeast(picture));
	}
}
