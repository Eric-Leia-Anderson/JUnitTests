package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

class TestsTest {
	
	Tests testing;
	
	@BeforeEach
	void setUp(){
		testing = new Tests();
	}

	@Test
	void testAddInts() {
		assertEquals(5, testing.addInts(2, 3), "These ints don't add correctly");
	}

	@Test
	void testAddStrings() {
		String one = "Hello ";
		String two = "World!";
		assertEquals("Hello World!", testing.addStrings(one, two), "Strings don't equal 'Hello World!'");
	}

}
