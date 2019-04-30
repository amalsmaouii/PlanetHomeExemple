package ph.smoke;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import ph.smoke.Program;

@Test (groups = {"requirementEntityKey:EXE-RQ-1", "testEntityKey:EXE-TC-2" }, suiteName  =  " Regression ")
public class ProgramTest {

	@Test
	public void createMessageTest() {
		assertEquals("Hello World", Program.createMessage());
	}

	@Test
	public void IsOver16() {
		assertTrue(Program.getAge() > 16);

	}

	@Test
	public void testConcat() {
		Program myConcat = new Program();
		String result = myConcat.concat("Hello", "World");
		assertEquals("HelloWorld", result);
	}
}