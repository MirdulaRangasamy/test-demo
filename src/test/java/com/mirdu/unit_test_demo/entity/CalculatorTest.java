package com.mirdu.unit_test_demo.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
	Calculator c;

	@Before
	public void setUp() throws Exception {
		c = new Calculator();
		System.out.println("Inside Setup");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Inside teardown");
	}

	@Test
	public void testAdd() {
		assertEquals(5, c.add(2, 3));
	}

	@Test
	public void testSub() {
		assertEquals(8, c.sub(12, 4));
	}

	@Test
	public void testMul() {
		assertEquals(6, c.mul(2, 3));
	}

	@Test
	public void testDiv() {
		assertEquals(5, c.div(15, 3));
	}
	
	@Ignore
	@Test
	public void testDiv1() {
		fail("HI");
	}
}
