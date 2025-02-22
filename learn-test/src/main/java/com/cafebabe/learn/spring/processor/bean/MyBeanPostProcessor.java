package com.cafebabe.learn.spring.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 *
 *
 * @author fongjx
 * @since 2021/11/21 13:43
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

	/***
	 * 3
	 */
	public MyBeanPostProcessor() {

	}

	/***
	 * 14 初始化之前的后置处理，
	 * 替换Bean对象的功能
	 * @param bean the new bean instance
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	/***
	 * 16 初始化之后的后置处理
	 *
	 * @param bean the new bean instance
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
}
