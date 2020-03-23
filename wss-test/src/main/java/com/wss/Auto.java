package com.wss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("auto")
public class Auto {
	@Autowired
	ConstructorTest test;
}
