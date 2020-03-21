package com.wss.cglib;

import com.wss.AppConfig;
import org.springframework.cglib.beans.BeanGenerator;
import org.springframework.cglib.beans.BeanMap;
import org.springframework.cglib.proxy.Enhancer;


public class Test {
	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(AppConfig.class);
		enhancer.setCallback(new MyMethodInterceptor());
		AppConfig o = (AppConfig) enhancer.create();
		o.say();


		BeanGenerator beanGenerator = new BeanGenerator();
		beanGenerator.setSuperclass(AppConfig.class);
		beanGenerator.addProperty("aaa",String.class);
		AppConfig appConfig = (AppConfig)beanGenerator.create();
		appConfig.say();

		BeanMap beanmap = BeanMap.create(new AppConfig());
		beanmap.put("key","value");
		beanmap.setBean(new AppConfig());
		System.out.println(beanmap.get("key"));

	}
}
