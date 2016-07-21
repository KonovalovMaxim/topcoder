import org.junit.Test;
import static org.junit.Assert.*;

public class StitchTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] A = new String[] {"AAAAAA"};
		String[] B = new String[] {"JJJJJ"};
		int overlap = 4;
		assertArrayEquals(new String[] { "AACEFHJ" }, new Stitch().stitch(A, B, overlap));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] A = new String[] {"14ABCD",
 "25EFGH",
 "36IJKL"};
		String[] B = new String[] {"ABCD14",
 "EFGH25",
 "IJKL36"};
		int overlap = 4;
		assertArrayEquals(new String[] { "14ABCD14",  "25EFGH25",  "36IJKL36" }, new Stitch().stitch(A, B, overlap));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] A = new String[] {" 32ygfd",
 "3uh53G:",
 ")O83gh3"};
		String[] B = new String[] {"hsd$*(PH",
 "3G:$)(*P",
 "gh86$PBB"};
		int overlap = 3;
		assertArrayEquals(new String[] { " 32ygmd$*(PH",  "3uh53G:$)(*P",  ")O83gh76$PBB" }, new Stitch().stitch(A, B, overlap));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] A = new String[] {"A"};
		String[] B = new String[] {"A"};
		int overlap = 0;
		assertArrayEquals(new String[] { "AA" }, new Stitch().stitch(A, B, overlap));
	}
}
