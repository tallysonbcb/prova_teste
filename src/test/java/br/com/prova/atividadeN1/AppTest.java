package br.com.prova.atividadeN1;

import org.junit.Before;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase {

	public AppTest(String testName) {
		super(testName);
	}

	@Before
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	public void testApp() {
		assertTrue(true);
	}
	
	
}
