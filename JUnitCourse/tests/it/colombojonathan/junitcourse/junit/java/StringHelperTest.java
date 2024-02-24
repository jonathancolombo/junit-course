package it.colombojonathan.junitcourse.junit.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.colombojonathan.junitcourse.java.StringHelper;

public class StringHelperTest {

	private StringHelper helper;

	@Before
	public void before() {
		helper = new StringHelper();
	}

	@Test
	public void testTruncateAInFirst2Positions() {
		String actual = helper.truncateAInFirst2Positions("AACD");
		String expected = "CD";
		assertEquals(expected, actual);
		// expected, actual
	}

	@Test
	// metodi Test tutti VOID e PUBLIC!
	// stesso metodo ma utilizzando il refactory e inline sulle variabili
	// meglio cosi
	public void testTruncateAInFirst2Positions2() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}

	// ABCD => FALSE ABAB => TRUE AB => TRUE A => FALSE
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BaseNegativeScenario() {
		assertEquals(false, helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		// identico solo con assertFalse
		// assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));

		// nel caso si può aggiungere un message per il caso di fallimento
		// assertFalse("Condition failed!",true);
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasePositiveScenario() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}

}
