package com.kyungmin.exampleAnnotationAOP.main;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logger { //Aspect 클래스

	//Pointcut 생성
	@Pointcut("execution(void com.kyungmin.exampleAnnotationAOP.main.*.sound())")
	private void selectSound() { //pointcut의 이름
		
	}
	
	@After("selectSound()")
	public void aboutToSound() {
		System.out.println("advice[after]: about to sound");
	}
}
