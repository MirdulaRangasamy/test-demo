package com.mirdu.unit_test_demo.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;

public class CircleTest {
	static Circle c;
	@BeforeClass
	public static void getObj()
	{
		c = new Circle(15.0f);
	}

	@Test
	public void testGetArea() {
		assertEquals((15.0*Math.PI*15.0),c.getArea(),0.0);
	}

	@Test
	public void testGetCircuference() {
		assertEquals((2*Math.PI*15.0),c.getCircuference(),0.0);
	}
}
