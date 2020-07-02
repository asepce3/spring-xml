package org.cahyana.demo;

import org.springframework.context.ApplicationEvent;

public class DrawEvent extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DrawEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Draw event occured";
	}

}
