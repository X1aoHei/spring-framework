package com.wss;

import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.registerBean(AppConfig.class);
		//context.registerBean(MyBeanPostProcessor.class);
		context.refresh();

		//context.addApplicationListener();
		//context.registerBean(MyBeanPostProcessor.class);
		//context.refresh();
		AutowireCapableBeanFactory beanFactory = context.getAutowireCapableBeanFactory();
		System.out.println(123);
	}
}
