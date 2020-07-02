package org.cahyana.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class DrawingApp {

	public static void main(String[] args) {
//		Triangle triangle = new Triangle();
		// spring.xml lokasi berada dibawah StringDemo
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
//		Triangle triangle = factory.getBean("triangle", Triangle.class);
		
		// spring.xml lokasi beradad dibawah src
		// aktifkan registerShutdownHook
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Shape triangle = (Shape) context.getBean("triangle-alias");
		triangle.draw();
		
		Shape circle = (Shape) context.getBean("circle");
		circle.draw();
	}

}
