package com.cafebabe.learn.spring;

import com.cafebabe.learn.spring.bean.Animal;
import com.cafebabe.learn.spring.bean.Person;
import com.cafebabe.learn.spring.config.BeanConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fongjx
 * @since 2021/11/13 21:34
 */
public class MainTest {

	public static void main(String[] args) {
//		final ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		final Person bean = context.getBean(Person.class);
//		System.out.println(bean);

		final ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
		final Animal bean = applicationContext.getBean(Animal.class);
		System.out.println(bean);
	}
}
