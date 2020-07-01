package org.cahyana.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shape {

	private Point center;

	public Point getCenter() {
		return center;
	}

	@Autowired
	@Qualifier("tengah")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Drawing circle");
		System.out.println("Circle Point is: (" + center.getX() + ", " + center.getY() + ")");
	}

}
