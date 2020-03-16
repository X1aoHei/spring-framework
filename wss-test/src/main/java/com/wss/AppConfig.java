package com.wss;

import com.wss.selectors.MyImportSelector;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.wss")
@PropertySource("classpath:application.properties")
@Import(MyImportSelector.class)
public class AppConfig {
}
