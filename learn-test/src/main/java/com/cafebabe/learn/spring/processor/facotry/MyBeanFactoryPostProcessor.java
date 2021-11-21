package com.cafebabe.learn.spring.processor.facotry;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author fongjx
 * @since 2021/11/21 13:58
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	/***
	 * 2
	 */
	public MyBeanFactoryPostProcessor() {

	}

	/***
	 * 2.1
	 * @param beanFactory the bean factory used by the application context
	 * @throws BeansException
	 */
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

	}
}
