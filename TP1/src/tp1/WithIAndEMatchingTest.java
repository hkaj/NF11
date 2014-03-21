package tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class WithIAndEMatchingTest {

	public Matching matching = new WithIAndEMatching();
	
	@Test
	public void test() {
		assertTrue(matching.doesMatch("aei"));
	}
	
	

}
