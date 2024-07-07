package com.example.springdi;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.springdi.config.AppConfig;
import com.example.springdi.services.D;

@SpringBootApplication
public class SpringdiApplication {
	public static void main(String[] args) {
			ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			
			D d = context.getBean(D.class);
			d.execute();
		}

}
