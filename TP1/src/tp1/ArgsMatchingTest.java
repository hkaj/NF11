package tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArgsMatchingTest {
	protected Matching matching = new ArgsMatching();

	@Test
	public void test_empty_args_should_not_match() {
		assertFalse(matching.doesMatch("{}"));
	}
	
	@Test
	public void test_args_with_empty_arguments_should_match() {
		assertTrue(matching.doesMatch("{\"args\": []"));
	}
	
	@Test
	public void test_args_with_arguments_should_match() {
		assertTrue(matching.doesMatch("{\"args\": [10,20]"));		
	}

}
