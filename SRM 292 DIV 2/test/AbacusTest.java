import org.junit.Test;
import static org.junit.Assert.*;

public class AbacusTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] original = new String[] {"ooo---oooooo",
 "---ooooooooo",
 "---ooooooooo",
 "---ooooooooo",
 "oo---ooooooo",
 "---ooooooooo"};
		int val = 5;
		assertArrayEquals(new String[] {"ooo---oooooo", "---ooooooooo", "---ooooooooo", "---ooooooooo", "o---oooooooo", "ooooo---oooo" }, new Abacus().add(original, val));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] original = new String[] {"ooo---oooooo",
 "---ooooooooo",
 "---ooooooooo",
 "---ooooooooo",
 "oo---ooooooo",
 "---ooooooooo"};
		int val = 21;
		assertArrayEquals(new String[] {"oo---ooooooo", "ooooooooo---", "ooooooooo---", "ooooooooo---", "ooooooooo---", "ooooooooo---" }, new Abacus().add(original, val));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] original = new String[] {"ooooooooo---",
 "---ooooooooo",
 "ooooooooo---",
 "---ooooooooo",
 "oo---ooooooo",
 "---ooooooooo"};
		int val = 100000;
		assertArrayEquals(new String[] {"oooooooo---o", "---ooooooooo", "ooooooooo---", "---ooooooooo", "oo---ooooooo", "---ooooooooo" }, new Abacus().add(original, val));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] original = new String[] {"o---oooooooo",
 "---ooooooooo",
 "---ooooooooo",
 "---ooooooooo",
 "---ooooooooo",
 "---ooooooooo"
};
		int val = 1;
		assertArrayEquals(new String[] {"---ooooooooo", "ooooooooo---", "ooooooooo---", "ooooooooo---", "ooooooooo---", "ooooooooo---" }, new Abacus().add(original, val));
	}
}
