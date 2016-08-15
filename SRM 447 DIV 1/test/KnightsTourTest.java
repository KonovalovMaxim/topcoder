import org.junit.Test;
import static org.junit.Assert.*;

public class KnightsTourTest {
	
	@Test
	public void test0() {
		String[] board = new String[] {"........"
,".*.*...."
,".*......"
,"..K...*."
,"*...*..."
,"...*...."
,"...*.*.."
,"........"};
		assertEquals(39, new KnightsTour().visitedPositions(board));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] board = new String[] {"K......."
,"........"
,"........"
,"........"
,"........"
,"........"
,"........"
,"........"};
		assertEquals(64, new KnightsTour().visitedPositions(board));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] board = new String[] {"********"
,"*******."
,"********"
,"**.***.*"
,"********"
,"***.*.**"
,"********"
,"****K***"};
		assertEquals(3, new KnightsTour().visitedPositions(board));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] board = new String[] {"*.*....*"
,".......*"
,"**...*.."
,"..***..."
,".**.*..."
,"..*.*..K"
,"..***.*."
,"**...*.."};
		assertEquals(17, new KnightsTour().visitedPositions(board));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String[] board = new String[] {"..*...*."
,"**.....*"
,"*..*...."
,"*..*...."
,".....*.."
,"....*..K"
,"**.*...*"
,"..**...."};
		assertEquals(27, new KnightsTour().visitedPositions(board));
	}
}
