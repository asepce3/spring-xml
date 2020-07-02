package org.cahyana.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.jws.Oneway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

// otomatis dibuatkan beannya
@Component
public class Circle implements Shape {

	private Point center;
	// mengambil MessageSource bean
	private MessageSource messageSource;

	public Point getCenter() {
		return center;
	}
	
	public MessageSource getMessageSource() {
		return messageSource;
	}
	
	@Autowired
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
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
		// menggunakan pesan dari properties
		System.out.println(messageSource.getMessage("drawing.circle", null, "Hai hai!", null));
		System.out.println(messageSource.getMessage("drawing.point", new Object[] {center.getX(), center.getY()}, "Hai hai!", null));
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
