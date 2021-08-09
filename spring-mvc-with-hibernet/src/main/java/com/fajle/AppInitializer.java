package com.fajle;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.fajle.config.RootConfig;
import com.fajle.config.WebMvcConfig;





public class AppInitializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext rootContex = new AnnotationConfigWebApplicationContext();
//		rootContex.scan("com.fajle");
		rootContex.register(RootConfig.class);
		rootContex.refresh();
		servletContext.addListener(new ContextLoaderListener(rootContex));
		AnnotationConfigWebApplicationContext servletRegisterer = new AnnotationConfigWebApplicationContext();
//		servletRegisterer.scan("com.fajle");
		servletRegisterer.register(WebMvcConfig.class);
		ServletRegistration.Dynamic registration = servletContext.addServlet("servlet",
				new DispatcherServlet(servletRegisterer));

		registration.setLoadOnStartup(1);
		registration.addMapping("/");
		
	}

}
