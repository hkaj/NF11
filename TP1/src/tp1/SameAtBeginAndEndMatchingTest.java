package tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SameAtBeginAndEndMatchingTest {
	public Matching matching = new SameAtBeginAndEndMatching();

	@Test
	public void test_same_should_match() {
		assertTrue(matching.doesMatch("3232"));
		assertTrue(matching.doesMatch("3223"));
	}

}
