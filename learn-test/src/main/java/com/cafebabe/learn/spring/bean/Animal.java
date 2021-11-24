package com.cafebabe.learn.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;

/**
 * @author fongjx
 * @since 2021/11/20 14:42
 */
@Component
public class Animal implements ApplicationContextAware, MessageSourceAware, InitializingBean {

	private ApplicationContext applicationContext;

	private MessageSource messageSource;

	/***
	 * 10
	 */
	Animal(){
		System.out.println("Animal Constructor");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	@Override
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	/***
	 * 15
	 * todo 怎么的场景
	 * @throws Exception
	 */
	@Override
	public void afterPropertiesSet() throws Exception {

	}
}
