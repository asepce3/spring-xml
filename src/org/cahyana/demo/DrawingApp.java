package org.cahyana.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
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
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = context.getBean("triangle-alias", Triangle.class);
		triangle.draw();
	}

}
