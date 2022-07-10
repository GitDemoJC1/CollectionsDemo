package com.jc.collectiopredefindeclassesDemo;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) {
		Properties p=new Properties();
		p.setProperty("Name", "chaitu");
		p.setProperty("age", "25");
		
		/*
		 * System.out.println(p.getProperty("Name"));
		 * System.out.println(p.getProperty("course"));
		 */
		Enumeration<Object> elements = p.elements();
		while (elements.hasMoreElements()) {
			Object object = (Object) elements.nextElement();
			System.out.println(object);
			
		}
		
	}

}
