package com.wss;

import com.wss.proxy.JDK;
import com.wss.proxy.JDKImpl;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ConstructorTest bean = (ConstructorTest) context.getBean("cc");
		bean.say();

		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		//context.registerBean(AppConfig.class);
		//context.registerBean(MyBeanPostProcessor.class);
		//context.refresh();
		/*for (String a:
			 context.getBeanDefinitionNames()) {
			System.out.println(a);
		}*/

		//context.addApplicationListener();
		//context.registerBean(MyBeanPostProcessor.class);
		//context.refresh();
		/*AutowireCapableBeanFactory beanFactory = context.getAutowireCapableBeanFactory();
		System.out.println(123);*/

		/*JDK j = new JDKImpl();
		JDK proxyInstance = (JDK)Proxy.newProxyInstance(j.getClass().getClassLoader(), j.getClass().getInterfaces(), new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("前置");
				Object invoke = method.invoke(j, args);
				return invoke;
			}
		});
		proxyInstance.say();*/
	}
}
