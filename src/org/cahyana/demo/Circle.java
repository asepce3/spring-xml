package org.cahyana.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.jws.Oneway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// otomatis dibuatkan beannya
@Component
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

	@PostConstruct
	public void init() {
		System.out.println("Initializing circle");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroying circle");
	}
}
