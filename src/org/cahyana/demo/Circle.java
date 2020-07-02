package org.cahyana.demo;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shape {

	private Point center;

	public Point getCenter() {
		return center;
	}

	/*
	 * @Resuorce - Secara default melakukan injeksi berdasarkan nama bean
	 */
	@Resource(name = "pointB")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Drawing circle");
		System.out.println("Circle Point is: (" + center.getX() + ", " + center.getY() + ")");
	}

}
