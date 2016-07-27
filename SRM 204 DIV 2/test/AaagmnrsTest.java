import org.junit.Test;
import static org.junit.Assert.*;

public class AaagmnrsTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] phrases = new String[] { "Aaagmnrs", "TopCoder", "anagrams", "Drop Cote" };
		assertArrayEquals(new String[] { "Aaagmnrs",  "TopCoder" }, new Aaagmnrs().anagrams(phrases));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] phrases = new String[] { "SnapDragon vs tomek", "savants groped monk", "Adam vents prongs ok" };
		assertArrayEquals(new String[] { "SnapDragon vs tomek" }, new Aaagmnrs().anagrams(phrases));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] phrases = new String[] { "Radar ghost jilts Kim", "patched hers first",
  "DEPTH FIRST SEARCH", "DIJKSTRAS ALGORITHM" };
		assertArrayEquals(new String[] { "Radar ghost jilts Kim",  "patched hers first" }, new Aaagmnrs().anagrams(phrases));
	}
}
