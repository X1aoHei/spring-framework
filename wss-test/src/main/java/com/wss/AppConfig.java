package com.wss;

import com.wss.selectors.D1;
import com.wss.selectors.MyImportSelector;
import com.wss.selectors.d2;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.wss")
@PropertySource("classpath:application.properties")
@Import(MyImportSelector.class)
public class AppConfig {

}
