import org.junit.Test;
import static org.junit.Assert.*;

public class ConglutinationTest {
	
	@Test(timeout=2000)
	public void test0() {
		String conglutination = "22";
		int expectation = 4;
		assertEquals("2+2", new Conglutination().split(conglutination, expectation));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String conglutination = "536";
		int expectation = 41;
		assertEquals("5+36", new Conglutination().split(conglutination, expectation));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String conglutination = "123456000789";
		int expectation = 1235349;
		assertEquals("1234560+00789", new Conglutination().split(conglutination, expectation));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String conglutination = "123456789";
		int expectation = 4245;
		assertEquals("", new Conglutination().split(conglutination, expectation));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String conglutination = "112";
		int expectation = 13;
		assertEquals("1+12", new Conglutination().split(conglutination, expectation));
	}
}
