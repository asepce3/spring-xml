package org.cahyana.demo;

public class Triangle {
	
	private String type;
	private int hight;
	
	public Triangle(String type, int hight) {
		this.type = type;
		this.hight = hight;
	}
	
	public int getHight() {
		return hight;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void draw() {
		System.out.println(getType() + " Triangle drawing of height " + getHight());
	}
}
