package com.kyungmin.exampleAnnotationAOP.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		//Spring Container 생성
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("com/kyungmin/exampleAnnotationAOP/conf/animal.xml");
		
		PetOwner petOwner = (PetOwner) context.getBean("id_petOwner");
		petOwner.play();
		
		context.close();

	}

}
