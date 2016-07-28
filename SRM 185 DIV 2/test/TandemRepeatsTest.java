import org.junit.Test;
import static org.junit.Assert.*;

public class TandemRepeatsTest {
	
	@Test(timeout=2000)
	public void test0() {
		String dna = "GATCATCA";
		int k = 0;
		assertEquals(3, new TandemRepeats().maxLength(dna, k));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String dna = "GATCATGA";
		int k = 1;
		assertEquals(3, new TandemRepeats().maxLength(dna, k));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String dna = "GATCATGA";
		int k = 0;
		assertEquals(0, new TandemRepeats().maxLength(dna, k));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String dna = "AGAGAAAGAA";
		int k = 3;
		assertEquals(5, new TandemRepeats().maxLength(dna, k));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String dna = "ATTAGCATTGCACACCTTGAGGACTTAGACAAACCTAGTACACAGGTGTA";
		int k = 5;
		assertEquals(11, new TandemRepeats().maxLength(dna, k));
	}
}
