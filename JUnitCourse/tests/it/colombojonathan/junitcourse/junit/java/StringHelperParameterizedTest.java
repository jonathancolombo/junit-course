package it.colombojonathan.junitcourse.junit.java;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import it.colombojonathan.junitcourse.java.StringHelper;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

	private StringHelper helper;
	private String input;
	private String expectedOutput;

	public StringHelperParameterizedTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Collection<String[]> testConditions() {
		String expectedOutputs[][] = { { "AACD", "CD" }, { "ACD", "CD" } };
		return Arrays.asList(expectedOutputs);
	}

	@Before
	public void before() {
		helper = new StringHelper();
	}

	@Test
	public void testTruncateAInFirst2Positions() {
		String actual = helper.truncateAInFirst2Positions(input);
		String expected = expectedOutput;
		assertEquals(expected, actual);
		// expected, actual
	}

	@Test
	// metodi Test tutti VOID e PUBLIC!
	// stesso metodo ma utilizzando il refactory e inline sulle variabili
	// meglio cosi
	public void testTruncateAInFirst2Positions2() {
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
	}

	// ABCD => FALSE ABAB => TRUE AB => TRUE A => FALSE
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BaseNegativeScenario() {
		assertEquals(false, helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasePositiveScenario() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}

}
