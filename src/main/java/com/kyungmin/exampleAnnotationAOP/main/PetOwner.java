package com.kyungmin.exampleAnnotationAOP.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PetOwner {
	
	@Autowired //wiring by type, Annotation 사용을 위해
	@Qualifier(value="qf_dog") //AnimalType의 Bean이 2개 이상이기 떄문에 이를 정확하게 구분하기 위해
	private AnimalType animal;
	
	public void play() {
		animal.sound();
	}
	
}
