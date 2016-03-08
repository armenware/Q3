package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import base.Triangle;

public class TriangleTest {

	public static Triangle answer;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		answer = new Triangle(6, 7, 8);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(21, answer.getPerimeter(), .2);
		assertEquals(20.33, answer.getArea(), .2);
	}

}
