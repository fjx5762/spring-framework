package com.cafebabe.learn.spring;

import com.cafebabe.learn.spring.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fongjx
 * @since 2021/11/13 21:34
 */
public class MainTest {

	public static void main(String[] args) {
		final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		final Person bean = context.getBean(Person.class);
		System.out.println(bean);
	}
}
