package init;

import Controller.APPConfig;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.File;

public class SpringBootApplicationTest {
	public static void run() {
		File base = new File(System.getProperty("java.io.tmpdir"));
		AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
		applicationContext.register(APPConfig.class);
		applicationContext.refresh();
		DispatcherServlet dispatcherServlet = new DispatcherServlet(applicationContext);

		Tomcat tomcat = new Tomcat();
		tomcat.setPort(9080);
		Context context = tomcat.addContext("/", base.getAbsolutePath());
		//这里必须为0，否则会报StandardServlet找不到
		Tomcat.addServlet(context,"wss",dispatcherServlet).setLoadOnStartup(0);
		context.addServletMappingDecoded("/","wss");
		try {
			tomcat.start();
			tomcat.getServer().await();
		} catch (LifecycleException e) {
			e.printStackTrace();
		}

	}
}
