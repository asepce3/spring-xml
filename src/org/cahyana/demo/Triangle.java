package org.cahyana.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;

public class Triangle implements InitializingBean, DisposableBean {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("Point A = (" + getPointA().getX() + ", " + getPointA().getY() + ")");
		System.out.println("Point B = (" + getPointB().getX() + ", " + getPointB().getY() + ")");
		System.out.println("Point C = (" + getPointC().getX() + ", " + getPointC().getY() + ")");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroying Triangle bean");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing Triangle bean");
	}
}
