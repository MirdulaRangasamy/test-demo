package com.mirdu.unit_test_demo.entity;

public class Circle {
	private float radius;
	public Circle(float radius)
	{
		this.radius = radius;
	}
	public double getArea()
	{
		return Math.PI * radius * radius;
	}
	public double getCircuference()
	{
		return 2 * Math.PI * radius;
	}
}
