import org.junit.Test;
import static org.junit.Assert.*;

public class XBallGameTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] placeboard = new String[] {"John-DH", 
 "Jack-SP", 
 "Sam-OF", 
 "John-SP", 
 "John-RP"};
		assertArrayEquals(new String[] {"John-DH,RP,SP", "Jack-SP", "Sam-OF", "John-SP,DH,RP", "John-RP,DH,SP" }, new XBallGame().newStatistics(placeboard));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] placeboard = new String[] {"John-DH", 
 "Jack-SP", 
 "Sam-OF", 
 "John-SP", 
 "John-RP", 
 "John-RA", 
 "John-RZ", 
 "Jack-OF", 
 "Sam-SP"};
		assertArrayEquals(new String[] {"John-DH,RA,RP,RZ,SP", "Jack-SP,OF", "Sam-OF,SP", "John-SP,DH,RA,RP,RZ", "John-RP,DH,RA,RZ,SP", "John-RA,DH,RP,RZ,SP", "John-RZ,DH,RA,RP,SP", "Jack-OF,SP", "Sam-SP,OF" }, new XBallGame().newStatistics(placeboard));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] placeboard = new String[] {"PFwL-GE", "PFwL-EV","agXL-SR", "PFwL-CS", "PFwL-FE", "PFwL-MS", "agXL-VS", "agXL-AL", "PFwL-BI", "PFwL-DK", 
 "PFwL-MW", "PFwL-DS", "agXL-XJ", "agXL-PJ", "agXL-CK", "PFwL-KI", "agXL-KP", "agXL-EL", "PFwL-EA"};
		assertArrayEquals(new String[] {"PFwL-GE,BI,CS,DK,DS,EA,EV,FE,KI,MS,MW", "PFwL-EV,BI,CS,DK,DS,EA,FE,GE,KI,MS,MW", "agXL-SR,AL,CK,EL,KP,PJ,VS,XJ", "PFwL-CS,BI,DK,DS,EA,EV,FE,GE,KI,MS,MW", "PFwL-FE,BI,CS,DK,DS,EA,EV,GE,KI,MS,MW", "PFwL-MS,BI,CS,DK,DS,EA,EV,FE,GE,KI,MW", "agXL-VS,AL,CK,EL,KP,PJ,SR,XJ", "agXL-AL,CK,EL,KP,PJ,SR,VS,XJ", "PFwL-BI,CS,DK,DS,EA,EV,FE,GE,KI,MS,MW", "PFwL-DK,BI,CS,DS,EA,EV,FE,GE,KI,MS,MW", "PFwL-MW,BI,CS,DK,DS,EA,EV,FE,GE,KI,MS", "PFwL-DS,BI,CS,DK,EA,EV,FE,GE,KI,MS,MW", "agXL-XJ,AL,CK,EL,KP,PJ,SR,VS", "agXL-PJ,AL,CK,EL,KP,SR,VS,XJ", "agXL-CK,AL,EL,KP,PJ,SR,VS,XJ", "PFwL-KI,BI,CS,DK,DS,EA,EV,FE,GE,MS,MW", "agXL-KP,AL,CK,EL,PJ,SR,VS,XJ", "agXL-EL,AL,CK,KP,PJ,SR,VS,XJ", "PFwL-EA,BI,CS,DK,DS,EV,FE,GE,KI,MS,MW" }, new XBallGame().newStatistics(placeboard));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] placeboard = new String[] {"a-AA", "a-ZZ"};
		assertArrayEquals(new String[] {"a-AA,ZZ", "a-ZZ,AA" }, new XBallGame().newStatistics(placeboard));
	}
}
