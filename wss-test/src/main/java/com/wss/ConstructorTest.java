package com.wss;

import org.springframework.stereotype.Component;

@Component("cc")
public class ConstructorTest {
	Class<?> clazz;
	public ConstructorTest(Class<?> cc){
		this.clazz = cc;
	}

	public void say(){
		System.out.println(this.clazz.getName());
	}
}
