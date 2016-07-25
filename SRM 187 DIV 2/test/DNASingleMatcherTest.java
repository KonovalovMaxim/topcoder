import org.junit.Test;
import static org.junit.Assert.*;

public class DNASingleMatcherTest {
	
	@Test(timeout=2000)
	public void test0() {
		String sequence1 = "AAAAAAAAAAAAAAAAAAAAACCCGGGGGGGGGGGGG";
		String sequence2 = "AAAACCCGGGGGGGGGGGGGGGGTTTTTTTTTGGGGGGGGGGGG";
		assertEquals(20, new DNASingleMatcher().longestMatch(sequence1, sequence2));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String sequence1 = "CAT";
		String sequence2 = "AT";
		assertEquals(2, new DNASingleMatcher().longestMatch(sequence1, sequence2));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String sequence1 = "TCTCTCTCTCTCTCTCTCTCTCTCTCTCTCTCTCTCTCTCTCTCTCTCTC";
		String sequence2 = "GAGAGGAGAAAGAGAGAGAAGAGAGGAGGAAAGAGAGAGAAAAGAGGGAA";
		assertEquals(0, new DNASingleMatcher().longestMatch(sequence1, sequence2));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String sequence1 = "ACGTACGTACGTACGTACGTACGTACGTACGTACGTACGTACGTACGTAC";
		String sequence2 = "GTACGTACGTACGTACGTACGTACGTACGTACGTACGTACGTACGTACGT";
		assertEquals(48, new DNASingleMatcher().longestMatch(sequence1, sequence2));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String sequence1 = "TC";
		String sequence2 = "CATCAT";
		assertEquals(2, new DNASingleMatcher().longestMatch(sequence1, sequence2));
	}
	
	@Test(timeout=2000)
	public void test5() {
		String sequence1 = "CGCATTAGATTCAGAG";
		String sequence2 = "CGCATGAGTAGATTC";
		assertEquals(7, new DNASingleMatcher().longestMatch(sequence1, sequence2));
	}
}
