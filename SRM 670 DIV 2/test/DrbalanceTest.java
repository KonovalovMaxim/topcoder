import org.junit.Test;
import static org.junit.Assert.*;

public class DrbalanceTest {
	
	@Test(timeout=2000)
	public void test0() {
		String s = "---";
		int k = 1;
		assertEquals(1, new Drbalance().lesscng(s, k));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String s = "+-+-";
		int k = 0;
		assertEquals(0, new Drbalance().lesscng(s, k));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String s = "-+-+---";
		int k = 2;
		assertEquals(1, new Drbalance().lesscng(s, k));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String s = "-------++";
		int k = 3;
		assertEquals(3, new Drbalance().lesscng(s, k));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String s = "-+--+--+--++++----+";
		int k = 3;
		assertEquals(2, new Drbalance().lesscng(s, k));
	}

	@Test(timeout=2000)
	public void test5() {
		String s = "-----+-----+--++---+---++---+--+----+-+---";
		int k = 22;
		assertEquals(6, new Drbalance().lesscng(s, k));
	}

	@Test(timeout=2000)
	public void test6() {
		String s = "-----+-----+--++---+---++---+--+----+-+---";
		System.out.println(new Drbalance().getNegativity(s));
	}
}
