package org.springframework.way.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.way.service.WayService;

@ComponentScan("org.springframework.way.*")
public class TestUtil {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TestUtil.class);

		WayService wayServiceBean = applicationContext.getBean(WayService.class);

		String sayHello = wayServiceBean.sayHello();

		System.out.println(sayHello);

	}
}
